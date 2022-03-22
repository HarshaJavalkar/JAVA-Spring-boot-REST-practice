package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {
//	time stamp
//	message 
//	detail
	
	private Date timestamp;
	private String message ;
	private String detail;
	public ExceptionResponse(Date timestamp, String message, String detail) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detail = detail;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetail() {
		return detail;
	}
	
}
