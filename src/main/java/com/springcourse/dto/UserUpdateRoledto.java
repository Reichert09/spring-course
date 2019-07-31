package com.springcourse.dto;

import javax.validation.constraints.NotNull;

import com.springcourse.enums.Role;

public class UserUpdateRoledto {
	
	@NotNull(message = "role is required")
	private Role role;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
