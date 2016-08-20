package org.mapper;

import java.util.List;

import org.entity.Customer;


public interface CustomerMapper {
	
	public int insert(Customer customer);
	
	//public Customer selectCustomer();
	
	public List<Customer> findAllCustomer(String id);
	
	public List<Customer> findCustomers();
	
	//public Customer del(String id);
}
