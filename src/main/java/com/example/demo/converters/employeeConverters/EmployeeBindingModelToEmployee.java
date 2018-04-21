package com.example.demo.converters.employeeConverters;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.EmployeeBindingModel;
import com.example.demo.entities.Account;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Sale;
import com.example.demo.entities.Task;
import com.example.demo.serviceImpl.EmployeeServiceImpl;

@Component
public class EmployeeBindingModelToEmployee implements 
Converter<EmployeeBindingModel, Employee>{
	
	private final EmployeeServiceImpl service;
	
	
	public EmployeeBindingModelToEmployee(EmployeeServiceImpl service) {
		this.service = service;
	}
	@Nullable
	@Override
	public Employee convert(EmployeeBindingModel source) {
		if(source==null) {
			return null;
		}
		String idNumber=source.getIdNumber();
		Optional<Employee> employeeOptional =service.
										findEmployeeByIdNumber(idNumber);
		Employee em=new Employee();
		if(!employeeOptional.isPresent()) {
			 List<Event> events=new ArrayList<>();
			 List<Task> tasks=new ArrayList<>();
			 List<Account> accounts=new ArrayList<>();
			 List<Sale>sales=new ArrayList<>();
			 em.setAccounts(accounts);
			 em.setTasks(tasks);
			 em.setEvents(events);
			 em.setSales(sales);
			 
		}
		em.setIdNumber(source.getIdNumber());
		em.setName(source.getName());
		em.setPhone(source.getPhone());
		em.setEmail(source.getEmail());
		em.setCurrentEmployee(source.isCurrentEmployee());
		return em;
	}

}
