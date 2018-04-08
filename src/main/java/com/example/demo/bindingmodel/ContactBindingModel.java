package com.example.demo.bindingmodel;

import com.example.demo.entities.Account;
import com.example.demo.entities.Opportunity;

public class ContactBindingModel {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String reportTo;
	private boolean isContactable;
	private AccountBindingModel account;
	private OpportunityBindingModel opportunity;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getReportTo() {
		return reportTo;
	}
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}
	public boolean isContactable() {
		return isContactable;
	}
	public void setContactable(boolean isContactable) {
		this.isContactable = isContactable;
	}
	public AccountBindingModel getAccount() {
		return account;
	}
	public void setAccount(AccountBindingModel account) {
		this.account = account;
	}
	public OpportunityBindingModel getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(OpportunityBindingModel opportunity) {
		this.opportunity = opportunity;
	}
	
}
