package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.converters.opportunityConverters.OpportunityToOpportunityViewModel;
import com.example.demo.converters.productConverters.ProductToProductViewModel;
import com.example.demo.repositories.OpportunityRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.services.ProductService;
import com.example.demo.viewmodel.ProductViewModel;

@Repository
public class ProductServiceImpl implements ProductService {
	private final ProductRepository repository;
	private final ProductToProductViewModel productToProductViewModel;
	
	
	
	public ProductServiceImpl(ProductRepository repository, ProductToProductViewModel productToProductViewModel) {
		this.repository = repository;
		this.productToProductViewModel = productToProductViewModel;
	}



	@Override
	public List<ProductViewModel> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
