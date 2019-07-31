package com.springcourse.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.springcourse.domain.Request;
import com.springcourse.domain.RequestStage;
import com.springcourse.domain.User;


public class UserUpdatedto {

	@NotBlank
	private String name;
	
	@Email
	private String email;
	
	@Size(min = 7, max = 99, message = "password must be between 7 and 99")
	private String password;
	
	private List<Request> requests = new ArrayList<Request>();
	private List<RequestStage> stages = new ArrayList<RequestStage>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	public List<Request> getRequests() {
		return requests;
	}
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	public List<RequestStage> getStages() {
		return stages;
	}
	public void setStages(List<RequestStage> stages) {
		this.stages = stages;
	}
	
	public User transformToUser() {
		User user = new User(null, this.name, this.email, this.password, null, this.requests, this.stages);
		return user;
	}
	
	
}
