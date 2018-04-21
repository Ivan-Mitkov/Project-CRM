package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.searches.SearchByAccountAndContact;
import com.example.demo.services.SearchService;

@Service
public class Worker {
	
	private SearchService service;
	private SearchByAccountAndContact search;
	@Autowired
	public Worker(SearchService service, SearchByAccountAndContact search) {
		this.service = service;
		this.search = search;
	}
	public void addAccounts(String searched, SearchByAccountAndContact search) {
		search.setSearchAccounts(service.searchAccounts(searched));
	}
	
	public void addContacts(String searched,SearchByAccountAndContact search) {
		search.setSearchContacts(service.searchContacts(searched));
	}
	
}
