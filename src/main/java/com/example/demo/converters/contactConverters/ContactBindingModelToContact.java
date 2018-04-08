package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.opportunityConverters.OpportunityBindingModelToOpportunity;
import com.example.demo.entities.Contact;

@Component
public class ContactBindingModelToContact implements 
Converter<ContactBindingModel, Contact>{

	private final AccountBindingModelToAccount accountConverter;
	private final OpportunityBindingModelToOpportunity opportunityConverter;
	
	
	public ContactBindingModelToContact(AccountBindingModelToAccount accountConverter,
			OpportunityBindingModelToOpportunity opportunityConverter) {
		this.accountConverter = accountConverter;
		this.opportunityConverter = opportunityConverter;
	}

	@Nullable
	@Override
	public synchronized Contact convert(ContactBindingModel source) {
		if(source==null) {
			return null;
		}
		final Contact contact= new Contact();
		contact.setId(source.getId());
		contact.setAccount(accountConverter.convert(source.getAccount()));
		contact.setContactable(source.isContactable());
		contact.setEmail(source.getEmail());
		contact.setName(source.getName());
		contact.setPhone(source.getPhone());
		contact.setReportTo(source.getReportTo());
		contact.setOpportunity(opportunityConverter.convert(source.getOpportunity()));
		
		return contact;
	}

}
