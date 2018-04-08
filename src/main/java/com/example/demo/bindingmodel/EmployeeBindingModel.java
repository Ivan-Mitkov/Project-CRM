package com.example.demo.bindingmodel;

import java.util.List;


public class EmployeeBindingModel {

	private Long id;
	private String name;
	private String email;	
	private String phone;	
	private ManagerBindingModel manager;
	private boolean isCurrentEmployee;
	
	private List<TaskBindingModel> tasks;
	
	private List<EmployeeBindingModel> employees;
	
	private List<AccountBindingModel> accounts;
	
	private List<EventBindingModel>events;
	
	private List<SaleBindingModel>sales;
	
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
	public List<TaskBindingModel> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskBindingModel> tasks) {
		this.tasks = tasks;
	}
	public List<EmployeeBindingModel> getEmployees() {
		return employees;
	}
	public void setEmployees(List<EmployeeBindingModel> employees) {
		this.employees = employees;
	}
	
	public List<AccountBindingModel> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountBindingModel> accounts) {
		this.accounts = accounts;
	}
	

	public List<EventBindingModel> getEvents() {
		return events;
	}

	public void setEvents(List<EventBindingModel> events) {
		this.events = events;
	}

	public List<SaleBindingModel> getSales() {
		return sales;
	}

	public void setSales(List<SaleBindingModel> sales) {
		this.sales = sales;
	}
	public ManagerBindingModel getManager() {
		return manager;
	}
	public void setManager(ManagerBindingModel manager) {
		this.manager = manager;
	}

}
