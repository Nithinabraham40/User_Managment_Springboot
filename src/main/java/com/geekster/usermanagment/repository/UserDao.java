package com.geekster.usermanagment.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.geekster.usermanagment.model.User;

@Repository
public class UserDao {
	
	
	private List<User>userList=new ArrayList<>();

	public void addUsers(User user) {
		userList.add(user);
		
	}
	
	

	public List<User> getUserList() {
		return userList;
	}



	public void setUserList(List<User> userList) {
		this.userList = userList;
	}



	public void updateById(User user, User u1) {
		user.setUserId(u1.getUserId());
		user.setName(u1.getName());
		user.setAddress(u1.getAddress());
		user.setPhNumber(u1.getPhNumber());
		user.setUserName(u1.getUserName());
		
	}



	public void deleteById(User user) {
		userList.remove(user);
		
	}




	
	
	

}
