package com.example.demo.viewmodel;


public class AccountViewModel {
	
	private Long id;
	private String idNumber;
	private String name;
	private String email;
	private String phone;
	private AdressViewModel adress;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public AdressViewModel getAdress() {
		return adress;
	}
	public void setAdress(AdressViewModel adress) {
		this.adress = adress;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	

}
