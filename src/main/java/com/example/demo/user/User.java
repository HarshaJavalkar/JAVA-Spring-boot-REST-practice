package com.example.demo.user;
import java.util.Date;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	
	
	private Integer Id ;
	
	@Size(min=2, message="Name should have atleast 2 chars")
	private String name ;
	
	@Past
	private Date date ;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", date=" + date + "]";
	}
	public User(Integer id, String name, Date date) {
		super();
		this.Id = id;
		this.name = name;
		this.date = date;
	}
}
