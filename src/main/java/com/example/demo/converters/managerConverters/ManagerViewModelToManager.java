package com.example.demo.converters.managerConverters;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Manager;
import com.example.demo.viewmodel.EmployeeViewModel;
import com.example.demo.viewmodel.ManagerViewModel;

public class ManagerViewModelToManager implements 
Converter<ManagerViewModel,Manager>{

	@Override
	public Manager convert(ManagerViewModel source) {
		// TODO Auto-generated method stub
		return null;
	}

}
