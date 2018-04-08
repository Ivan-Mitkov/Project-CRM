package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ManagerBindingModel;
import com.example.demo.entities.Manager;

@Component
public class ManagerBindingModelToManager implements 
Converter<ManagerBindingModel, Manager>{

	@Override
	public Manager convert(ManagerBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
