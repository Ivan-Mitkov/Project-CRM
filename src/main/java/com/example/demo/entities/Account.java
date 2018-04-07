package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")//actual name of the column
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@OneToOne(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="adress_id")
	private Adress adress;
	
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH},
		mappedBy="account")
	
	private List<Contact>contacts;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,
			mappedBy="account")
	private List<Event> events;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,
			mappedBy="account")
	private List<Task> tasks;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,
	mappedBy="account")
	private List<Opportunity> opportunities;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinTable(
			name="account_employee",
			joinColumns=@JoinColumn(name="account_id"),
			inverseJoinColumns=@JoinColumn(name="employee_id")
			)
	private List<Employee> workingForThisAccount;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH},mappedBy="account")
	
	private List<Sale> salesForThisAccount;
	
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name, String email, String phone, Adress adress, List<Contact> contacts, List<Event> events,
			List<Task> tasks, List<Opportunity> opportunities, List<Employee> workingForThisAccount,
			List<Sale> salesForThisAccount) {
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<Opportunity> getOpportunities() {
		return opportunities;
	}
	public void setOpportunities(List<Opportunity> opportunities) {
		this.opportunities = opportunities;
	}
	public List<Employee> getWorkingForThisAccount() {
		return workingForThisAccount;
	}
	public void setWorkingForThisAccount(List<Employee> workingForThisAccount) {
		this.workingForThisAccount = workingForThisAccount;
	}
	public List<Sale> getSalesForThisAccount() {
		return salesForThisAccount;
	}
	public void setSalesForThisAccount(List<Sale> salesForThisAccount) {
		this.salesForThisAccount = salesForThisAccount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	
}
