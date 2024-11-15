package com.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserAlreadyExsistException extends RuntimeException {

	public UserAlreadyExsistException() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public UserAlreadyExsistException(String Message) {
		super(Message);
	}

}
