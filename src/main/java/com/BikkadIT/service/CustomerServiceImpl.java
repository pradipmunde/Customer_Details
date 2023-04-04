package com.BikkadIT.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Customer;
import com.BikkadIT.model.CustomerDto;
import com.BikkadIT.repository.CustomerRepo;
@Service
@Primary
public class CustomerServiceImpl implements CustomerServiceI{
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	ModelMapper modelMapper;
	

	@Override
	public CustomerDto create(CustomerDto customerDto) {
		Customer customer = this.modelMapper.map(customerDto, Customer.class);
		
		Customer save = this.customerRepo.save(customer);
		
		
		return  modelMapper.map(save, CustomerDto.class);
	}

	@Override
	public CustomerDto update(CustomerDto customerDto, Integer customerId) {
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()-> new RuntimeException ("customer not found for this id"));
		
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setPhoneNo(customerDto.getPhoneNo());
		customer.setDob(customerDto.getDob());
		
		return modelMapper.map(customer, CustomerDto.class);
	}

	@Override
	public void delete(Integer customerId) {
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()-> new RuntimeException ("customer not found for this id"));
		
		this.customerRepo.delete(customer);
		
	}

	@Override
	public CustomerDto getCustomer(Integer customerId) {
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()-> new RuntimeException ("customer not found for this id"));
		
		return this.modelMapper.map(customer, CustomerDto.class);
		
	}

	@Override
	public List<CustomerDto> getAll() {

		List<Customer> all = this.customerRepo.findAll();
		List<CustomerDto> customerDtoList = all.stream().map((c) -> this.modelMapper.map(c, CustomerDto.class)).collect(Collectors.toList());

		System.out.println(customerDtoList);

		return customerDtoList;
		
		
		
		
	}

//	@Override
//	public Customer login(String username, String password) {
//		Customer user = this.customerRepo.findByEmail(username);
//		Customer user2 = this.customerRepo.findByPassword(password);
//		
//		if(user==user2) {
//			return user;
//			
//		}return null;
//	
//	}

}
