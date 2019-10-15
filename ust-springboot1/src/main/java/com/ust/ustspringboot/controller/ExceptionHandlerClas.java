package com.ust.ustspringboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClas {

	
	@ExceptionHandler(Exception.class)
	public String catchException() {
		System.out.println("Handle Exception");
		return "Handle Exception";
	}
}
  