package com.crm.pharma.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND) //value=HttpStatus.NOT_FOUND, reason="Error: Empleado No Encontrado.") // 404
	public String orderNotFoundHandler(OrderNotFoundException ex) {
		return ex.getMessage();
	}

}
