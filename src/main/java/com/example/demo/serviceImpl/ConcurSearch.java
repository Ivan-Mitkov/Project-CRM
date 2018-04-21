package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.searches.SearchByAccountAndContact;
import com.example.demo.services.SearchService;

@Service
public class ConcurSearch {

	
	private SearchService service;
	private SearchByAccountAndContact search;
	@Autowired
	public ConcurSearch(SearchService service, Worker worker) {
		this.service = service;
		this.worker = worker;
	}
	Worker worker = new Worker(service,search);
	
	public SearchByAccountAndContact makeSearch(SearchByAccountAndContact search,
			String searched) {
		Thread t1= new Thread(() ->{
			worker.addAccounts(searched, search);
		});
		Thread t2= new Thread(() ->{
			worker.addContacts(searched, search);
		});
		t1.start();
		t2.start();
		 try {
	            t1.join();
	            t2.join();
	        }
	        catch (InterruptedException e){
	            e.printStackTrace();
	        }
		 return search;
	}
	
	
	

}
