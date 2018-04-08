package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.entities.Contact;

public class ContactBindingModelToContact implements 
Converter<ContactBindingModel, Contact>{

	@Override
	public Contact convert(ContactBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
