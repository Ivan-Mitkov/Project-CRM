package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

public class OpportunityBindingModelToOpportunity implements 
Converter<OpportunityBindingModel, Opportunity>{

	private final AccountBindingModelToAccount accountConverter;
	private final ContactBindingModelToContact contactConverter;
	
	
	public OpportunityBindingModelToOpportunity(AccountBindingModelToAccount accountConverter,
			ContactBindingModelToContact contactConverter) {
		this.accountConverter = accountConverter;
		this.contactConverter = contactConverter;
	}


	@Override
	@Nullable
	public synchronized Opportunity convert(OpportunityBindingModel source) {
		if(source==null) {
			return null;
		}
		
		String curStatus=source.getStatus();
		
		final Opportunity opp=new Opportunity();
		opp.setId(source.getId());
		opp.setStatus(Enum.valueOf(Status.class, curStatus));
		if(opp.getAccount()!=null) {
			opp.setAccount(accountConverter.convert(source.getAccount()));

		}
	
		
		if(source.getContact()!=null&&source.getContact().size()>0) {
			source.getContact()
			.forEach(contact->opp.getContact()
					.add(contactConverter.convert(contact)));
		}
		
		
		
		return opp;
	}

}
