package com.springcourse.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserLogindto {

	@Email(message = "Invalid email address")
	private String email;
	
	@NotBlank(message = "password is required")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserLogindto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	
}
