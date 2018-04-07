package com.example.demo.servicesImplTest;

import com.example.demo.entities.Adress;
import com.example.demo.repositories.AdressRepository;
import com.example.demo.serviceImpl.AdressServiceImpl;
import com.example.demo.viewmodel.AdressViewModel;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AdressServiceImplTest {

	AdressServiceImpl adressService;
	
	@Mock
	ModelMapper mapper=new ModelMapper();
	
	@Mock
	AdressRepository adressRepository;
	
	@Before
    public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		adressService=new AdressServiceImpl(adressRepository, mapper);
	}
	
	
	@Test
	public void testGetAllAdresses() {
		  Adress adress=new Adress();
		  adress.setId(1L);
		  adress.setCountry("Bulgaria");
		  adress.setCity("Sofia");
		  AdressViewModel modelAdress=mapper.map(adress, AdressViewModel.class);
		  
		  List<AdressViewModel> adresses=new ArrayList<>();
		  adresses.add(modelAdress);
		  
		  when(adressService.getAllAdresses()).thenReturn(adresses);
		  
		  assertEquals(adresses.size(),1);
		  verify(adressRepository, times(1)).findAll();
	  }
	
	
}
