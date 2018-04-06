package com.example.demo.entities;

import java.util.List;

public class Employee {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private boolean isManager;
	private boolean isCurrentEmployee;
	private List<Task> tasks;
	private List<Employee> employeesUnderManagement;
	
}
