package com.spring5.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
	@GetMapping({"/reg_form"})
	public String form() {
		return "registration";
	}
}
