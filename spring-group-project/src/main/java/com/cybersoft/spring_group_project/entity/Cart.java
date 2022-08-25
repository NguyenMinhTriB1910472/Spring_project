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
@Table(name="cart")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cart {
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
	
	@Column(name = "userId")
	private int userId ;
	
	@Column(name = "productId")
	private int productId ;
	
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
}
