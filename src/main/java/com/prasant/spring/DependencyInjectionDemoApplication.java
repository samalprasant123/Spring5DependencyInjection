package com.prasant.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.prasant.spring.controller.ConstructorInjectedController;
import com.prasant.spring.controller.MyController;
import com.prasant.spring.controller.PropertyInjectedController;
import com.prasant.spring.controller.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prasant.service", "com.prasant.spring.controller"})
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		myController.sayHello();
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
