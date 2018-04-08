package com.example.demo.entities;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sale")
public class Sale {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@ManyToOne(cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="manager_id")
	private Manager manager;
	
	@OneToOne(fetch=FetchType.LAZY,cascade= 
		{CascadeType.DETACH,
		CascadeType.MERGE,
		CascadeType.PERSIST,
		CascadeType.REFRESH})
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="quontity")
	private Double quontity;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="closed_at")
	private LocalDate closedAt;
	
	@ManyToOne(fetch=FetchType.LAZY,			
			cascade= 
				{CascadeType.DETACH,
				CascadeType.MERGE,
				CascadeType.PERSIST,
				CascadeType.REFRESH})
			@JoinColumn(name="account_id")
	private Account account;
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Sale(Employee employee, Product product, Double quontity, Double price, LocalDate closedAt,
			Account account) {
		this.employee = employee;
		this.product = product;
		this.quontity = quontity;
		this.price = price;
		this.closedAt = closedAt;
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getQuontity() {
		return quontity;
	}

	public void setQuontity(Double quontity) {
		this.quontity = quontity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(LocalDate closedAt) {
		this.closedAt = closedAt;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
