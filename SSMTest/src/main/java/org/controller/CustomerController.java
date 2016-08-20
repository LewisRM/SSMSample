package org.controller;

import java.util.Date;
import java.util.List;

import org.entity.Customer;
import org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value="/addcustomer.do")
    public ModelAndView add(Customer customer){	
		
		
		customer.setStoreId((byte) 2);
		customer.setLastName("shdfui");
		customer.setCreateDate(new Date());
		System.out.println(customer);
		int insert = customerService.insertCustomer(customer);
		
		List<Customer> itemsList = customerService.findCustomers();

        ModelAndView mav=new ModelAndView();
        
        mav.addObject("itemsList", itemsList);
        
        if(insert==1){
        	mav.setViewName("success");  
        }else{
        	mav.setViewName("error"); 
        }
        
        return mav;

    } 
}
