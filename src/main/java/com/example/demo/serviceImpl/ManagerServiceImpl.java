package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Manager;
import com.example.demo.repositories.ManagerRepository;
import com.example.demo.services.ManagerService;

public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository repository;
	
	public ManagerServiceImpl(ManagerRepository repository) {
			this.repository = repository;
		}
	
	public Optional<Manager> findManagerByName(String name) {
		Optional<Manager> opManager=repository.findManagerByName(name);
		return opManager;
	}

	public Optional<Manager> findManagerByIdNumber(String idNumber) {
		Optional<Manager> opManager=repository.findManagerByByIdNumber(idNumber);
		return opManager;
	}

}
