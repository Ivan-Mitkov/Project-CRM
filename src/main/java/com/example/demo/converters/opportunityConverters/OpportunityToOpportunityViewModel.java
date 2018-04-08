package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Opportunity;
import com.example.demo.viewmodel.OpportunityViewModel;

public class OpportunityToOpportunityViewModel implements 
Converter< Opportunity,OpportunityViewModel>{

	@Override
	public OpportunityViewModel convert(Opportunity source) {
		// TODO Auto-generated method stub
		return null;
	}

}
