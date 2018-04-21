package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="opportunity")
public class Opportunity {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@OneToMany(fetch=FetchType.LAZY
			,mappedBy="opportunity")	
	private List<Contact> contact;
	
	@Column(name="status")
	private String status;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY,			
	cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="account_id")
	private Account account;
	
	public Opportunity() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Opportunity(List<Contact> contact, String status, String description, Account account) {
		this.contact = contact;
		this.status = status;
		this.description = description;
		this.account = account;
	}




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
	
	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public String toString() {
		return "Opportunity [id=" + id + ", contact=" + contact + ", status=" + status + "]";
	}
	
}
