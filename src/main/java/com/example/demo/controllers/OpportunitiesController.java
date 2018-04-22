package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.services.OpportunityService;
import com.example.demo.viewmodel.OpportunityViewModel;

@Controller
public class OpportunitiesController {
	Logger logger = LoggerFactory.getLogger(OpportunitiesController.class);
	
	private final OpportunityService oppService;

	
	public OpportunitiesController(OpportunityService oppService) {
		this.oppService = oppService;
		logger.info("Inside OPP controller");
	}

	private static final String NEW_OPP_OPPFORM_URL = "opportunity/opportunityform";
	

	@GetMapping("opportunities/{id}/delete")
	public String deleteById(@PathVariable String id) {

		logger.info("Deleting id: " + id);

		oppService.deleteByIdNumber(id);
		return "redirect:/";
	}

	@GetMapping("opportunities/show")
	public String getAll(Model model) {
		List<OpportunityViewModel>opps = oppService.findAllOpportunities();
		model.addAttribute("opportunities", opps);
		logger.info("All opportunities ");
		return "opportunity/opportunities";
	}

	@GetMapping("opportunities/add")
	public String addAccount(Model model) {
		
		logger.info("Add opportunity ");
		return NEW_OPP_OPPFORM_URL;
	}
}
