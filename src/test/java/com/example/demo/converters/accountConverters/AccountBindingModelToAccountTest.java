package com.example.demo.converters.accountConverters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.bindingmodel.AccountBindingModel;
import com.example.demo.bindingmodel.AdressBindingModel;
import com.example.demo.converters.adressConverters.AdressBindingModelToAdress;
import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.serviceImpl.AccountServiceImpl;

public class AccountBindingModelToAccountTest {
	
	private  AccountBindingModelToAccount converter;
	private  AccountServiceImpl service;
	private  AdressBindingModelToAdress adressConverter;

	
	@Mock
	AccountRepository repository;
	@Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        service = new AccountServiceImpl(repository, converter, null, null, null, null);
        adressConverter=new AdressBindingModelToAdress();
        converter=new AccountBindingModelToAccount(adressConverter);
        
    }
	
	@Test
    public void testNullObject() throws Exception {
        assertNull(converter.convert(null));
    }
	@Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new AccountBindingModel()));
    }
	@Test
	public void testService() {
		assertNotNull(service);
	}
	
	@Test
    public void convert() throws Exception {
		 //given
		
		
		AccountBindingModel model=new AccountBindingModel();
		model.setEmail("a@g.com");
		model.setName("Doku OOD");
		
		 //when

		Account account=converter.convert(model);
		
		//then
		
		assertNotNull(account);
	}
	
}
