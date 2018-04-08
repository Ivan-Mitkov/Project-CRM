package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.entities.Account;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

@Component
public class OpportunityBindingModelToOpportunity implements 
Converter<OpportunityBindingModel, Opportunity>{

	//@Autowired
	private final AccountBindingModelToAccount accountConverter;
	//@Autowired
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
		String status=source.getStatus();
		
		final Opportunity opp=new Opportunity();
		opp.setId(source.getId());
		 
		if(source.getStatus()==null) {
			Status statusEnum =Status.CLOSED;
			opp.setStatus(statusEnum);
		}
		else {
			opp.setStatus(Status.valueOf(status));
		}
		
		if(source.getAccount()!=null) {
			opp.setAccount(accountConverter.convert(source.getAccount()));

		}
		else {
			Account account = new Account();
			opp.setAccount(account);
			
		}
		
		if(source.getContact()!=null&&source.getContact().size()>0) {
			source.getContact()
			.forEach(contact->opp.getContact()
					.add(contactConverter.convert(contact)));
		}

		
		return opp;
	}

}
