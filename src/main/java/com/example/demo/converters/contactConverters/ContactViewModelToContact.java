package com.example.demo.converters.contactConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.converters.accountConverters.AccountViewModelToAccount;
import com.example.demo.converters.opportunityConverters.OpportunityViewModelToOpportunity;
import com.example.demo.entities.Contact;
import com.example.demo.viewmodel.ContactViewModel;

@Component
public class ContactViewModelToContact implements 
Converter<ContactViewModel, Contact>{

	private final AccountViewModelToAccount accountConverter;
	private final OpportunityViewModelToOpportunity opportunityConverter;
	
	
	public ContactViewModelToContact(AccountViewModelToAccount accountConverter,
			OpportunityViewModelToOpportunity opportunityConverter) {
		this.accountConverter = accountConverter;
		this.opportunityConverter = opportunityConverter;
	}


	@Nullable
	@Override
	public Contact convert(ContactViewModel source) {
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
