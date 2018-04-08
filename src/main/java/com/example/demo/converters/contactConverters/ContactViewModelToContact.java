package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Contact;
import com.example.demo.viewmodel.ContactViewModel;

public class ContactViewModelToContact implements 
Converter<ContactViewModel, Contact>{

	@Override
	public Contact convert(ContactViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
