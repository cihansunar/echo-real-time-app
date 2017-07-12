package com.echo.realtime.config.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.echo.realtime.config.service.greeting.GreetingServiceConfiguration;


@Configuration
@Import ({GreetingServiceConfiguration.class})
public class ServiceConfiguration {
	
	
}