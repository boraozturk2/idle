package com.bozturk.idle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bozturk.idle.jpa.User;
import com.bozturk.idle.jpa.UserService;

@RestController
public class UserRestService {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/api/hello")
	public String greet() {
		User user = new User();
		user.setFirstName("Bora");
		user.setLastName("Ozturk");
		user.setEmail("boraozturk@hotmail.com");
		user.setUsername("boraozturk");
		userService.save(user);
		return "success";
	}

}
