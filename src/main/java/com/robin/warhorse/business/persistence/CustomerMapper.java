package com.robin.warhorse.business.persistence;

import com.robin.warhorse.business.domain.user.Customer;
import com.robin.warhorse.business.domain.user.UserRole;

public interface CustomerMapper {
	
	public int insertCustomer(Customer customer);
	
	public int updateCustomer(Customer customer);
	
	public int deleteCustomer(int customerId);
	
	public Customer selectCustomerByParams(String customerName,String password,UserRole userRole,int status);

}
