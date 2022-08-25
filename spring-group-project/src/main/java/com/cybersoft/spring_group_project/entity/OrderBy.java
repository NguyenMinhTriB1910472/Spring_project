package com.cybersoft.spring_group_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="orderBy")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrderBy {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;
	
	@ManyToOne
	@JoinColumn(name="prouctId")
	Product product;
	
	@Column(name = "quantity")
	private int quantity ;
	
	@Column(name = "sumMoney")
    private double sumMoney ;
	
	@Column(name = "status")
    private int status ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSumMoney() {
		return sumMoney;
	}
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
     
}
