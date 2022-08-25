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
@Table(name="user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@OneToMany(mappedBy = ("user"))
	private Set<OrderBy> orderByBies;
	
	@OneToMany(mappedBy = ("user"))
	private Set<Account> accounts ;
	
	@OneToMany(mappedBy = ("user"))
	private Set<Cart> carts;
	
	@Column(name="hoTen")
	private String hoTen;
	
	@Column(name="diaChi")
	private String diaChi ;
	
	@Column(name="ngaySinh")
	private String ngaySinh ;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="sdt")
	private String sdt ;
	
	@Column(name="kieu")
	private int kieu ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getKieu() {
		return kieu;
	}
	public void setKieu(int kieu) {
		this.kieu = kieu;
	}
	
}
