package com.example.demo.services;

import java.util.List;

import com.example.demo.viewmodel.ProductViewModel;

public interface ProductService {

	List<ProductViewModel> findAllProducts();

}
