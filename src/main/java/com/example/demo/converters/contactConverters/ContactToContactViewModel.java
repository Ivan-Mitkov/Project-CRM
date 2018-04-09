package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.converters.accountConverters.AccountToAccountViewModel;
import com.example.demo.converters.opportunityConverters.OpportunityToOpportunityViewModel;
import com.example.demo.entities.Contact;
import com.example.demo.viewmodel.ContactViewModel;

@Component
public class ContactToContactViewModel implements 
Converter<Contact,ContactViewModel>{


	@Nullable
	@Override
	public synchronized ContactViewModel convert(Contact source) {
		if(source==null) {
			return null;
		}
		final ContactViewModel contact= new ContactViewModel();
		contact.setId(source.getId());
		
		contact.setContactable(source.isContactable());
		contact.setEmail(source.getEmail());
		contact.setName(source.getName());
		contact.setPhone(source.getPhone());
		contact.setReportTo(source.getReportTo());
	
		
		return contact;
	}

}
