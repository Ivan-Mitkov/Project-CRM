package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.entities.Opportunity;

public class OpportunityToOpportunityBindingModel implements 
Converter< Opportunity,OpportunityBindingModel>{

	@Override
	public OpportunityBindingModel convert(Opportunity source) {
		// TODO Auto-generated method stub
		return null;
	}

}
