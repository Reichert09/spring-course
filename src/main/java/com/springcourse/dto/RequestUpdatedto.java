package com.springcourse.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.springcourse.domain.Request;
import com.springcourse.domain.RequestStage;
import com.springcourse.domain.User;
import com.springcourse.enums.RequestState;

public class RequestUpdatedto {

	@NotBlank(message = "subject is required")
	private String subject;
	private String description;
	
	@NotNull
	private RequestState requestState;
	
	@NotNull(message = "the owner can not be null")
	private User owner;
	private List<RequestStage> stages = new ArrayList<RequestStage>();
	
	
	
	public RequestUpdatedto(String subject, String description, User owner, List<RequestStage> stages) {
		super();
		this.subject = subject;
		this.description = description;
		this.owner = owner;
		this.stages = stages;
	}
	
	public RequestUpdatedto() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public List<RequestStage> getStages() {
		return stages;
	}
	public void setStages(List<RequestStage> stages) {
		this.stages = stages;
	}
	
	public Request transformToRequest() {
		Request request = new Request(null, this.subject, this.description, null, this.requestState, this.owner, this.stages);
		return request;
	}
	
}
