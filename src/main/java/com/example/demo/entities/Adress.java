package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adress")
public class Adress {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="country")
	private String country;
	
	@Column(name="city")
	private String city;
	
	@Column(name="street")
	private String street;
	
	@Column(name="street_number")
	private Integer streetNumber;
	
	@Column(name="additional_info")
	private String additionalAdressInfo;
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	public Adress(String country, String city, String street, Integer streetNumber, String additionalAdressInfo) {
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
