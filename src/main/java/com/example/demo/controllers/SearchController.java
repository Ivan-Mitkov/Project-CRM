package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.serviceImpl.AccountServiceImpl;
import com.example.demo.services.SearchService;
import com.example.demo.viewmodel.AccountViewModel;

@Controller
public class SearchController {
	@Autowired
	private SearchService searchService;
	Logger logger = LoggerFactory.getLogger(SearchController.class);
	
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
			List<AccountViewModel>accounts=new ArrayList<>();
			accounts=searchService.searchAccounts(name);
			model.setViewName("search");
			model.addObject("accounts", accounts);
			return model;
		}
		
	}
	
	
	
}
