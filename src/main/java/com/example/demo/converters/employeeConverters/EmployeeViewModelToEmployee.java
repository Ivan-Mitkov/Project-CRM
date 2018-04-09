package com.example.demo.converters.employeeConverters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Employee;
import com.example.demo.viewmodel.EmployeeViewModel;

@Component
public class EmployeeViewModelToEmployee implements 
Converter<EmployeeViewModel,Employee>{

	@Override
	public Employee convert(EmployeeViewModel source) {
		if(source==null) {
			return null;
		}
		Employee em=new Employee();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
