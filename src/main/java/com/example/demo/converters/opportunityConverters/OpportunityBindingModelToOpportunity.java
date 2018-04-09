package com.example.demo.converters.opportunityConverters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.entities.Account;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

@Component
public class OpportunityBindingModelToOpportunity implements 
Converter<OpportunityBindingModel, Opportunity>{

	

	@Override
	@Nullable
	public synchronized Opportunity convert(OpportunityBindingModel source) {
		if(source==null) {
			return null;
		}
		String status=source.getStatus();
		
		final Opportunity opp=new Opportunity();
		opp.setId(source.getId());
		opp.setDescription(source.getDescription());
		opp.setStatus("Closed");
		if(opp.getAccount()==null) {
			Account account = new Account();
			opp.setAccount(account);
		}
		if(opp.getContact()==null) {
			List<Contact>contacts= new ArrayList<>();
			opp.setContact(contacts);
		}
		
		return opp;
	}

}
