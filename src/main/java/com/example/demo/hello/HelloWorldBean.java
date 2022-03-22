package com.example.demo.hello;

public class HelloWorldBean {

	private String message;
	private int currAge;
	

	public HelloWorldBean(String message, int age) {
		this.message = message;
		this.currAge=age;
	}

//	public void setMessage(String message) {
//		this.message = message;
//	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}
	public int getCurrAge() {
		return currAge;
	}

	public void setCurrAge(int currAge) {
		this.currAge = currAge;
	}	
	
}
