package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Manager;
import com.example.demo.viewmodel.ManagerViewModel;

@Component
public class ManagerToManagerViewModel implements 
Converter<Manager,ManagerViewModel>{

	@Override
	public ManagerViewModel convert(Manager source) {
		if(source==null) {
			return null;
		}
		ManagerViewModel em=new ManagerViewModel();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
