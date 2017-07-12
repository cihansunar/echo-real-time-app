package com.echo.realtime.config.interfaces.rest.controller;

import org.springframework.context.annotation.Bean;

import com.echo.realtime.interfaces.rest.controller.greeting.GreetingController;

public class GreetingControllerConfiguration {
	
	@Bean
	GreetingController greetingController () {
		return new GreetingController();
	}
}