package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.example.demo.entities.Opportunity;
import com.example.demo.viewmodel.OpportunityViewModel;

public class OpportunityToOpportunityViewModel implements 
Converter< Opportunity,OpportunityViewModel>{

	@Override
	@Nullable
	public synchronized OpportunityViewModel convert(Opportunity source) {
		if(source==null) {
			return null;
		}
		
		return null;
	}

}
