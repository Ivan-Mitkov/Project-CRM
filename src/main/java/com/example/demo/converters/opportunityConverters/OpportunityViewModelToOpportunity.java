package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Opportunity;
import com.example.demo.viewmodel.OpportunityViewModel;

public class OpportunityViewModelToOpportunity implements 
Converter<OpportunityViewModel, Opportunity>{

	@Override
	public Opportunity convert(OpportunityViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
