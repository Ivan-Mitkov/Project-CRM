package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.entities.Employee;

@Component
public class EmployeeToEmployeeBindingModel implements 
Converter<Employee, EmployeeBindingModel>{

	@Override
	public EmployeeBindingModel convert(Employee source) {
		// TODO Auto-generated method stub
		return null;
	}

}
