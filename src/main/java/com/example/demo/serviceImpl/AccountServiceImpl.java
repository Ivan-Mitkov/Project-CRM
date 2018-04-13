package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.services.AccountService;



@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountRepository repository;
	
	private final AccountBindingModelToAccount accountBindingModelToAccount;
	private final AccountToAccountBindingModel accountToAccountBindingModel;
	
	@Autowired
	 public AccountServiceImpl(AccountRepository repository, AccountBindingModelToAccount accountBindingModelToAccount,
			AccountToAccountBindingModel accountToAccountBindingModel) {
		this.repository = repository;
		this.accountBindingModelToAccount = accountBindingModelToAccount;
		this.accountToAccountBindingModel = accountToAccountBindingModel;
	}
	@Override
	public Account findAccountById(Long id) {
		 Optional<Account> account=repository.findById(id);
		 return account.get();
	 }
	@Override
	 public Optional<Account> findAccountByName(String name) {
		 Optional<Account> account=repository.findByName(name);
		 return account;
	 }
	@Override
	public Optional<Account> findAccountByIdNumber(String idNumber) {
		 Optional<Account> account=repository.findByIdNumber(idNumber);
		 return account;
	}
	@Override
	public void deleteByIdNumber(String idNumber) {
		Account account = repository.findByIdNumber(idNumber).get();
		long id =account.getId();
		repository.deleteById(id);
		
	}
	@Override
    @Transactional
    public AccountBindingModel findCommandByIdNumber(String idNumber) {
		Account account=findAccountByIdNumber(idNumber).get();
		
        return accountToAccountBindingModel.convert(account);
    }
	@Override
	@Transactional
	public AccountBindingModel saveAccountBindingModel(AccountBindingModel command) {
		Account detachedAccount=accountBindingModelToAccount.convert(command);
		Account savedAccount=repository.save(detachedAccount);
		return accountToAccountBindingModel.convert(savedAccount);
	
	}
	
}
