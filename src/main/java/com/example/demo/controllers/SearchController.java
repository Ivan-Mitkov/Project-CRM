package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.searches.SearchByAccountAndContact;
import com.example.demo.serviceImpl.ConcurSearch;
import com.example.demo.services.SearchService;

@Controller
public class SearchController {
	Logger logger = LoggerFactory.getLogger(SearchController.class);
	private SearchService searchService;
	private SearchByAccountAndContact search;
	private ConcurSearch conSearch;
   
	
	@Autowired
	public SearchController(SearchService searchService, SearchByAccountAndContact search, ConcurSearch conSearch) {
		this.searchService = searchService;
		this.search = search;
		this.conSearch = conSearch;
	}

	
	@GetMapping("/search")
	public ModelAndView search(@RequestParam(name="name")String name,
			ModelAndView model) {		
		logger.info("Inside search controller!");
		if(name.isEmpty()) {
			model.setViewName("index");
			return model ;
		}
		else {
			
			logger.info("Searching for: "+name);			
//			search.setSearchAccounts(searchService.searchAccounts(name));
//			search.setSearchContacts(searchService.searchContacts(name));
			conSearch.makeSearch(search, name);
			//logger.info("Email: "+search.getSearchAccounts().get(1).getEmail());
			model.setViewName("search");
			model.addObject("search", search);
			return model;
		}
		
	}
	
	
	
}
