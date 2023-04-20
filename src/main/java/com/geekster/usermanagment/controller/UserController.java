package com.geekster.usermanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.usermanagment.model.User;
import com.geekster.usermanagment.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	private UserServices userservices;
	
	
	@GetMapping("/getuser")
	
	public List<User> getUser(){
		
		return userservices.getAlluser();
	}
	
	
	@PostMapping("/adduser")
	
	public String addUsers(@RequestBody User user) {
		
		 return userservices.addUsers(user);
		
		
	}
	
@GetMapping("/getuser/{id}")
	
	public User getUserById(@PathVariable("id") String id){
		
		return userservices.getUserWithId(id);
		
	}

@PutMapping("/updateUser/{id}")

public String updateUserById(@PathVariable("id") String id,@RequestBody User user) {
	
	
	return userservices.updateById(id,user);
}

@DeleteMapping("/deletebyid/{id}")
public String deleteById(@PathVariable("id") String id) {
	
	return userservices.deleteById(id);
	
	
}
	

	
	
	

}
