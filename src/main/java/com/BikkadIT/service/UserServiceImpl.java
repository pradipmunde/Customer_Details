package com.BikkadIT.service;

import com.BikkadIT.Exception.ResourceNotFoundException;
import com.BikkadIT.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.User;
import com.BikkadIT.repository.UserRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceI{
	@Autowired
	UserRepo userRepo;
	@Autowired
	CustomerServiceImpl customerServiceimpl;
	
	


	@Override
	public User createUser(User user) {
		User user1 = this.userRepo.save(user);
		return user1;
	}
	

	@Override
	public User login(String username, String password) {


	   User user = Optional.ofNullable(this.userRepo.findByUsernameAndPassword(username, password)).orElseThrow(()->new ResourceNotFoundException("username or password is wrong"));




//		Map<String, String> map = new HashMap<>();
//		String user2 = map.put(username, password);
//		if (user.equals(user2)) {
//			List<CustomerDto> all = customerServiceimpl.getAll();
//			System.out.println(all);
//			return all;
//
//		}else {
//			return null;
		return user;
		}



//******************************************************************************************************************


	//	User user = this.userRepo.findByUsernamePassword(username, password);

   //	User user = this.userRepo.findByUsernameAndfindByPassword(username, password);

//		User user = this.userRepo.findByUsername(username);
//		User user2 = this.userRepo.findByPassword(password);
//    	System.out.println(user);
// 		System.out.println(user2);
//		
//      	if(user.equals(user2)) {
//      		return user;
////			
//     		}else {
//         		System.out.println("user not found");
//       	}

//		if(this.userRepo.findByUsername(username)) {
//			if(this.userRepo.findByPassword(password)) {
//				return userRepo.findAll().stream().findAny().get();
//				
//			}
//		}





	}





