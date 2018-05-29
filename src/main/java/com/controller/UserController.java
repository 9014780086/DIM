package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
//	public UserService getUserService() {
//		return userService;
//	}
//
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}

	@RequestMapping(value="newUser", method=RequestMethod.POST)
	@ResponseBody String insertUser(@RequestBody User user) {
		System.out.println("data received is" + user);
		String result = userService.insertUser(user);
		return result;
	}
		
		@RequestMapping(value="updateUser", method=RequestMethod.POST)
		 @ResponseBody String updateInfoByUser(@RequestBody User user){
			System.out.println("data we received is" + user);
			String result =userService.updateInfo(user);
			return result;	

}
		// http://localhost:8080/JavaService2/delete?userid=sales
		@RequestMapping(value="delete", method=RequestMethod.DELETE)
		 @ResponseBody String delete(@RequestBody String userId){
			System.out.println("data we received is" + userId);
			String result =userService.deleteInfo(userId);
			return result;
		
}
		//http://localhost:8080/JavaService2/get
	@RequestMapping(value="get", method=RequestMethod.GET)
		 @ResponseBody  Map<String, List<User>> getUser(){
			Map<String, List<User>> map=userService.userList();
			return map;

		}
}
