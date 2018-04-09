package com.example.demo.bindingmodel;

import java.util.List;


public class EmployeeBindingModel {

	private Long id;
	private String name;
	private String email;	
	private String phone;	
	private ManagerBindingModel manager;
	private boolean isCurrentEmployee;
	
	
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
	
	public boolean isCurrentEmployee() {
		return isCurrentEmployee;
	}
	public void setCurrentEmployee(boolean isCurrentEmployee) {
		this.isCurrentEmployee = isCurrentEmployee;
	}
	
	public ManagerBindingModel getManager() {
		return manager;
	}
	public void setManager(ManagerBindingModel manager) {
		this.manager = manager;
	}

}
