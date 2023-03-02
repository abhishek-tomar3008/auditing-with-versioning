package com.jlw.service;
import java.util.List;

import com.jlw.exception.CustomerException;
import com.jlw.model.Customer;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException;
	
	public List<Customer> getAllCustomerDetails()throws CustomerException;

}
