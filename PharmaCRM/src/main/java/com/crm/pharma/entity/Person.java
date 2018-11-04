package com.crm.pharma.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
	private String name;
	private String surename;
	private Calendar creationDate;
	//protected Address address;
	public Person (String name, String sureName) { //, Date date){
		this.name=name;
		this.surename=name;
		//this.creationDate=date;
	}
	public Person (){
		
	}
}
