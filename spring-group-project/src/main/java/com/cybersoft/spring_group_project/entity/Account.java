package com.cybersoft.spring_group_project.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="account")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Account {
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "passWord")
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
