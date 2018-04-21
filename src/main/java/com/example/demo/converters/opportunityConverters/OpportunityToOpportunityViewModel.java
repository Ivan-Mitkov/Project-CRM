package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Opportunity;
import com.example.demo.viewmodel.OpportunityViewModel;

@Component
public class OpportunityToOpportunityViewModel implements 
Converter< Opportunity,OpportunityViewModel>{
	
	@Override
	@Nullable
	public synchronized OpportunityViewModel convert(Opportunity source) {
		if(source==null) {
			return null;
		}
		
		final OpportunityViewModel opp=new OpportunityViewModel();
		opp.setId(source.getId());
		opp.setDescription(source.getDescription());		
		opp.setStatus(source.getStatus());
		
	
		
		return opp;		
	}


}
