package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Account;
import com.example.demo.entities.Adress;
import com.example.demo.services.AccountService;
import com.example.demo.services.AdressService;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.AdressViewModel;

@Controller
public class AccountViewController {
	private final AccountService accountService;
	
	public AccountViewController(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping("/account/{id}/showaccount")
	public String showById(@PathVariable String id, Model model) {
		AccountViewModel account = accountService.findAccountViewByIdNumber(new String(id));

		model.addAttribute("account", account);

		return "account/showaccount";
	}

//	@ModelAttribute(value="address")
//	 AdressViewModel getAddress(@PathVariable String idName) {
//		 Account account=accountService.findAccountByIdNumber(idName).get();
//		 Long id=account.getId();
//		 AdressViewModel adress=accountService.findAddressByAccountNumber(id);
//		 return null;
//	 }
}
