package com.service;

import java.util.List;
import java.util.Map;

import com.pojo.User;

public interface UserService {
	String insertUser(User user);

	String updateInfo(User user);
	
	String deleteInfo(String userId);
	
	Map<String, List<User>> userList();

}
