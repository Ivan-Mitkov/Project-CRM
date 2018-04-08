package com.example.demo.viewmodel;

import com.example.demo.entities.Account;
import com.example.demo.entities.Opportunity;

public class ContactViewModel {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String reportTo;
	private boolean isContactable;
	private AccountViewModel account;
	private OpportunityViewModel opportunity;
	
	
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
	public AccountViewModel getAccount() {
		return account;
	}
	public void setAccount(AccountViewModel account) {
		this.account = account;
	}
	public OpportunityViewModel getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(OpportunityViewModel opportunity) {
		this.opportunity = opportunity;
	}
	
	
}
