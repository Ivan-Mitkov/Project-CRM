package com.example.demo.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.services.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	Logger logger=LoggerFactory.getLogger(AccountController.class);
	private final AccountService accountService;
	 private static final String ACCOUNT_ACCOUNTFORM_URL = "account/accountform";
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	 @GetMapping("/account/{id}/show")
	    public String showById(@PathVariable String id, Model model){

	        model.addAttribute("account", accountService.findAccountByIdNumber(new String(id)));

	        return "account/showaccount";
	    }

	    @GetMapping("account/new")
	    public String newAccount(Model model){
	        model.addAttribute("account", new AccountBindingModel());

	        return ACCOUNT_ACCOUNTFORM_URL;
	    }

	    @GetMapping("account/{id}/update")
	    public String updateRecipe(@PathVariable String id, Model model){
	        model.addAttribute("account", accountService.findAccountByIdNumber(id));
	        return ACCOUNT_ACCOUNTFORM_URL;
	    }

	    @PostMapping("account")
	    public String saveOrUpdate(@Valid @ModelAttribute("account") AccountBindingModel command, BindingResult bindingResult){

	        if(bindingResult.hasErrors()){

	            bindingResult.getAllErrors().forEach(objectError -> {
	                logger.debug(objectError.toString());
	            });

	            return ACCOUNT_ACCOUNTFORM_URL;
	        }

	        AccountBindingModel savedCommand = accountService.saveAccountBindingModel(command);

	        return "redirect:/account/" + savedCommand.getIdNumber() + "/showaccount";
	    }

	    @GetMapping("account/{id}/delete")
	    public String deleteById(@PathVariable String id){

	        logger.debug("Deleting id: " + id);

	        accountService.deleteByIdNumber(id);
	        return "redirect:/";
	    }

	   

}
