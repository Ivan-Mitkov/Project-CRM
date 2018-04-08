package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.bindingmodel.ManagerBindingModel;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Manager;

public class ManagerToManagerBindingModel implements 
Converter<Manager, ManagerBindingModel>{

	@Override
	public ManagerBindingModel convert(Manager source) {
		// TODO Auto-generated method stub
		return null;
	}

}
