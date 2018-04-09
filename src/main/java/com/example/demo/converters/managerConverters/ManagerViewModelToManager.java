package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Manager;
import com.example.demo.viewmodel.ManagerViewModel;

@Component
public class ManagerViewModelToManager implements 
Converter<ManagerViewModel,Manager>{

	@Override
	public Manager convert(ManagerViewModel source) {
		if(source==null) {
			return null;
		}
		Manager em=new Manager();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
