package com.springcourse.dto;

import javax.validation.constraints.NotNull;

import com.springcourse.domain.Request;
import com.springcourse.domain.RequestStage;
import com.springcourse.domain.User;
import com.springcourse.enums.RequestState;

public class RequestStageSavedto {

	private String description;
	
	@NotNull(message = "state is required")
	private RequestState state;
	
	@NotNull(message = "request is required")
	private Request request;
	
	@NotNull(message = "owner is required")
	private User owner;
	
	public RequestStageSavedto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RequestStageSavedto(String description, RequestState state, Request request, User owner) {
		super();
		this.description = description;
		this.state = state;
		this.request = request;
		this.owner = owner;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public RequestState getState() {
		return state;
	}
	public void setState(RequestState state) {
		this.state = state;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public User getUser() {
		return owner;
	}
	public void setUser(User owner) {
		this.owner = owner;
	}
	
	public RequestStage transformToRequestStage() {
		RequestStage stage = new RequestStage(null, this.description, null, this.state, this.request, this.owner);
		return stage;
	}
	
}
