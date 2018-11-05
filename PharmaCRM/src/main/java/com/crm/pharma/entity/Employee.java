package com.crm.pharma.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee  {
	private @Id @GeneratedValue Long id;
	private String userid;
	private String password;
	private String lastLogin;
	private String lastPassChange;
	public Employee (String userid, String password) {
		this.userid=userid;
		this.password=null;
		this.lastLogin=null;
		this.lastPassChange=null;
	}
	Employee(){}
	public String getName() {
		String[] parts = userid.split(" ");
		return parts[0];
	}
	public void setName(String name) {
		userid=name;
	}
	public String getLastName() {
		String[] parts = userid.split(" ");
		return parts[1];
	}
	public void setLastName(String name) {
		userid=userid+" "+name;
	}
}
