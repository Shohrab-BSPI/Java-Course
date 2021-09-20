package com.spring5.practice.config;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.spring5.practice.controllers"})	//ekhane basePackageClasses = PhoneService.class eta na dileo hoto karon amara sob service pkg er bean ComponentScan diye toiri kre niyechi.
//basePackageClasses = RegistrationController.class
public class WebMvcConfig implements WebMvcConfigurer{
	// Configuration to render VIEWS
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
}
