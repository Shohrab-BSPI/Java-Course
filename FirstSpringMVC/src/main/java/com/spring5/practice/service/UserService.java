package com.spring5.practice.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring5.practice.model.User;

@Service
public class UserService {
	private List<User> userList = new ArrayList<>();
	
	public List<User> getUsers(){
		return this.userList;
	}
	
	public void addUser(User user) {
		this.userList.add(user);
	}

}
