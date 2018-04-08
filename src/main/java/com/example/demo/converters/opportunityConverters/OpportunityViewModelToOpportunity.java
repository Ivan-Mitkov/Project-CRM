package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.example.demo.entities.Opportunity;
import com.example.demo.viewmodel.OpportunityViewModel;

public class OpportunityViewModelToOpportunity implements 
Converter<OpportunityViewModel, Opportunity>{

	@Override
	@Nullable
	public synchronized Opportunity convert(OpportunityViewModel source) {
		if(source==null) {
			return null;
		}
		
		return null;
	}

}
