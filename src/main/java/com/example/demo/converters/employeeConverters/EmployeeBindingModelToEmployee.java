package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.entities.Employee;

public class EmployeeBindingModelToEmployee implements 
Converter<EmployeeBindingModel, Employee>{

	@Override
	public Employee convert(EmployeeBindingModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
