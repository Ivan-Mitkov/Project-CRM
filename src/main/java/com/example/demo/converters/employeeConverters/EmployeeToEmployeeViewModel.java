package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.viewmodel.EmployeeViewModel;

public class EmployeeToEmployeeViewModel implements 
Converter<Employee,EmployeeViewModel>{

	@Override
	public EmployeeViewModel convert(Employee source) {
		// TODO Auto-generated method stub
		return null;
	}

}
