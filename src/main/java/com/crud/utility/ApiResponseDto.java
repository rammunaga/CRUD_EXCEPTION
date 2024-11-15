package com.crud.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiResponseDto {
	
	private int statusCode;//200,201,500,400,403
	private HttpStatus httpStatus;//Internal Server Error,Forbidden
	private String message;
	private LocalDateTime time;
	private String path;
	private String reason;
	

	public ApiResponseDto() {
		// TODO Auto-generated constructor stub
	}


	public ApiResponseDto(int statusCode, HttpStatus httpStatus, String message, LocalDateTime time, String path,
			String reason) {
		super();
		this.statusCode = statusCode;
		this.httpStatus = httpStatus;
		this.message = message;
		this.time = time;
		this.path = path;
		this.reason = reason;
	}


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}


	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}
	

	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ApiResponseDto [statusCode=" + statusCode + ", httpStatus=" + httpStatus + ", message=" + message
				+ ", time=" + time + ", path=" + path + "]";
	}
	
	
	

}
