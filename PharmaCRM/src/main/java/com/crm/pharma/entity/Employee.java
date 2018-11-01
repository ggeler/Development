package com.crm.pharma.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee extends Person {
	private @Id @GeneratedValue Long id;
	private String userid;
	private String password;
	private String lastLogin;
	private String lastPassChange;
	Employee (String name, String surename) {
		super(name, surename);
	}
	public Long getId() {
		return id;
	}
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public String getLastPassChange() {
		return lastPassChange;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public void setLastPassChange(String lastPassChange) {
		this.lastPassChange = lastPassChange;
	}

}
