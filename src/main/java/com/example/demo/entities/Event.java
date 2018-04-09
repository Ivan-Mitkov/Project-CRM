package com.example.demo.entities;

import java.time.LocalDateTime;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="adress_id")
	private Adress location;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date_and_time")
	private LocalDateTime dateAndTime;
	
	@ManyToOne(fetch=FetchType.LAZY,			
			cascade= 
				{CascadeType.DETACH,
				CascadeType.MERGE,
				CascadeType.PERSIST,
				CascadeType.REFRESH})
			@JoinColumn(name="account_id")
	private Account account;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinTable(
			name="event_employee",
			joinColumns=@JoinColumn(name="event_id"),
			inverseJoinColumns=@JoinColumn(name="employee_id")
			)
	private List<Employee> employee;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinTable(
			name="event_manager",
			joinColumns=@JoinColumn(name="event_id"),
			inverseJoinColumns=@JoinColumn(name="manager_id")
			)
	private List<Manager> manager;
	public Event() {
		// TODO Auto-generated constructor stub
	}
	


	public Event(Adress location, String subject, String description, LocalDateTime dateAndTime, Account account,
			List<Employee> employee, List<Manager> manager) {
		this.location = location;
		this.subject = subject;
		this.description = description;
		this.dateAndTime = dateAndTime;
		this.account = account;
		this.employee = employee;
		this.manager = manager;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Adress getLocation() {
		return location;
	}
	public void setLocation(Adress location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
	
	public List<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}



	public List<Manager> getManager() {
		return manager;
	}



	public void setManager(List<Manager> manager) {
		this.manager = manager;
	}



	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

		
	
}
