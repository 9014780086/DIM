package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired

	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public String insertUser(User user) {

		System.out.println("data received in service" + user);
		int result = userdao.insertUser(user);

		if (result == 0) {
			return "User registration  failed";
		} else {
			return "User Registration Successful";

		}

	}

	public String updateInfo(User user) {
		System.out.println("data received in service" + user);
		int result = userdao.updateInfo(user);

		if (result == 0) {
			return "User update failed";
		} else {
			return "User update Successful";

		}
	}

	public String deleteInfo(String userId) {
		System.out.println("data received in service" + userId);
		int result = userdao.deleteInfo(userId);

		if (result == 0) {
			return "User delete failed";
		} else {
			return "User delete Successful";

		}
	}

	public Map<String, List<User>> userList() {
		Map<String, List<User>> result = userdao.UserInfo();
		return result;
	}

}
