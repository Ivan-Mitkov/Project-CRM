package com.example.demo.bindingmodel;

public class ContactBindingModel {
	
	private Long id;
	private String idNumber;
	private String name;
	private String email;
	private String phone;
	private String reportTo;
	private boolean isContactable;
	
	
	
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
	public boolean getIsContactable() {
		return isContactable;
	}
	public void setIsContactable(boolean isContactable) {
		this.isContactable = isContactable;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
}
