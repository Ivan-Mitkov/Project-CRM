package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.enums.Status;

@Entity
@Table(name="task")
public class Task {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="status")
	private Status status;
	
	@Column(name="description")
	private  String description;
	
	@ManyToOne(fetch=FetchType.LAZY,			
			cascade= 
				{CascadeType.DETACH,
				CascadeType.MERGE,
				CascadeType.PERSIST,
				CascadeType.REFRESH})
			@JoinColumn(name="account_id")
	private Account account;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	public Task(Status status, String description, Account account) {
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
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", status=" + status + ", description=" + description + "]";
	}
	
	
	
}
