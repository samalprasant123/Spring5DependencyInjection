package com.prasant.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.prasant.spring.service.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
