package com.example.demo.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	 @RequestMapping({"", "/", "/index"})
	public class HomeController {
		Logger logger=LoggerFactory.getLogger(HomeController.class);
		 @RequestMapping({"", "/", "/index"})
		 public String getIndexPage(Model model) {
		        logger.info("Inside home controller");

		        return "index";
		    }

}
