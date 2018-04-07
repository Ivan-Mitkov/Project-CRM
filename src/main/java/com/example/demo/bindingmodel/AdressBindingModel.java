package com.example.demo.bindingmodel;


public class AdressBindingModel {

	private Long id;
	private String country;
	private String city;
	private String street;
	private Integer streetNumber;
	private String additionalAdressInfo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getAdditionalAdressInfo() {
		return additionalAdressInfo;
	}
	public void setAdditionalAdressInfo(String additionalAdressInfo) {
		this.additionalAdressInfo = additionalAdressInfo;
	}
	
}
