package com.example.demo.serviceImpl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Account;
import com.example.demo.entities.Contact;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.AdressRepository;
import com.example.demo.repositories.ContactRepository;
import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.OpportunityRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.SaleRepository;
import com.example.demo.repositories.TaskRepository;
import com.example.demo.services.SearchService;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.ContactViewModel;

@Service
public class SearchServiceImpl implements SearchService {
	
	private Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);
	
	private AccountRepository accRep;
	private AdressRepository addRep;
	private ContactRepository contRep;
	private EventRepository eventRep;
	private OpportunityRepository oppRep;
	private ProductRepository prodRep;
	private SaleRepository saleRep;
	private TaskRepository taskRep;
	
	@Autowired
	public SearchServiceImpl(AccountRepository accRep, AdressRepository addRep, ContactRepository contRep,
			EventRepository eventRep, OpportunityRepository oppRep, ProductRepository prodRep, SaleRepository saleRep,
			TaskRepository taskRep) {
		this.accRep = accRep;
		this.addRep = addRep;
		this.contRep = contRep;
		this.eventRep = eventRep;
		this.oppRep = oppRep;
		this.prodRep = prodRep;
		this.saleRep = saleRep;
		this.taskRep = taskRep;
		logger.info("Construct Search SERVICE");
	}
	
	@Override
	@Transactional
	public List<AccountViewModel> searchAccounts(String searched){
		ModelMapper mapper=new ModelMapper();
		List<Account>accounts=accRep.findAll();
		
		Predicate<Account> searcheInAccount=new Predicate<Account>() {
			@Override
			public boolean test(Account x) {
				boolean found=false;
				boolean foundInName=(x.getName().contains(searched.trim().toLowerCase())
						|x.getName().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				
				boolean foundInEmail=(x.getEmail().contains(searched.trim().toLowerCase())
						|x.getEmail().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				
				boolean foundInPhone=(x.getPhone().contains(searched.trim().toLowerCase())
						|x.getPhone().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				boolean foundInAddressStreet=(x.getAdress().getStreet().contains(searched.trim().toLowerCase())
						|x.getAdress().getStreet().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				boolean foundInAddressCity=(x.getAdress().getCity().contains(searched.trim().toLowerCase())
						|x.getAdress().getCity().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
									
				found=foundInName||foundInEmail||foundInPhone||foundInAddressStreet||foundInAddressCity;
				logger.info("FOUND: "+found);
				return found;
				
			}
		};
		
		return accounts.stream()
				.filter(searcheInAccount)
				.map(x->mapper.map(x, AccountViewModel.class))		
				.collect(Collectors.toList());
	
	}
	@Override
	@Transactional
	public List<ContactViewModel> searchContacts(String searched){
		ModelMapper mapper=new ModelMapper();
		List<Contact>contacts=contRep.findAll();
		
		Predicate<Contact> searcheinContact=new Predicate<Contact>() {
			@Override
			public boolean test(Contact x) {
				boolean found=false;
				boolean foundInName=(x.getName().contains(searched.trim().toLowerCase())
						|x.getName().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				
				boolean foundInEmail=(x.getEmail().contains(searched.trim().toLowerCase())
						|x.getEmail().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				
				boolean foundInPhone=(x.getPhone().contains(searched.trim().toLowerCase())
						|x.getPhone().trim()
						.contains(searched.substring(0, 1)
								.toUpperCase()+searched.substring(1)));
				
				
									
				found=foundInName||foundInEmail||foundInPhone;
				logger.info("FOUND: "+found);
				return found;
				
			}
		};
		
		return contacts.stream()
				.filter(searcheinContact)
				.map(x->mapper.map(x, ContactViewModel.class))		
				.collect(Collectors.toList());
	
	}
	
}

