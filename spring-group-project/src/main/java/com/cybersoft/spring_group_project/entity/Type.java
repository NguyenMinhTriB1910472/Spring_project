package com.cybersoft.spring_group_project.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Type {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@OneToMany(mappedBy = "type")
	Set<Product> products;
	
	@Column(name = "type")
    private String type;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
}
