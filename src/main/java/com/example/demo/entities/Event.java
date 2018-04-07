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
import javax.persistence.OneToMany;
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
	private List<Employee> events;
	
	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	public Event(Adress location, String subject, String description, LocalDateTime dateAndTime,
			List<Employee> events) {
		this.location = location;
		this.subject = subject;
		this.description = description;
		this.dateAndTime = dateAndTime;
		this.events = events;
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
	
	public List<Employee> getEvents() {
		return events;
	}

	public void setEvents(List<Employee> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", location=" + location + ", subject=" + subject + ", description=" + description
				+ ", dateAndTime=" + dateAndTime + ", toAttend=" + events + "]";
	}
	
	
	
	
}
