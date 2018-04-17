package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountViewModel;
import com.example.demo.converters.accountConverters.AccountViewModelToAccount;
import com.example.demo.converters.adressConverters.AdressBindingModelToAdress;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressViewModel;
import com.example.demo.entities.Account;
import com.example.demo.entities.Adress;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.services.AccountService;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.AdressViewModel;



@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountRepository repository;
	
	private final AccountBindingModelToAccount accountBindingModelToAccount;
	private final AccountToAccountBindingModel accountToAccountBindingModel;
	private final AccountViewModelToAccount accountViewModelToAccount;
	private final AccountToAccountViewModel accountToAccountViewModel;
	private final AdressToAdressViewModel addressToAddressViewModel;
	private final AdressToAdressBindingModel addressToAddressBindingModel;
	private final AdressBindingModelToAdress addressBindingModelToAddress;
	@Autowired
	public AccountServiceImpl(AccountRepository repository, AccountBindingModelToAccount accountBindingModelToAccount,
			AccountToAccountBindingModel accountToAccountBindingModel,
			AccountViewModelToAccount accountViewModelToAccount, AccountToAccountViewModel accountToAccountViewModel,
			AdressToAdressViewModel addressToAddressViewModel, AdressToAdressBindingModel addressToAddressBindingModel,
			AdressBindingModelToAdress addressBindingModelToAddress) {
		this.repository = repository;
		this.accountBindingModelToAccount = accountBindingModelToAccount;
		this.accountToAccountBindingModel = accountToAccountBindingModel;
		this.accountViewModelToAccount = accountViewModelToAccount;
		this.accountToAccountViewModel = accountToAccountViewModel;
		this.addressToAddressViewModel = addressToAddressViewModel;
		this.addressToAddressBindingModel = addressToAddressBindingModel;
		this.addressBindingModelToAddress = addressBindingModelToAddress;
	}
	

	@Override
	public Account findAccountById(Long id) {
		 Optional<Account> account=repository.findById(id);
		 return account.get();
	 }
	
	@Override
    @Transactional

	 public Optional<Account> findAccountByName(String name) {
		 Optional<Account> account=repository.findByName(name);
		 return account;
	 }
	@Override
    @Transactional

	public AccountViewModel findAccountViewByIdNumber(String id) {
		 Account accountThis=repository.findByIdNumber(id).get();
		 AccountViewModel account=accountToAccountViewModel.convert(accountThis);
		 return account;
	}
	@Override
    @Transactional

	public void deleteByIdNumber(String idNumber) {
		Account account = repository.findByIdNumber(idNumber).get();
		long id =account.getId();
		repository.deleteById(id);
		
	}
	@Override
    @Transactional
    public AccountBindingModel findAccountBindingByIdNumber(String idNumber) {
		Account account=repository.findByIdNumber(idNumber).get();
		
        return accountToAccountBindingModel.convert(account);
    }
	@Override
	@Transactional
	public AccountBindingModel saveAccountBindingModel(AccountBindingModel command) {
		Account detachedAccount=accountBindingModelToAccount.convert(command);
		AdressBindingModel adress=command.getAdress();
		Adress detachedAddress=addressBindingModelToAddress.convert(adress);
		detachedAccount.setAdress(detachedAddress);
		Account savedAccount=repository.save(detachedAccount);
		return accountToAccountBindingModel.convert(savedAccount);
	
	}
	@Override
	@Transactional
	public List<AccountViewModel> findAllAccounts() {
		List<Account> accounts=repository.findAll();
		List<AccountViewModel>allAccounts=new ArrayList<>();
		allAccounts=accounts.stream()
				.map((Account a)->accountToAccountViewModel.convert(a))
				.collect(Collectors.toList());
		return allAccounts;
	}
	@Override
	@Transactional
	public Optional<Account> findAccountByIdNumber(String idNumber) {
		 Optional<Account> account=repository.findByIdNumber(idNumber);
		return account;
	}
	@Override
	@Transactional
	public AdressViewModel findAddressByAccountIdNumber(String idNumber) {
		Account account=repository.findByIdNumber(idNumber).get();
		Adress address=account.getAdress();
		AdressViewModel viewAddress=addressToAddressViewModel.convert(address);
		return viewAddress;
	}

	@Override
	@Transactional
	public AccountBindingModel editAccountBindingModel(@Valid AccountBindingModel command) {
		//tuk ima problem
		Optional<Account> detachedAccount= repository.findById(command.getId());
		if(detachedAccount.isPresent()) {
			Account accountForm=accountBindingModelToAccount.convert(command);
			AdressBindingModel adress=command.getAdress();
			Adress detachedAddress=addressBindingModelToAddress.convert(adress);
			accountForm.setAdress(detachedAddress);
			Account savedAccount=repository.save(accountForm);
			return accountToAccountBindingModel.convert(savedAccount);
		}
		else {
			Account newAccount=new Account();
			newAccount=accountBindingModelToAccount.convert(command);
			Adress adressOfNewAccount=new Adress();
			AdressBindingModel adressOfCommand=command.getAdress();
			adressOfNewAccount=addressBindingModelToAddress.convert(adressOfCommand);
			newAccount.setAdress(adressOfNewAccount);
			Account savedAccount=repository.save(newAccount);
			return accountToAccountBindingModel.convert(savedAccount);
			
		}
	}

}
