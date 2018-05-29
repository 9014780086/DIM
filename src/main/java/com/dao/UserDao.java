package com.dao;

import java.util.List;
import java.util.Map;

import com.pojo.User;

public interface UserDao {

	int insertUser(User user);

	int updateInfo(User user);
	
	int deleteInfo(String userId);
	
	Map<String, List<User>> UserInfo();
}
