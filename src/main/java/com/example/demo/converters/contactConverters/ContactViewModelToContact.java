package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Contact;
import com.example.demo.viewmodel.ContactViewModel;

@Component
public class ContactViewModelToContact implements 
Converter<ContactViewModel, Contact>{

	

	@Nullable
	@Override
	public Contact convert(ContactViewModel source) {
		if(source==null) {
			return null;
		}
		final Contact contact= new Contact();
		contact.setId(source.getId());
		contact.setIdNumber(source.getIdNumber());
		contact.setContactable(source.getIsContactable());
		contact.setEmail(source.getEmail());
		contact.setName(source.getName());
		contact.setPhone(source.getPhone());
		contact.setReportTo(source.getReportTo());
		
		return contact;
	}

}
