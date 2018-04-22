package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.EmployeeService;
import com.example.demo.services.EventService;

@Controller
public class EmployeeController {
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	private final EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("employees/show")
	public String getAll(Model model) {

		logger.info("All employees ");
		return "employee/employees";
	}
	
	@GetMapping("employees/detail")
	public String getDetail(Model model) {
//		List<ProductViewModel> products = productService.findAllProducts();
//		model.addAttribute("products", products);
		logger.info("Employee detail ");
		return "employee/employeedetail";
	}
	
}
