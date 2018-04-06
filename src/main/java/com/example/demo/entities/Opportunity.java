package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.enums.Status;

@Entity
@Table(name="opportunity")
public class Opportunity {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="contact_id")//foreign key in Event class 
	private Contact contact;
	
	@Column(name="status")
	private Status status;
	
	
	public Opportunity() {
		// TODO Auto-generated constructor stub
	}
	public Opportunity(Contact contact, Status status) {
		this.contact = contact;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Opportunity [id=" + id + ", contact=" + contact + ", status=" + status + "]";
	}
	
}
