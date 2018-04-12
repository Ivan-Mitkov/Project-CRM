package com.example.demo.services;

import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.entities.Account;

public interface AccountService {

	Account findAccountById(Long id);
	 Optional<Account> findAccountByName(String name);
	 Optional<Account> findAccountByIdNumber(String idNumber);
	void deleteByIdNumber(String id);
	AccountBindingModel saveAccountBindingModel(AccountBindingModel command);
	AccountBindingModel findCommandByIdNumber(String idNumber);
	 

}
