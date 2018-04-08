package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountViewModel;
import com.example.demo.converters.contactConverters.ContactToContactBindingModel;
import com.example.demo.converters.contactConverters.ContactToContactViewModel;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;
import com.example.demo.viewmodel.OpportunityViewModel;

@Component
public class OpportunityToOpportunityViewModel implements 
Converter< Opportunity,OpportunityViewModel>{
	private final AccountToAccountViewModel accountConverter;
	private final ContactToContactViewModel contactConverter;
	
	public OpportunityToOpportunityViewModel(AccountToAccountViewModel accountConverter,
			ContactToContactViewModel contactConverter) {
		this.accountConverter = accountConverter;
		this.contactConverter = contactConverter;
	}

	@Override
	@Nullable
	public synchronized OpportunityViewModel convert(Opportunity source) {
		if(source==null) {
			return null;
		}
		Status status = source.getStatus();
		
		final OpportunityViewModel opp=new OpportunityViewModel();
		opp.setId(source.getId());
		
		if(source.getStatus()==null) {
			Status statusEnum =Status.CLOSED;
			opp.setStatus(statusEnum.name());
		}
		else {
			opp.setStatus(source.getStatus().name());
		}
		if(source.getAccount()!=null) {
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
