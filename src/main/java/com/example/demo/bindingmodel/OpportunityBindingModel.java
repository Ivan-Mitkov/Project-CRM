package com.example.demo.bindingmodel;

import java.util.List;

public class OpportunityBindingModel {
	
	private Long id;
	private List<ContactBindingModel> contact;
	private String status;
	private AccountBindingModel account;

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
	
	public List<ContactBindingModel> getContact() {
		return contact;
	}

	public void setContact(List<ContactBindingModel> contact) {
		this.contact = contact;
	}
	public AccountBindingModel getAccount() {
		return account;
	}
	public void setAccount(AccountBindingModel account) {
		this.account = account;
	}
	
}
