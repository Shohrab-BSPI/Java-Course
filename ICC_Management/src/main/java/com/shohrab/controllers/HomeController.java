package com.shohrab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shohrab.config.HibernateConfig;

@Controller
public class HomeController {
	@Autowired
	private HibernateConfig hibernateConfig;
	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}
	
	
}
