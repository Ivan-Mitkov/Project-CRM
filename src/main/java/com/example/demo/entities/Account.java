package com.example.demo.entities;

import java.util.List;

public class Account {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private Adress adress;
	private Adress billingAdress;
	private Adress shippingAdress;
	private List<Contact>contacts;
	private List<Event> events;
	private List<Task> tasks;
	private List<Opportunity> opportunities;
	private List<Employee> workingForThisAccount;
	private List<Sale> salesForThisAccount;
}
