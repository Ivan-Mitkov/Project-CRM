package com.example.demo.viewmodel;

import java.time.LocalDate;

public class SaleViewModel {
	
	private Long id;
	private EmployeeViewModel employee;
	private ManagerViewModel manager;
	private ProductViewModel product;
	private Double quontity;
	private Double price;
	private LocalDate closedAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public EmployeeViewModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeViewModel employee) {
		this.employee = employee;
	}



	public ProductViewModel getProduct() {
		return product;
	}
	public void setProduct(ProductViewModel product) {
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
	public ManagerViewModel getManager() {
		return manager;
	}
	public void setManager(ManagerViewModel manager) {
		this.manager = manager;
	}

}
