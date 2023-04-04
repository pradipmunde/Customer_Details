package com.BikkadIT.controller;

import com.BikkadIT.model.CustomerDto;
import com.BikkadIT.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.User;
import com.BikkadIT.service.UserServiceI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Qualifier
public class UserController extends CustomerServiceImpl {
	@Autowired
	UserServiceI userServiceI;

	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
	      User user1 = this.userServiceI.createUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.OK);
		
	}
	
	@GetMapping("/login/{username}/{password}")
	public ResponseEntity <List<CustomerDto>> loginUser(@PathVariable String username, @PathVariable String password) {
		User login = this.userServiceI.login(username, password);


			List<CustomerDto> all = getAll();


			return new ResponseEntity<List<CustomerDto>>( all, HttpStatus.OK);
		}
	}
	


