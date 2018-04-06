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
	
	@Column(name="task")
	private List<Task> tasks;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="employee_id")//foreign key in Event class 
	private List<Employee> employeesUnderManagement;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String email, String phone, boolean isManager, boolean isCurrentEmployee,
			List<Task> tasks, List<Employee> employeesUnderManagement) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isManager = isManager;
		this.isCurrentEmployee = isCurrentEmployee;
		this.tasks = tasks;
		this.employeesUnderManagement = employeesUnderManagement;
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
	public List<Employee> getEmployeesUnderManagement() {
		return employeesUnderManagement;
	}
	public void setEmployeesUnderManagement(List<Employee> employeesUnderManagement) {
		this.employeesUnderManagement = employeesUnderManagement;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", isManager="
				+ isManager + ", isCurrentEmployee=" + isCurrentEmployee + ", tasks=" + tasks
				+ ", employeesUnderManagement=" + employeesUnderManagement + "]";
	}
	
	
}
