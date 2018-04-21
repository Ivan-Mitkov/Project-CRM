package com.example.demo.viewmodel;


public class EventViewModel {

	private Long id;	
	private AdressViewModel location;	
	private String subject;	
	private String description;	
	private String dateAndTime;	
	
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
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
	
	
}
