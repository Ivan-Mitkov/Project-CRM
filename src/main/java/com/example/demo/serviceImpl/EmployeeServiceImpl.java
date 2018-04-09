package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Manager;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.ManagerRepository;
import com.example.demo.services.ManagerService;

public class EmployeeServiceImpl implements ManagerService {

	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeServiceImpl(EmployeeRepository repository) {
			this.repository = repository;
		}
	
	public Optional<Employee> findEmployeeByName(String name) {
		Optional<Employee> opEmployee=repository.findEmployeeByName(name);
		return opEmployee;
	}

	public Optional<Employee> findEmployeeByIdNumber(String idNumber) {
		Optional<Employee> opEmployee=repository.findEmployeeByByIdNumber(idNumber);
		return opEmployee;
	}

}
