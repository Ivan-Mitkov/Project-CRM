package com.example.demo.converters.opportunityConverters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.bindingmodel.ContactBindingModel;
import com.example.demo.bindingmodel.OpportunityBindingModel;
import com.example.demo.converters.accountConverters.AccountBindingModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

public class OpportunityBindingModelToOpportunityTest {

	
	OpportunityBindingModelToOpportunity converter;

	AccountBindingModelToAccount accountConverter;
	
	ContactBindingModelToContact contactConverter;
	@Before
	public void setUp() throws Exception {
        converter = new OpportunityBindingModelToOpportunity
        		(accountConverter,contactConverter);
    }
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new OpportunityBindingModel()));
    }
	@Test
    public void convert() throws Exception {
		 //given
		OpportunityBindingModel model=new OpportunityBindingModel();
		model.setId(1l);
		
		Status status =Status.CLOSED;
		model.setStatus(status.name());
		
		List<ContactBindingModel> contacts=new ArrayList<>();
		ContactBindingModel contact= new ContactBindingModel();
		contact.setId(23L);
		
		AccountBindingModel account= new AccountBindingModel();
		account.setId(21L);
		model.setAccount(account);
		model.setContact(contacts);
		
		 //when
		Opportunity opp=converter.convert(model);
		
		//then
		assertNotNull(opp);
	}
	
	
}
