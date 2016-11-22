package com.amysto.web.service;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id private String id;
	private String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	
}
