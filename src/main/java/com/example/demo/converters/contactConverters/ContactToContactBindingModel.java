package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.opportunityConverters.OpportunityToOpportunityBindingModel;
import com.example.demo.entities.Contact;

@Component
public class ContactToContactBindingModel implements 
Converter<Contact,ContactBindingModel>{

	private final AccountToAccountBindingModel accountConverter;
	private final OpportunityToOpportunityBindingModel opportunityConverter;
	
	
	public ContactToContactBindingModel(AccountToAccountBindingModel accountConverter,
			OpportunityToOpportunityBindingModel opportunityConverter) {
		this.accountConverter = accountConverter;
		this.opportunityConverter = opportunityConverter;
	}


	@Nullable
	@Override
	public synchronized ContactBindingModel convert(Contact source) {
		if(source==null) {
			return null;
		}
		final ContactBindingModel contact= new ContactBindingModel();
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
