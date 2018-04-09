package com.example.demo.viewmodel;

import java.util.List;


public class EmployeeViewModel {

	private Long id;
	private String idNumber;
	private String name;
	private String email;	
	private String phone;	
	private boolean isCurrentEmployee;
	private ManagerViewModel manager;
	
	
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
	
	public ManagerViewModel getManager() {
		return manager;
	}
	public void setManager(ManagerViewModel manager) {
		this.manager = manager;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	
}
