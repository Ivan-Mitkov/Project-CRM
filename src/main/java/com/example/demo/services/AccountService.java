package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.entities.Account;
import com.example.demo.entities.Adress;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.AdressViewModel;

public interface AccountService {

	Account findAccountById(Long id) throws Exception;

	Optional<Account> findAccountByName(String name);

	Optional<Account> findAccountByIdNumber(String name);

	AccountViewModel findAccountViewByIdNumber(String idNumber);

	void deleteByIdNumber(String id);

	AccountBindingModel saveAccountBindingModel(AccountBindingModel command);

	AccountBindingModel findAccountBindingByIdNumber(String idNumber);

	List<AccountViewModel> findAllAccounts();

	AdressViewModel findAddressByAccountIdNumber(String idNumber);

	AccountBindingModel editAccountBindingModel(@Valid AccountBindingModel command) throws Exception;

}
