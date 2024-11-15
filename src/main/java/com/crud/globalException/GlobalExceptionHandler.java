package com.crud.globalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crud.exception.UserAlreadyExsistException;
import com.crud.exception.UserNotFoundException;
import com.crud.utility.ApiResponseDto;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
	@ExceptionHandler(UserNotFoundException.class)
	public ApiResponseDto userNotFoundExceptionHandler(UserNotFoundException ex) {
		return createHttpResponseHelper(ex, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserAlreadyExsistException.class)
	public ApiResponseDto userAlreadyExistsExecption(UserAlreadyExsistException ex) {
		return createHttpResponseHelper(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	public ApiResponseDto createHttpResponseHelper(Exception ex,HttpStatus status) {
		ApiResponseDto apiResponseDto=new ApiResponseDto();
		apiResponseDto.setHttpStatus(status);
		apiResponseDto.setMessage(ex.getMessage());
		apiResponseDto.setStatusCode(status.value());
		apiResponseDto.setTime(LocalDateTime.now());
		return apiResponseDto;
	}
	
	

}
