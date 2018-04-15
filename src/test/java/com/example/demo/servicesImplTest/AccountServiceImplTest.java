package com.example.demo.servicesImplTest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.serviceImpl.AccountServiceImpl;

public class AccountServiceImplTest {
	AccountServiceImpl service;
	
	@Mock
	AccountRepository repository;
	@Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        service = new AccountServiceImpl(repository, null, null, null, null);
    }
	
	 @Test
	    public void findAccountByName() throws Exception {
	        Account account = new Account();
	        account.setId(1L);
	        Optional<Account> accountOptional = Optional.of(account);
	        String name="anyName";
	        when(repository.findByName(name)).thenReturn(accountOptional);

	        Optional<Account> accountReturned = service.findAccountByName(name);

	        assertNotNull("Null recipe returned", accountReturned);
	        verify(repository, times(1)).findByName("anyName");
	        verify(repository, never()).findAll();
	    }
}
