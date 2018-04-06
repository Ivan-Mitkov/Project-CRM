package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="description")
	private String description;
	
	@Column(name="list_price")
	private Double listPrice;
	
	@Column(name="is_available")
	private boolean isAvailable;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String category, String name, String code, String description, Double listPrice,
			boolean isAvailable) {
		this.category = category;
		this.name = name;
		this.code = code;
		this.description = description;
		this.listPrice = listPrice;
		this.isAvailable = isAvailable;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getListPrice() {
		return listPrice;
	}
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", listPrice=" + listPrice + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	
}
