package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ManagerBindingModel;
import com.example.demo.entities.Manager;

@Component
public class ManagerToManagerBindingModel implements 
Converter<Manager, ManagerBindingModel>{

	@Override
	public ManagerBindingModel convert(Manager source) {
		if(source==null) {
			return null;
		}
		ManagerBindingModel em=new ManagerBindingModel();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
