package com.example.demo.bindingmodel;

public class ManagerBindingModel {
	
	private String idNumber;
	private String name;
	private String email;	
	private String phone;	
	private boolean isCurrentEmployee;
	
	
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

	public boolean isCurrentEmployee() {
		return isCurrentEmployee;
	}
	public void setCurrentEmployee(boolean isCurrentEmployee) {
		this.isCurrentEmployee = isCurrentEmployee;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
}
