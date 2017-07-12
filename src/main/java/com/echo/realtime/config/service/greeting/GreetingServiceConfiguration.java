package com.echo.realtime.config.service.greeting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.echo.realtime.services.greeting.GreetingService;

@Configuration
public class GreetingServiceConfiguration {
	
	@Bean 
	public GreetingService greetingService(){
		return new GreetingService();
	}
}