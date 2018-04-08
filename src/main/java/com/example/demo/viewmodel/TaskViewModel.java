package com.example.demo.viewmodel;

import com.example.demo.enums.Status;

public class TaskViewModel {

	private Long id;
	
	private Status status;
	
	private  String description;
	
	private AccountViewModel account;
	
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
	public AccountViewModel getAccount() {
		return account;
	}
	public void setAccount(AccountViewModel account) {
		this.account = account;
	}
	
}
