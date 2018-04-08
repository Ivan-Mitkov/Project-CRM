package com.example.demo.viewmodel;

import java.util.List;

import com.example.demo.entities.Account;

public class OpportunityViewModel {
	
	private Long id;
	private List<ContactViewModel> contact;
	private String status;
	private Account account;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<ContactViewModel> getContact() {
		return contact;
	}

	public void setContact(List<ContactViewModel> contact) {
		this.contact = contact;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}
