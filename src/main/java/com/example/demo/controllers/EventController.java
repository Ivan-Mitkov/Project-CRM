package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.EventService;
import com.example.demo.services.ProductService;

@Controller
public class EventController {
	Logger logger = LoggerFactory.getLogger(EventController.class);
	private final EventService eventService;
	public EventController(EventService eventService) {
		this.eventService = eventService;
		logger.info("Inside EVENT CONTROLLER ");
	}

	
	@GetMapping("events/show")
	public String getAll(Model model) {
//		List<ProductViewModel> products = productService.findAllProducts();
//		model.addAttribute("products", products);
		logger.info("All eventss ");
		return "event/events";
	}
	
	@GetMapping("events/detail")
	public String getDetail(Model model) {
//		List<ProductViewModel> products = productService.findAllProducts();
//		model.addAttribute("products", products);
		logger.info("Event detail ");
		return "event/eventdetail";
	}
	
}
