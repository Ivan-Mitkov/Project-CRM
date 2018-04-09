package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.contactConverters.ContactToContactBindingModel;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

@Component
public class OpportunityToOpportunityBindingModel implements 
Converter< Opportunity,OpportunityBindingModel>{

	
	@Override
	@Nullable
	public synchronized OpportunityBindingModel convert(Opportunity source) {
		if(source==null) {
			return null;
		}
		
		
		final OpportunityBindingModel opp=new OpportunityBindingModel();
		opp.setId(source.getId());
		opp.setDescription(source.getDescription());		
		opp.setStatus(source.getStatus());
		
		
		return opp;		
	}

}
