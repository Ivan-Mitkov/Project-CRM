package com.example.demo.converters.managerConverters;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.demo.bindingmodel.ManagerBindingModel;
import com.example.demo.entities.Account;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Event;
import com.example.demo.entities.Manager;
import com.example.demo.entities.Sale;
import com.example.demo.entities.Task;
import com.example.demo.serviceImpl.ManagerServiceImpl;

@Component
public class ManagerBindingModelToManager implements 
Converter<ManagerBindingModel, Manager>{

	private final ManagerServiceImpl service;
	
	
	public ManagerBindingModelToManager(ManagerServiceImpl service) {
		this.service = service;
	}


	@Nullable
	@Override
	public synchronized Manager convert(ManagerBindingModel source) {
		if(source==null) {
			return null;
		}
		String idNumber=source.getIdNumber();
		Optional<Manager> managerOptional =service.
										findManagerByIdNumber(idNumber);
		Manager em=new Manager();
		if(!managerOptional.isPresent()) {
			 List<Event> events=new ArrayList<>();
			 List<Employee> employees=new ArrayList<>();
			 List<Task> tasks=new ArrayList<>();
			 List<Account> accounts=new ArrayList<>();
			 List<Sale>sales=new ArrayList<>();
			 em.setAccounts(accounts);
			 em.setEmployees(employees);
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
