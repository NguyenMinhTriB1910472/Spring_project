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
@Table(name="provider")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Provider {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@OneToMany(mappedBy = "provider")
	Set<Provider> providers;
	
	@Column(name="adress")
	private String adress;
	
	@Column(name="email")
	private String email;
	
	@Column(name="tel")
	private String tel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
