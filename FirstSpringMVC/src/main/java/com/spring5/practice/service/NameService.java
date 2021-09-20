package com.spring5.practice.service;

import java.util.ArrayList;

import java.util.List;

//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

//@Configuration
//@Component
@Service
public class NameService {
	
//	@Bean
//	public NameService nameService() {
//		return new NameService();
//	}
	public String name() {
		return "Md. Shohrab Hossain";
	}
	
	List<String> names = new ArrayList<>();
	public NameService() {
		names.add("Abdullah Wasse");
		names.add("Rakibul Islam");
		names.add("Md. Injamam");
		names.add("Fajle Rabbi");
		names.add("Md. Shohrab");
	}
	
	public List<String> getNames(){
		return names;
	}
}
