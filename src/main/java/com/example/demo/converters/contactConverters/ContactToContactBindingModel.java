package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.entities.Contact;

@Component
public class ContactToContactBindingModel implements 
Converter<Contact,ContactBindingModel>{

	

	@Nullable
	@Override
	public synchronized ContactBindingModel convert(Contact source) {
		if(source==null) {
			return null;
		}
		final ContactBindingModel contact= new ContactBindingModel();
		contact.setId(source.getId());
		contact.setIdNumber(source.getIdNumber());
		contact.setIsContactable(source.isContactable());
		contact.setEmail(source.getEmail());
		contact.setName(source.getName());
		contact.setPhone(source.getPhone());
		contact.setReportTo(source.getReportTo());
		
		
		return contact;
	}

}
