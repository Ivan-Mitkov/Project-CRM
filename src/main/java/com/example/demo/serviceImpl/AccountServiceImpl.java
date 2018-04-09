package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository repository;
	 
	
	 public AccountServiceImpl(AccountRepository repository) {
		this.repository = repository;
	}
	public Account findAccountById(Long id) {
		 Optional<Account> account=repository.findById(id);
		 return account.get();
	 }
	 public Optional<Account> findAccountByName(String name) {
		 Optional<Account> account=repository.findByName(name);
		 return account;
	 }
	public Optional<Account> findAccountByIdNumber(String idNumber) {
		 Optional<Account> account=repository.findByIdNumber(idNumber);
		 return account;
	}
}
