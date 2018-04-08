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
import com.example.demo.converters.accountConverters.AccountToAccountBindingModel;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.converters.contactConverters.ContactToContactBindingModel;
import com.example.demo.entities.Account;
import com.example.demo.entities.Contact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;

public class OpportunityToOpportunityBindingModelTest {

	
	OpportunityToOpportunityBindingModel converter;

	AccountToAccountBindingModel accountConverter;
	
	ContactToContactBindingModel contactConverter;
	@Before
	public void setUp() throws Exception {
        converter = new OpportunityToOpportunityBindingModel
        		(accountConverter,contactConverter);
    }
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Opportunity()));
    }
	@Test
    public void convert() throws Exception {
		 //given
		Opportunity model=new Opportunity();
		model.setId(1l);		
		Status status =Status.CLOSED;
		
		List<Contact> contacts=new ArrayList<>();
		Contact contact= new Contact();
		contact.setId(23L);
		
		Account account= new Account();
		account.setId(21L);
		model.setAccount(account);
		model.setContact(contacts);
		
		 //when
		OpportunityBindingModel opp=converter.convert(model);
		
		//then
		assertNotNull(opp);
	}
	
	
}
