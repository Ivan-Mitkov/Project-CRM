package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Employee;
import com.example.demo.viewmodel.EmployeeViewModel;

@Component
public class EmployeeToEmployeeViewModel implements 
Converter<Employee,EmployeeViewModel>{

	@Override
	public EmployeeViewModel convert(Employee source) {
		if(source==null) {
			return null;
		}
		EmployeeViewModel em=new EmployeeViewModel();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
