package com.example.demo.bindingmodel;

import java.util.List;


public class AccountBindingModel {
	
	private long id;
	private String name;
	private String email;
	private String phone;
	private AdressBindingModel adress;
	
	private List<ContactBindingModel>contacts;
	
	private List<EventBindingModel> events;	
	
	private List<TaskBindingModel> tasks;	
	
	private List<OpportunityBindingModel> opportunities;	
	
	private List<EmployeeBindingModel> workingForThisAccount;	
	
	private List<ManagerBindingModel> managersWorkingForThisAccount;

	private List<SaleBindingModel> salesForThisAccount;	

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
	
	public List<ContactBindingModel> getContacts() {
		return contacts;
	}
	public void setContacts(List<ContactBindingModel> contacts) {
		this.contacts = contacts;
	}
	public List<EventBindingModel> getEvents() {
		return events;
	}
	public void setEvents(List<EventBindingModel> events) {
		this.events = events;
	}
	public List<TaskBindingModel> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskBindingModel> tasks) {
		this.tasks = tasks;
	}
	public List<OpportunityBindingModel> getOpportunities() {
		return opportunities;
	}
	public void setOpportunities(List<OpportunityBindingModel> opportunities) {
		this.opportunities = opportunities;
	}
	public List<EmployeeBindingModel> getWorkingForThisAccount() {
		return workingForThisAccount;
	}
	public void setWorkingForThisAccount(List<EmployeeBindingModel> workingForThisAccount) {
		this.workingForThisAccount = workingForThisAccount;
	}
	public List<SaleBindingModel> getSalesForThisAccount() {
		return salesForThisAccount;
	}
	public void setSalesForThisAccount(List<SaleBindingModel> salesForThisAccount) {
		this.salesForThisAccount = salesForThisAccount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<ManagerBindingModel> getManagersWorkingForThisAccount() {
		return managersWorkingForThisAccount;
	}
	public void setManagersWorkingForThisAccount(List<ManagerBindingModel> managersWorkingForThisAccount) {
		this.managersWorkingForThisAccount = managersWorkingForThisAccount;
	}
	
	
}
