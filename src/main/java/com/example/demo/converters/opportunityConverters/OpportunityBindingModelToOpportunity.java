package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.entities.Opportunity;

public class OpportunityBindingModelToOpportunity implements 
Converter<OpportunityBindingModel, Opportunity>{

	@Override
	public Opportunity convert(OpportunityBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
