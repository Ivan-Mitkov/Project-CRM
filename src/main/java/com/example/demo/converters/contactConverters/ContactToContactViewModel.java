package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Contact;
import com.example.demo.viewmodel.ContactViewModel;

public class ContactToContactViewModel implements 
Converter<Contact,ContactViewModel>{

	@Override
	public ContactViewModel convert(Contact source) {
		// TODO Auto-generated method stub
		return null;
	}

}
