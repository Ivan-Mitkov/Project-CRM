package com.example.demo.converters.accountConverters;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.converters.adressConverters.AdressBindingModelToAdress;
import com.example.demo.converters.adressConverters.AdressViewModelToAdress;
import com.example.demo.entities.Account;
import com.example.demo.entities.Adress;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Manager;
import com.example.demo.entities.Opportunity;
import com.example.demo.entities.Sale;
import com.example.demo.entities.Task;
import com.example.demo.serviceImpl.AccountServiceImpl;
import com.example.demo.viewmodel.AccountViewModel;

@Component
public class AccountViewModelToAccount implements 
Converter<AccountViewModel,Account >{
	private final AdressViewModelToAdress converter;
	private final AccountServiceImpl service;
	
	

	public AccountViewModelToAccount(AdressViewModelToAdress converter, AccountServiceImpl service) {
		this.converter = converter;
		this.service = service;
	}

	@Override
	public Account convert(AccountViewModel source) {
		if(source==null) {
			return null;
		}
		String name=source.getName();
		Optional<Account> accountOptional =service.findAccountByName(name);
		Account account=new Account();
		if(accountOptional.isPresent()) {
			account=accountOptional.get();
		}
		
		else {
			
			 List<Contact> contacts=new ArrayList<>();
			 account.setContacts(contacts);
			 List<Event> events=new ArrayList<>();
			 account.setEvents(events);
			 List<Manager> managers=new ArrayList<>();
			 account.setManagersWorkingForThisAccount(managers);
			 List<Employee> employes=new ArrayList<>();
			 account.setWorkingForThisAccount(employes);
			 List<Task> tasks=new ArrayList<>();
			 account.setTasks(tasks);
			 List<Opportunity> opportunities=new ArrayList<>();
			 account.setOpportunities(opportunities);
			 List<Sale> sales=new ArrayList<>();
			 account.setSalesForThisAccount(sales);
			 Adress adress=new Adress();
			 account.setAdress(adress);
		}
		account.setIdNumber(source.getIdNumber());
		account.setAdress(converter.convert(source.getAdress()));
		account.setEmail(source.getEmail());
		account.setName(source.getName());
		account.setPhone(source.getPhone());
		
		
		return account;
	}

}
