package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.repositories.OpportunityRepository;
import com.example.demo.services.OpportunityService;
@Service
@Transactional
public class OpportunityServiceImpl implements OpportunityService {
	@Autowired
	private OpportunityRepository repository;
	

}
