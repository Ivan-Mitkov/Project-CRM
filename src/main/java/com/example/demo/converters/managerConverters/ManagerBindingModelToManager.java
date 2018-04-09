package com.example.demo.converters.managerConverters;

import java.util.Optional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ManagerBindingModel;
import com.example.demo.entities.Manager;
import com.example.demo.serviceImpl.ManagerServiceImpl;

@Component
public class ManagerBindingModelToManager implements 
Converter<ManagerBindingModel, Manager>{

	private final ManagerServiceImpl service;
	
	
	public ManagerBindingModelToManager(ManagerServiceImpl service) {
		this.service = service;
	}


	@Nullable
	@Override
	public synchronized Manager convert(ManagerBindingModel source) {
		if(source==null) {
			return null;
		}
		String name=source.getName();
		Optional<Manager> managerOptional =service.findManagerByName(name);
		
		if(managerOptional.isPresent()) {
			
		}
		Manager em=new Manager();
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return null;
	}

}
