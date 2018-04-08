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
	//@Autowired
		private final AccountViewModelToAccount accountConverter;
		//@Autowired
		private final ContactViewModelToContact contactConverter;
		
		
		public OpportunityViewModelToOpportunity(AccountViewModelToAccount accountConverter,
				ContactViewModelToContact contactConverter) {
			this.accountConverter = accountConverter;
			this.contactConverter = contactConverter;
		}


		@Override
		@Nullable
		public synchronized Opportunity convert(OpportunityViewModel source) {
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
			
			
			
			if(opp.getAccount()!=null) {
				opp.setAccount(accountConverter.convert(source.getAccount()));

			}
			
			if(source.getContact()!=null&&source.getContact().size()>0) {
				source.getContact()
				.forEach(contact->opp.getContact()
						.add(contactConverter.convert(contact)));
			}

			
			return opp;
		}
}
