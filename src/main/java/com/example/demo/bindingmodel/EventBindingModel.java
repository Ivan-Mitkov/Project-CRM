package com.example.demo.bindingmodel;

import java.util.List;

//must add account
public class EventBindingModel {

	private Long id;	
	private AdressBindingModel location;	
	private String subject;	
	private String description;	
	private String dateAndTime;	
	private List<EmployeeBindingModel> events;
	private List<ManagerBindingModel> managersAttendingEvents;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AdressBindingModel getLocation() {
		return location;
	}
	public void setLocation(AdressBindingModel location) {
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
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	public List<EmployeeBindingModel> getEvents() {
		return events;
	}

	public void setEvents(List<EmployeeBindingModel> events) {
		this.events = events;
	}
	public List<ManagerBindingModel> getManagersAttendingEvents() {
		return managersAttendingEvents;
	}
	public void setManagersAttendingEvents(List<ManagerBindingModel> managersAttendingEvents) {
		this.managersAttendingEvents = managersAttendingEvents;
	}

	
}
