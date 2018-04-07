package com.example.demo.viewmodel;

import java.util.List;

import com.example.demo.enums.Status;

public class OpportunityViewModel {
	
	private Long id;
	
	private List<ContactViewModel> contact;
	
	
	private Status status;
	
	
	public OpportunityViewModel() {
		// TODO Auto-generated constructor stub
	}
	
	public OpportunityViewModel(List<ContactViewModel> contact, Status status) {
		this.contact = contact;
		this.status = status;
	}

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
	
	public List<ContactViewModel> getContact() {
		return contact;
	}

	public void setContact(List<ContactViewModel> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Opportunity [id=" + id + ", contact=" + contact + ", status=" + status + "]";
	}
	
}
