package com.example.demo.viewmodel;


public class ContactViewModel {
	
	private Long id;

	private String name;
	

	private String email;
	
	
	private String phone;
	
	
	private String reportTo;
	
	
	private boolean isContactable;
	public ContactViewModel() {
		// TODO Auto-generated constructor stub
	}
	public ContactViewModel(String name, String email, String phone, String reportTo, boolean isContactable) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.reportTo = reportTo;
		this.isContactable = isContactable;
	}
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
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", reportTo="
				+ reportTo + ", isContactable=" + isContactable + "]";
	}
	
	
}
