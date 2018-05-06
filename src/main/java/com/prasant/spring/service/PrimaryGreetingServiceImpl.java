package com.prasant.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingServiceImpl implements GreetingService, InitializingBean, DisposableBean {

	@Override
	public String sayGreeting() {
		return "Hello from PrimaryGreetingServiceImpl.";
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("In postConstruct() of PrimaryGreetingServiceImpl");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("In preDestroy() of PrimaryGreetingServiceImpl");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet() of PrimaryGreetingServiceImpl");		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy() of PrimaryGreetingServiceImpl");		
	}
	
}
