package com.emp.app.Exc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GblExc {
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> namenotfound(NameNotFoundException n){
		return new ResponseEntity<>(n.getMessage(),HttpStatus.NOT_FOUND);
	}
}
