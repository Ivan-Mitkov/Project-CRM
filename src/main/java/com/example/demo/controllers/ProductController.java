package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.ProductService;
import com.example.demo.viewmodel.ProductViewModel;

@Controller
public class ProductController {
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	private final ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
		logger.info("Inside PRODUCT CONTROLLER ");
	}

	
	@GetMapping("products/show")
	public String getAll(Model model) {
//		List<ProductViewModel> products = productService.findAllProducts();
//		model.addAttribute("products", products);
		logger.info("All products ");
		return "product/products";
	}
	
	@GetMapping("products/detail")
	public String getDetail(Model model) {
//		List<ProductViewModel> products = productService.findAllProducts();
//		model.addAttribute("products", products);
		logger.info("All products ");
		return "product/productdetail";
	}
	
}
