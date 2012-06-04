package com.robin.warhorse.business.service;

import java.util.List;

import com.robin.warhorse.business.domain.user.Customer;
import com.robin.warhorse.business.domain.user.UserRole;

public interface ICustomerService {

	public Customer getCustomerByName(String customerName,String password,UserRole userRole,int status);

	public boolean saveCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomers(List<Integer> listIds);

}
