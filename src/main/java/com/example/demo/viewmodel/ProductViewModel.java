package com.example.demo.viewmodel;


public class ProductViewModel {
	
	private Long id;
	
	private String category;
	
	private String name;
	
	private String code;
	
	private String description;
	
	private Double listPrice;
	
	private boolean isAvailable;
	
	public ProductViewModel() {
		// TODO Auto-generated constructor stub
	}
	public ProductViewModel(String category, String name, String code, String description, Double listPrice,
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
