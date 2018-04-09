package com.example.demo.converters.opportunityConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.accountConverters.AccountViewModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.converters.contactConverters.ContactViewModelToContact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;
import com.example.demo.viewmodel.OpportunityViewModel;

@Component
public class OpportunityViewModelToOpportunity implements 
Converter<OpportunityViewModel, Opportunity>{
	
		@Override
		@Nullable
		public synchronized Opportunity convert(OpportunityViewModel source) {
			if(source==null) {
				return null;
			}
			
			final Opportunity opp=new Opportunity();
			opp.setId(source.getId());
			opp.setDescription(source.getDescription());
			
			opp.setStatus(source.getStatus());
			
			
			return opp;
		}
}
