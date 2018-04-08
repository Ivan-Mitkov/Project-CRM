package com.example.demo.bindingmodel;

import java.time.LocalDate;

public class SaleBindingModel {
	
	private Long id;
	private EmployeeBindingModel employee;
	private ManagerBindingModel manager;
	private ProductBindingModel product;
	private Double quontity;
	private Double price;
	private LocalDate closedAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public EmployeeBindingModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBindingModel employee) {
		this.employee = employee;
	}

	public ProductBindingModel getProduct() {
		return product;
	}
	public void setProduct(ProductBindingModel product) {
		this.product = product;
	}
	public Double getQuontity() {
		return quontity;
	}
	public void setQuontity(Double quontity) {
		this.quontity = quontity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getClosedAt() {
		return closedAt;
	}
	public void setClosedAt(LocalDate closedAt) {
		this.closedAt = closedAt;
	}
	public ManagerBindingModel getManager() {
		return manager;
	}
	public void setManager(ManagerBindingModel manager) {
		this.manager = manager;
	}

	
}
