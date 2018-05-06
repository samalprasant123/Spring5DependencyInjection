package com.prasant.spring.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import com.prasant.spring.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void sayHello() {
		System.out.println(greetingService.sayGreeting());
	}

}
