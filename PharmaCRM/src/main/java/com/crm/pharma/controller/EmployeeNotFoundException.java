package com.crm.pharma.controller;

public class EmployeeNotFoundException extends RuntimeException{

	Long id;
	EmployeeNotFoundException(){}
	EmployeeNotFoundException(Long id){
		this.id=id;
	}
	//@Override
	public String getMessage (){
		return "Employee ID# "+id+" not found!";
		
	}
}
