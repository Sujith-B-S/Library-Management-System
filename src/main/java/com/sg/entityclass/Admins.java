package com.sg.entityclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class Admins {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aId")
	private int aId;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private String phone;
	
	
	public Admins() {
		super();
	}


	public Admins(int aId, String name, String email, String password, String address, String phone) {
		super();
		this.aId = aId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}


	public Admins(String name, String email, String password, String address, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Admins [aId=" + aId + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	

}
