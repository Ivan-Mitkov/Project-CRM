package com.example.demo.viewmodel;

import java.time.LocalDateTime;
import java.util.List;


public class EventViewModel {

	private Long id;
	
	private AdressViewModel location;
	
	private String subject;
	
	private String description;
	
	private LocalDateTime dateAndTime;
	
	private List<EmployeeViewModel> events;
	
	public EventViewModel() {
		// TODO Auto-generated constructor stub
	}
	
	public EventViewModel(AdressViewModel location, String subject, String description, LocalDateTime dateAndTime,
			List<EmployeeViewModel> events) {
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
	public AdressViewModel getLocation() {
		return location;
	}
	public void setLocation(AdressViewModel location) {
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
	
	public List<EmployeeViewModel> getEvents() {
		return events;
	}

	public void setEvents(List<EmployeeViewModel> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", location=" + location + ", subject=" + subject + ", description=" + description
				+ ", dateAndTime=" + dateAndTime + ", toAttend=" + events + "]";
	}
	
	
	
	
}
