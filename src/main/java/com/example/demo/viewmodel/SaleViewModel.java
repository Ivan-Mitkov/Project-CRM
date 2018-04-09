package com.example.demo.viewmodel;

import java.time.LocalDate;

public class SaleViewModel {
	
	private Long id;
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
		LocalDate.of(closedAt.getYear(),closedAt.getMonth(),closedAt.getDayOfMonth());
	}
	
}
