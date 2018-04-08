package com.example.demo.viewmodel;

import java.util.List;


public class EmployeeViewModel {

	private Long id;
	private String name;
	private String email;	
	private String phone;	
	private boolean isCurrentEmployee;
	
	private List<TaskViewModel> tasks;
		
	private List<AccountViewModel> accounts;
	
	private List<EventViewModel>events;
	
	private List<SaleViewModel>sales;
	
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
	public List<TaskViewModel> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskViewModel> tasks) {
		this.tasks = tasks;
	}
		
	public List<AccountViewModel> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountViewModel> accounts) {
		this.accounts = accounts;
	}
	

	public List<EventViewModel> getEvents() {
		return events;
	}

	public void setEvents(List<EventViewModel> events) {
		this.events = events;
	}

	public List<SaleViewModel> getSales() {
		return sales;
	}

	public void setSales(List<SaleViewModel> sales) {
		this.sales = sales;
	}

	
}
