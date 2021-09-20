package com.spring5.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring5.practice.service.NameService;

@Controller
public class NameController {
	@Autowired private NameService nameService;
	@GetMapping({"/name",""})
	public String hello(Model model) {
		model.addAttribute("name",nameService.name());
		return "hello";
	}
	
	@GetMapping({"/names",""})
	public String helloNameList(Model model) {
		model.addAttribute("names",nameService.getNames());
		return "nameList";
	}
}
