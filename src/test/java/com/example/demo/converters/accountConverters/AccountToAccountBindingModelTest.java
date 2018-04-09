package com.example.demo.converters.accountConverters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.converters.adressConverters.AdressToAdressBindingModel;
import com.example.demo.entities.Account;

public class AccountToAccountBindingModelTest {
	
	private  AccountToAccountBindingModel converter;

	private  AdressToAdressBindingModel adressConverter;

	
	
	@Before
    public void setUp() throws Exception {
       
        converter=new AccountToAccountBindingModel(adressConverter);
        
    }
	
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Account()));
    }
	
	
	@Test
    public void convert() throws Exception {
		 //given
		
		
		Account model=new Account();
		model.setEmail("a@g.com");
		model.setName("Doku OOD");
		
		 //when

		AccountBindingModel account=converter.convert(model);
		
		//then
		
		assertNotNull(account);
	}
}
