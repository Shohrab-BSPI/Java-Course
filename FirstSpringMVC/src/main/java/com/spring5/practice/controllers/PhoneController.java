package com.spring5.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring5.practice.service.PhoneService;

@Controller
public class PhoneController {
	@Autowired private PhoneService phoneNumber;
	@GetMapping({"/phone"})
	public String callingPhone(Model model) {
		model.addAttribute("name",phoneNumber.phone());
		return "numbers";
	}
	
}
