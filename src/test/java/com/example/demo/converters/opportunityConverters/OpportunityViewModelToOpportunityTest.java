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
import com.example.demo.converters.accountConverters.AccountViewModelToAccount;
import com.example.demo.converters.contactConverters.ContactBindingModelToContact;
import com.example.demo.converters.contactConverters.ContactViewModelToContact;
import com.example.demo.entities.Opportunity;
import com.example.demo.enums.Status;
import com.example.demo.viewmodel.AccountViewModel;
import com.example.demo.viewmodel.ContactViewModel;
import com.example.demo.viewmodel.OpportunityViewModel;

public class OpportunityViewModelToOpportunityTest {

	
	OpportunityViewModelToOpportunity converter;

	AccountViewModelToAccount accountConverter;
	
	ContactViewModelToContact contactConverter;
	@Before
	public void setUp() throws Exception {
        converter = new OpportunityViewModelToOpportunity
        		(accountConverter,contactConverter);
                
                
    }
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new OpportunityViewModel()));
    }
	@Test
    public void convert() throws Exception {
		 //given
		OpportunityViewModel model=new OpportunityViewModel();
		model.setId(1l);
		
		Status status =Status.CLOSED;
		model.setStatus(status.name());
		
		List<ContactViewModel> contacts=new ArrayList<>();
		ContactViewModel contact= new ContactViewModel();
		contact.setId(23L);
		
		AccountViewModel account= new AccountViewModel();
		account.setId(21L);
		model.setAccount(account);
		model.setContact(contacts);
		
		 //when
		Opportunity opp=converter.convert(model);
		
		//then
		assertNotNull(opp);
	}
	
	
}
