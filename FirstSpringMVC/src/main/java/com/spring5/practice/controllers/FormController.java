package com.spring5.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring5.practice.model.User;
import com.spring5.practice.service.UserService;
import com.spring5.practice.service.UserStoreToDBMS;

@Controller
@RequestMapping("/users")
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserStoreToDBMS userDBMS;
	
	@GetMapping("/add")
	
	public String get_AddName(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@PostMapping("/add")
	public String addUser_Post(@ModelAttribute User user) {
		userService.addUser(user);
		userDBMS.saveUser(user);
		
		return "redirect:/users/all";
	}
	
	@GetMapping("/all")
	public String showAll(Model model) {
		model.addAttribute("users", userService.getUsers());
		return "showUsers";
		
	}
}
