package com.cybersoft.spring_group_project.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="typeId")
    Type type ;
	
	@ManyToOne
	@JoinColumn(name="providerId")
	Provider provider;
    
    @OneToMany(mappedBy = "product")
    private Set<OrderBy> orderBys;
	
	
	@Column(name="nameProduct")
    private String nameProduct;
	
	@Column(name="price")
    private double price;
	
	@Column(name="importPrice")
    private double  importPrice;
	
	@Column(name="promotion")
    private int promotion ;
	
	@Column(name="promotionPrice")
    private double promotionPrice;
	
	@Column(name="inventory")
    private int inventory;
	
	@Column(name="sellNumber")
    private int sellNumber ;
	
	@Column(name="hot")
    private int hot ;
	
	@Column(name="selling")
    private int selling;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getImportPrice() {
		return importPrice;
	}
	public void setImportPrice(double importPrice) {
		this.importPrice = importPrice;
	}
	public int getPromotion() {
		return promotion;
	}
	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	public double getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getSellNumber() {
		return sellNumber;
	}
	public void setSellNumber(int sellNumber) {
		this.sellNumber = sellNumber;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public int getSelling() {
		return selling;
	}
	public void setSelling(int selling) {
		this.selling = selling;
	}
//	public int getTypeId() {
//		return typeId;
//	}
//	public void setTypeId(int typeId) {
//		this.typeId = typeId;
//	}
//	public int getProviderId() {
//		return providerId;
//	}
//	public void setProviderId(int providerId) {
//		this.providerId = providerId;
//	}
    
}
