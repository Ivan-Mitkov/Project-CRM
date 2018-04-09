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
		if(source==null) {
			return null;
		}
		EmployeeBindingModel em=new EmployeeBindingModel();
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
