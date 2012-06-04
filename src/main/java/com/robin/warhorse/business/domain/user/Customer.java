package com.robin.warhorse.business.domain.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString(exclude="id")
public class Customer implements Actor, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 333069342926773633L;
	
	public Customer(){}
	
	public Customer(String customerName,String password,String name,UserRole userRole,int status,Date gmt_create){
		this.customerName = customerName;
		this.password = password;
		this.name = name;
		this.userRole = userRole;
		this.status = status;
		this.gmt_create = gmt_create;
	}
	
	@Setter @Getter private int id;
	
	@Setter @Getter private String customerName;
	
	@Setter @Getter private String password;
	
	@Setter @Getter private String name;
	
	@Setter @Getter private UserRole userRole;
	
	@Setter @Getter private int status;
	
	@Setter @Getter private Date gmt_create;

}
