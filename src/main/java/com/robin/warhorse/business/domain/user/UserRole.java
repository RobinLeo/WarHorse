package com.robin.warhorse.business.domain.user;

import lombok.Getter;

public enum UserRole{
	
	ADMIN(0, "admin", "系统管理员"),
	Customer(1, "customer", "访问者");
	
	private final @Getter int code;
	
	private final @Getter String roleName;
	
	private final @Getter String desc;
	
	private UserRole(int code, String roleName, String desc){
		this.code = code;
		this.roleName = roleName;
		this.desc = desc;
		
	}
	
}
