package com.amysto.web.service;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id private String id;
	private String firstName;
	private String lastName;
	
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	
	@Override
	public String toString() {
		return "User [firstname=" + firstName + ", lastname=" + firstName + "]";
	}
	
	
	
}
