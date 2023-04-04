package com.BikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
//  Customer findByUserName(String username);
//	
//	Customer findByPassword(String password);
}
