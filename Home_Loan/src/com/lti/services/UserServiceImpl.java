package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.UserDetail;
import com.lti.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	UserRepository repository;

	@Override
	public UserDetail addUser(UserDetail ud) {
		return repository.addUser(ud);
		
	}

}
