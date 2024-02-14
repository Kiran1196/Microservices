package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.user_service.Entity.User;
@Service
public class UserServiceImpl implements UserInterface {

	
	
	List<User> list = List.of(
            new User(1311L, "Kiran", "23525625"),
            new User(1312L, "Pooja", "99999"),
            new User(1314L, "New User", "888")
    );
	
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
