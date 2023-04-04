package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Customer;
import com.BikkadIT.model.CustomerDto;
import com.BikkadIT.service.CustomerServiceI;

@RestController
public class CustomerController {
	@Autowired
	CustomerServiceI customerServiceI;
	
	@PostMapping("/create")
	public ResponseEntity<String> createCustomer(@RequestBody CustomerDto customerDto){
		
		CustomerDto create = this.customerServiceI.create(customerDto);
		
		return new ResponseEntity<String> ("Customer successfully saved", HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/update/{customerId}")
	public ResponseEntity<CustomerDto> update(@RequestBody CustomerDto customerDto, @PathVariable Integer customerId){
		CustomerDto update = this.customerServiceI.update(customerDto, customerId);
		
		return new ResponseEntity<CustomerDto>(update, HttpStatus.OK);
		
	}
	
	
	
	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity<String> delete(@PathVariable Integer customerId){
		
		this.customerServiceI.delete(customerId);
		
		return new ResponseEntity<String>("customer deleted successfully", HttpStatus.OK);
		
		
	}
	@GetMapping("/getCustomer/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable Integer customerId){
		
		CustomerDto customer = this.customerServiceI.getCustomer(customerId);
		
		return new ResponseEntity<CustomerDto>(customer,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CustomerDto>> getAll(){
		 List<CustomerDto> list = this.customerServiceI.getAll();
		
		
		
		return new ResponseEntity<List<CustomerDto>>(list, HttpStatus.ACCEPTED);
		
	}
	
//	@GetMapping("/login/{customer}/{password}")
//	public ResponseEntity<Customer> loginUser(@PathVariable String username, String password){
//		Customer login = this.customerServiceI.login(username, password);
//		return new ResponseEntity<Customer>(login, HttpStatus.OK);
//		
//	}

}
