package com.example.demo.bindingmodel;

import java.util.List;


public class AccountBindingModel {
	
	private long id;
	private String name;
	private String email;
	private String phone;
	private AdressBindingModel adress;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public AdressBindingModel getAdress() {
		return adress;
	}
	public void setAdress(AdressBindingModel adress) {
		this.adress = adress;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
