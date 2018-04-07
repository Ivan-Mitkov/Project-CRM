package com.example.demo.bindingmodel;

import com.example.demo.enums.Status;

public class TaskBindingModel {

	private Long id;
	
	private Status status;
	
	private  String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
