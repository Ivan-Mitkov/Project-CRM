package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.services.AccountService;
import com.example.demo.viewmodel.AccountViewModel;

@Controller
public class AccountController {
	Logger logger = LoggerFactory.getLogger(AccountController.class);

	private final AccountService accountService;

	private static final String ACCOUNT_ACCOUNTFORM_URL = "account/accountform";

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("account/new")
	public String newAccount(Model model) {
		model.addAttribute("account", new AccountBindingModel());

		return ACCOUNT_ACCOUNTFORM_URL;
	}

	@GetMapping("account/{id}/update")
	public String updateAccount(@PathVariable String id, Model model) {
		model.addAttribute("account", accountService.findAccountByIdNumber(id));
		logger.info("Inside GET Method update account" + id);
		return ACCOUNT_ACCOUNTFORM_URL;
	}

	@PostMapping("account/{id}/update")
	public String saveOrUpdate(@Valid @ModelAttribute("account") AccountBindingModel command,
			BindingResult bindingResult) {
		logger.info("EDITED POST Method " + command.getIdNumber());
		if (bindingResult.hasErrors()) {

			bindingResult.getAllErrors().forEach(objectError -> {
				logger.info("Error: "+objectError.toString());
			});

			return ACCOUNT_ACCOUNTFORM_URL;
		}
		AccountBindingModel savedCommand = new AccountBindingModel();
		
		savedCommand = accountService.editAccountBindingModel(command);
		
		logger.info("EDITED: account id:" + savedCommand.getId());

		return "redirect:/account/show";
	}

	@GetMapping("account/{id}/delete")
	public String deleteById(@PathVariable String id) {

		logger.info("Deleting id: " + id);

		accountService.deleteByIdNumber(id);
		return "redirect:/";
	}

	@GetMapping("account/show")
	public String getAll(Model model) {
		List<AccountViewModel> accounts = accountService.findAllAccounts();
		model.addAttribute("accounts", accounts);
		logger.info("All accounts ");
		return "account/accounts";
	}

	@GetMapping("account/add")
	public String addAccount(Model model) {
		model.addAttribute("account", new AccountBindingModel());
		logger.info("Add accounts ");
		return ACCOUNT_ACCOUNTFORM_URL;
	}

}
