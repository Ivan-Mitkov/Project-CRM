package com.example.demo.viewmodel;

import java.util.List;


public class AccountViewModel {
	
	private Long id;
	
	
	private String name;
	
	private String email;

	private String phone;
	
	
	private AdressViewModel adress;
	
	
	private List<ContactViewModel>contacts;
	
	
	private List<EventViewModel> events;
	
	
	private List<TaskViewModel> tasks;
	
	
	private List<OpportunityViewModel> opportunities;
	
	
	private List<EmployeeViewModel> workingForThisAccount;
	
	
	private List<SaleViewModel> salesForThisAccount;
	
	
	public AccountViewModel() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountViewModel(String name, String email, String phone, AdressViewModel adress, List<ContactViewModel> contacts, List<EventViewModel> events,
			List<TaskViewModel> tasks, List<OpportunityViewModel> opportunities, List<EmployeeViewModel> workingForThisAccount,
			List<SaleViewModel> salesForThisAccount) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
		this.contacts = contacts;
		this.events = events;
		this.tasks = tasks;
		this.opportunities = opportunities;
		this.workingForThisAccount = workingForThisAccount;
		this.salesForThisAccount = salesForThisAccount;
	}



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
	
	public List<ContactViewModel> getContacts() {
		return contacts;
	}
	public void setContacts(List<ContactViewModel> contacts) {
		this.contacts = contacts;
	}
	public List<EventViewModel> getEvents() {
		return events;
	}
	public void setEvents(List<EventViewModel> events) {
		this.events = events;
	}
	public List<TaskViewModel> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskViewModel> tasks) {
		this.tasks = tasks;
	}
	public List<OpportunityViewModel> getOpportunities() {
		return opportunities;
	}
	public void setOpportunities(List<OpportunityViewModel> opportunities) {
		this.opportunities = opportunities;
	}
	public List<EmployeeViewModel> getWorkingForThisAccount() {
		return workingForThisAccount;
	}
	public void setWorkingForThisAccount(List<EmployeeViewModel> workingForThisAccount) {
		this.workingForThisAccount = workingForThisAccount;
	}
	public List<SaleViewModel> getSalesForThisAccount() {
		return salesForThisAccount;
	}
	public void setSalesForThisAccount(List<SaleViewModel> salesForThisAccount) {
		this.salesForThisAccount = salesForThisAccount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	
}
