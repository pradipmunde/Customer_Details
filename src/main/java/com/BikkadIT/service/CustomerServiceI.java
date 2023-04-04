package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.controller.UserController;
import com.BikkadIT.model.Customer;
import com.BikkadIT.model.CustomerDto;
import com.BikkadIT.model.User;

public interface CustomerServiceI  {
	
	public CustomerDto create (CustomerDto customerDto);
	
	public CustomerDto update(CustomerDto customerDto, Integer customerId);
	
	public void delete (Integer customerId);
	
	public CustomerDto getCustomer(Integer customerId);
	
	public List<CustomerDto> getAll();
	
	//public Customer login(String username, String password);

}
