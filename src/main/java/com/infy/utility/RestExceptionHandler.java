package com.infy.utility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infy.exception.InfyBankException;

@RestControllerAdvice
public class RestExceptionHandler {
	
	@Autowired
	Environment environment;
	@ExceptionHandler(InfyBankException.class)
	public ResponseEntity<String> infyBankExceptionHanlder(InfyBankException e)
	{
		ResponseEntity<String> response =  new ResponseEntity<String>(environment.getProperty(e.getMessage()),HttpStatus.NOT_FOUND);
		return response;
	}

}
