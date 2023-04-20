package com.geekster.usermanagment.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.usermanagment.model.User;
import com.geekster.usermanagment.repository.UserDao;
import com.geekster.usermanagment.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {
	
	
	@Autowired
	private UserDao userdao;

	@Override
	public String addUsers(User user) {
		
		userdao.addUsers(user);
		
		return "addition is sucessfull";
	}

	@Override
	public List<User> getAlluser() {
		
		return userdao.getUserList();
	}
	

	@Override
	public User getUserWithId(String id) {
	
		List<User>currentList=userdao.getUserList();
		
		for(User user:currentList) {
			
			if(user.getUserId().equals(id)) {
				
				return user;
			}
		}return null;
	}

	@Override
	public String updateById(String id, User u1) {
		
		List<User>currentList=userdao.getUserList();
		
		if(id!=null) {
		
		for(User user:currentList) {
			
			if(user.getUserId().equals(id)) {
				
				userdao.updateById(user,u1);
				return "Updation Sucessfull";
			}
		}return "Id not found give vaild id";
		
	}else {
		return "Given UserId was null";
	}

	
	

}

	@Override
	public String deleteById(String id) {
	List<User>currentList=userdao.getUserList();
		
		if(id!=null) {
			for(User user:currentList) {
				if(user.getUserId().equals(id)) {
					userdao.deleteById(user);
					return "Delete sucessfully";
				}
			}return "Id not found give vaild id";
			
		}else {
			return "Given UserId was null";
		}
	}
	}
	
