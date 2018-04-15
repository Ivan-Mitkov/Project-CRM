package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converters.contactConverters.ContactToContactViewModel;
import com.example.demo.entities.Contact;
import com.example.demo.repositories.ContactRepository;
import com.example.demo.services.ContactService;
import com.example.demo.viewmodel.ContactViewModel;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	private final ContactRepository repository;
	private final ContactToContactViewModel contactToContactViewModel;
	@Autowired
	public ContactServiceImpl(ContactRepository repository, ContactToContactViewModel contactToContactViewModel) {
		this.repository = repository;
		this.contactToContactViewModel = contactToContactViewModel;
	}
	@Override
	public List<ContactViewModel> findAllContactsOfAnAccount(Long id) {
		List<Contact> contacts=repository.findAllByAccountId(id);
		List<ContactViewModel>contactViews=new ArrayList<>();
		contactViews=contacts.stream()
				.map((Contact a)->contactToContactViewModel.convert(a))
				.collect(Collectors.toList());
		return contactViews;
	}

	

}
