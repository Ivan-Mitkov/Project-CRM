package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.viewmodel.EmployeeViewModel;

public class EmployeeViewModelToEmployee implements 
Converter<EmployeeViewModel,Employee>{

	@Override
	public Employee convert(EmployeeViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
