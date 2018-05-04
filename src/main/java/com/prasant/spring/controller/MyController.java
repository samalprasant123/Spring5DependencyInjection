package com.prasant.spring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public void sayHello() {
		System.out.println(MyController.class.getName() + " says Hello!!!");
	}

}
