package org.service.impl;

import java.util.List;

import org.entity.Customer;
import org.mapper.CustomerMapper;
import org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public int insertCustomer(Customer customer) {

		return customerMapper.insert(customer) ;
		

	}

	public List<Customer> findCustomers() {
		// TODO Auto-generated method stub
		return customerMapper.findCustomers();
	}

}
