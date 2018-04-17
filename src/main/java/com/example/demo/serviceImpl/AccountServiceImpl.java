package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.controllers.AccountViewController;
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
import com.example.demo.repositories.AdressRepository;
import com.example.demo.services.AccountService;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.AdressViewModel;


@Service
public class AccountServiceImpl implements AccountService {
	Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

	private AccountRepository repository;
	private AdressRepository addressRepository;

	private final AccountBindingModelToAccount accountBindingModelToAccount;
	private final AccountToAccountBindingModel accountToAccountBindingModel;
	private final AccountViewModelToAccount accountViewModelToAccount;
	private final AccountToAccountViewModel accountToAccountViewModel;
	private final AdressToAdressViewModel addressToAddressViewModel;
	private final AdressToAdressBindingModel addressToAddressBindingModel;
	private final AdressBindingModelToAdress addressBindingModelToAddress;

	@Autowired
	public AccountServiceImpl(AccountRepository repository, AdressRepository addressRepository,
			AccountBindingModelToAccount accountBindingModelToAccount,
			AccountToAccountBindingModel accountToAccountBindingModel,
			AccountViewModelToAccount accountViewModelToAccount, AccountToAccountViewModel accountToAccountViewModel,
			AdressToAdressViewModel addressToAddressViewModel, AdressToAdressBindingModel addressToAddressBindingModel,
			AdressBindingModelToAdress addressBindingModelToAddress) {
		this.repository = repository;
		this.addressRepository = addressRepository;
		this.accountBindingModelToAccount = accountBindingModelToAccount;
		this.accountToAccountBindingModel = accountToAccountBindingModel;
		this.accountViewModelToAccount = accountViewModelToAccount;
		this.accountToAccountViewModel = accountToAccountViewModel;
		this.addressToAddressViewModel = addressToAddressViewModel;
		this.addressToAddressBindingModel = addressToAddressBindingModel;
		this.addressBindingModelToAddress = addressBindingModelToAddress;
	}
	@Override
	public Account findAccountById(Long id) throws Exception {
		Optional<Account> account = repository.findById(id);
		 if (!account.isPresent()) {
	            throw new Exception("Recipe Not Found. For ID value: " + id.toString() );
	        }

		return account.get();
	}

	

	@Override
	@Transactional

	public Optional<Account> findAccountByName(String name) {
		Optional<Account> account = repository.findByName(name);
		return account;
	}

	@Override
	@Transactional
	public AccountViewModel findAccountViewByIdNumber(String id) {
		Account accountThis = repository.findByIdNumber(id).get();
		AccountViewModel account = accountToAccountViewModel.convert(accountThis);
		return account;
	}

	@Override
	@Transactional
	public void deleteByIdNumber(String idNumber) {
		Account account = repository.findByIdNumber(idNumber).get();
		long id = account.getId();
		repository.deleteById(id);

	}

	@Override
	@Transactional
	public AccountBindingModel findAccountBindingByIdNumber(String idNumber) {
		Account account = repository.findByIdNumber(idNumber).get();

		return accountToAccountBindingModel.convert(account);
	}

	@Override
	@Transactional
	public AccountBindingModel saveAccountBindingModel(AccountBindingModel command) {
		logger.info("Saving new account");
		//create new account
		Account newAccount = new Account();			
		//create new address			
		Adress adressOfNewAccount = new Adress();
		
		//get address from form
		AdressBindingModel adressOfCommand = command.getAdress();
		// set address of the new account with fields from form
		adressOfNewAccount.setAdditionalAdressInfo(adressOfCommand.getAdditionalAdressInfo());
		adressOfNewAccount.setCountry(adressOfCommand.getCountry());
		adressOfNewAccount.setCity(adressOfCommand.getCity());
		adressOfNewAccount.setStreet(adressOfCommand.getStreet());
		adressOfNewAccount.setStreetNumber(adressOfCommand.getStreetNumber());
		logger.info("Address: "+adressOfNewAccount.getStreet());
		//convert new account
		newAccount = accountBindingModelToAccount.convert(command);
		logger.info("newAccount: "+newAccount.getEmail());
		adressOfNewAccount = addressBindingModelToAddress.convert(adressOfCommand);
		newAccount.setAdress(adressOfNewAccount);

		Account savedAccount = repository.save(newAccount);
		Long id=savedAccount.getId();
		logger.info("newAccount: "+newAccount.getId());
		
		//save the address
		addressRepository.save(adressOfNewAccount);
		return accountToAccountBindingModel.convert(savedAccount);
	}

	@Override
	@Transactional
	public List<AccountViewModel> findAllAccounts() {
		List<Account> accounts = repository.findAll();
		List<AccountViewModel> allAccounts = new ArrayList<>();
		allAccounts = accounts.stream().map((Account a) -> accountToAccountViewModel.convert(a))
				.collect(Collectors.toList());
		return allAccounts;
	}

	@Override
	@Transactional
	public Optional<Account> findAccountByIdNumber(String idNumber) {
		Optional<Account> account = repository.findByIdNumber(idNumber);
		return account;
	}

	@Override
	@Transactional
	public AdressViewModel findAddressByAccountIdNumber(String idNumber) {
		Account account = repository.findByIdNumber(idNumber).get();
		Adress address = account.getAdress();
		AdressViewModel viewAddress = addressToAddressViewModel.convert(address);
		return viewAddress;
	}

	@Override
	@Transactional
	public AccountBindingModel editAccountBindingModel(@Valid AccountBindingModel command) throws Exception {
		// get account
		logger.info("Getting account");
		Optional<Account> detachedAccount = repository.findById(command.getId());
		logger.info("Getting account: "+detachedAccount.isPresent());
		if (detachedAccount.isPresent()) {
			// from this account get address
			Account accountForm = detachedAccount.get();
			Adress addressInDatabase = accountForm.getAdress();

			// get address from form
			AdressBindingModel addressInBindingModel = command.getAdress();
			Adress detachedAddress = addressBindingModelToAddress.convert(addressInBindingModel);

			// set address in database with fields from form
			addressInDatabase.setAdditionalAdressInfo(detachedAddress.getAdditionalAdressInfo());
			addressInDatabase.setCountry(detachedAddress.getCountry());
			addressInDatabase.setCity(detachedAddress.getCity());
			addressInDatabase.setStreet(detachedAddress.getStreet());
			addressInDatabase.setStreetNumber(detachedAddress.getStreetNumber());

			Account savedAccount = repository.save(accountForm);
			return accountToAccountBindingModel.convert(savedAccount);
		} else {
			throw new Exception("Account not found");

		}
	}

}
