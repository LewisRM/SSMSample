package org.service;


import java.util.List;

import org.entity.Customer;

public interface CustomerService {
	
	
	public int insertCustomer(Customer customer);
	
	public List<Customer> findCustomers();
}
