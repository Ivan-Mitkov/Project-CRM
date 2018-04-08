package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.entities.Contact;

public class ContactToContactBindingModel implements 
Converter<Contact,ContactBindingModel>{

	@Override
	public ContactBindingModel convert(Contact source) {
		// TODO Auto-generated method stub
		return null;
	}

}
