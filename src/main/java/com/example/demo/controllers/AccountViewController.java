package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Account;
import com.example.demo.services.AccountService;
import com.example.demo.services.ContactService;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.ContactViewModel;

@Controller
public class AccountViewController {
	Logger logger=LoggerFactory.getLogger(AccountViewController.class);

	private final AccountService accountService;
	private final ContactService contactService;
	
	@Autowired
	public AccountViewController(AccountService accountService, ContactService contactService) {
		this.accountService = accountService;
		this.contactService = contactService;
	}

	@GetMapping("/account/{id}/showaccount")
	public String showById(@PathVariable String id, Model model) {
		AccountViewModel account = accountService.findAccountViewByIdNumber(new String(id));

		model.addAttribute("account", account);

		return "account/showaccount";
	}

	@ModelAttribute(value="contacts")
	 List<ContactViewModel> getContacts(@PathVariable String id) {
		
		 Account account=accountService.findAccountByIdNumber(id).get();
		 Long idDB=account.getId();
		 List<ContactViewModel> contacts=new ArrayList<>();
		contacts=contactService.findAllContactsOfAnAccount( idDB);		 
		 return contacts;
	 }
}
