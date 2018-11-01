package com.crm.pharma.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
	private String name;
	private String surename;
	//protected Address address;
	public Person (String name, String sureName){
		this.name=name;
		this.surename=name;
	}
	public Person (){
		
	}
}
