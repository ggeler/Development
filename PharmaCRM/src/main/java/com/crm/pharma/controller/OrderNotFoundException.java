package com.crm.pharma.controller;

public class OrderNotFoundException extends RuntimeException{

	Long id;
	OrderNotFoundException(){}
	OrderNotFoundException(Long id){
		this.id=id;
	}
	//@Override
	public String getMessage (){
		return "Order ID# "+id+" not found!";
		
	}
}
