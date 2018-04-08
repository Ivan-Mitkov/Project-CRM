package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.converters.contactConverters.ContactToContactBindingModel;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

public class OpportunityToOpportunityBindingModel implements 
Converter< Opportunity,OpportunityBindingModel>{

	private final AccountToAccountBindingModel accountConverter;
	private final ContactToContactBindingModel contactConverter;
	
	public OpportunityToOpportunityBindingModel(AccountToAccountBindingModel accountConverter,
			ContactToContactBindingModel contactConverter) {
		this.accountConverter = accountConverter;
		this.contactConverter = contactConverter;
	}

	@Override
	@Nullable
	public synchronized OpportunityBindingModel convert(Opportunity source) {
		if(source==null) {
			return null;
		}
		Status status = null;
		
		final OpportunityBindingModel opp=new OpportunityBindingModel();
		opp.setId(source.getId());
		opp.setStatus(source.getStatus().getName());
		opp.setAccount(accountConverter.convert(source.getAccount()));
		
		if(source.getContact()!=null&&source.getContact().size()>0) {
			source.getContact()
			.forEach(contact->opp.getContact()
					.add(contactConverter.convert(contact)));
		}
		
		
		return opp;		
	}

}
