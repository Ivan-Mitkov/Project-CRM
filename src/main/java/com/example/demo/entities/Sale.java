package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sale")
public class Sale {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@OneToOne(cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="employee_id")
	private Employee whoMakeThisSale;
	
	@Column(name="product")
	private Product product;
	
	@Column(name="quontity")
	private Double quontity;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="closed_at")
	private LocalDate closedAt;
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}
	public Sale(Employee whoMakeThisSale, Product product, Double quontity, Double price, LocalDate closedAt) {
		this.whoMakeThisSale = whoMakeThisSale;
		this.product = product;
		this.quontity = quontity;
		this.price = price;
		this.closedAt = closedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee getWhoMakeThisSale() {
		return whoMakeThisSale;
	}
	public void setWhoMakeThisSale(Employee whoMakeThisSale) {
		this.whoMakeThisSale = whoMakeThisSale;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
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
	@Override
	public String toString() {
		return "Sale [id=" + id + ", whoMakeThisSale=" + whoMakeThisSale + ", product=" + product + ", quontity="
				+ quontity + ", price=" + price + ", closedAt=" + closedAt + "]";
	}
	
	
	
}
