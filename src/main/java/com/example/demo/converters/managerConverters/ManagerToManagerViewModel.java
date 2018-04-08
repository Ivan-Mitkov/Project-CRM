package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Manager;
import com.example.demo.viewmodel.EmployeeViewModel;
import com.example.demo.viewmodel.ManagerViewModel;

public class ManagerToManagerViewModel implements 
Converter<Manager,ManagerViewModel>{

	@Override
	public ManagerViewModel convert(Manager source) {
		// TODO Auto-generated method stub
		return null;
	}

}
