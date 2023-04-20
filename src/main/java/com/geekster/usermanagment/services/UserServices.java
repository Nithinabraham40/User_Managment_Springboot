package com.geekster.usermanagment.services;



import java.util.List;

import com.geekster.usermanagment.model.User;


public interface UserServices {

	public String addUsers(User user);

	public List<User> getAlluser();

	

	public User getUserWithId(String id);

	public String updateById(String id, User user);

	public String deleteById(String id);

}
