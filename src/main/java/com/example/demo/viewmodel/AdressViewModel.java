package com.example.demo.viewmodel;


public class AdressViewModel {

	private Long id;
	private String country;
	private String city;
	private String street;
	private Integer streetNumber;
	private String additionalAdressInfo;
	
	public AdressViewModel() {
		// TODO Auto-generated constructor stub
	}
	public AdressViewModel(String country, String city, String street, Integer streetNumber, String additionalAdressInfo) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
		this.additionalAdressInfo = additionalAdressInfo;
	}
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
	@Override
	public String toString() {
		return "Adress [id=" + id + ", country=" + country + ", city=" + city + ", street=" + street + ", streetNumber="
				+ streetNumber + ", additionalAdressInfo=" + additionalAdressInfo + "]";
	}
	
	
}
