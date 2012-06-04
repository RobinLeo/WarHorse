package com.robin.warhorse.business.domain.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString(exclude="id")
public class Administrator implements Actor , Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6328178293550295263L;

	public Administrator (){}
	
	public Administrator (String adminName,String password){
		this.adminName = adminName;
		this.password = password;
	}
	@Setter @Getter private String id;
	
	@Setter @Getter private String adminName;
	
	@Setter @Getter private String password;
	
	@Setter @Getter private String name;
	
	@Setter @Getter private UserRole userRole;
	
	@Setter @Getter private int status ;
	
	@Setter @Getter private Date gmt_create;
	
}
