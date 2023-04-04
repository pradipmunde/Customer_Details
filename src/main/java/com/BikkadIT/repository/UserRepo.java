package com.BikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

	User findByUsernameAndPassword(String username, String password);

//	User findByUsername(String username);
//
//   User  findByPassword(String password);



   //**************************************************************************************************************



	//	User findByUsernameAndfindByPassword(String username, String password);

//	User findByUsernamePassword(String username, String password);
// 	User findByUsernameAndfindByPassword(String username, String password);
	
//	User findByUsername(String username);
//
//    User  findByPassword(String password);
	
	

//    boolean findByUsername(String username);
////	
//	boolean findByPassword(String password);
}
