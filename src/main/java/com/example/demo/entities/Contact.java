package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="report_to")
	private String reportTo;
	
	@Column(name="is_contactable")
	private boolean isContactable;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email, String phone, String reportTo, boolean isContactable) {
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
