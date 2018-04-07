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
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="is_manager")
	private boolean isManager;
	
	@Column(name="is_current_employee")
	private boolean isCurrentEmployee;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="task_id")
	private List<Task> tasks;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="employee_id")//foreign key in Event class 
	private List<Employee> employees;
	

	@ManyToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinTable(
			name="account_employee",
			joinColumns=@JoinColumn(name="employee_id"),
			inverseJoinColumns=@JoinColumn(name="account_id")
			)
	private List<Account> accounts;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinTable(
			name="event_employee",
			joinColumns=@JoinColumn(name="employee_id"),
			inverseJoinColumns=@JoinColumn(name="event_id")
			)
	private List<Event>events;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="sale_id")
	private List<Sale>sales;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, String email, String phone, boolean isManager, boolean isCurrentEmployee,
			List<Task> tasks, List<Employee> employees, List<Account> accounts, List<Event> events) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isManager = isManager;
		this.isCurrentEmployee = isCurrentEmployee;
		this.tasks = tasks;
		this.employees = employees;
		this.accounts = accounts;
		this.events = events;
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
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public boolean isCurrentEmployee() {
		return isCurrentEmployee;
	}
	public void setCurrentEmployee(boolean isCurrentEmployee) {
		this.isCurrentEmployee = isCurrentEmployee;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	

	public List<Event> getEvents() {
		return events;
	}



	public void setEvents(List<Event> events) {
		this.events = events;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", isManager="
				+ isManager + ", isCurrentEmployee=" + isCurrentEmployee + ", tasks=" + tasks
				+ ", employeesUnderManagement=" + employees + "]";
	}
	
	
}
