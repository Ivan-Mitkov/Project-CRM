package com.example.demo.bindingmodel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AccountBindingModel {
	
	private Long id;
	@NotNull
	@NotBlank(message="Id Number is required\n")
	@Size(min=1,message="Id Number is empty ")
	private String idNumber;
	
	@NotNull
	@NotBlank(message="Name is required\n")
	@Size(min=1,message="Name is empty ")
	private String name;
	
	@Email(message="please enter a valid email")
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
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
