package com.echo.realtime.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(Profiles.DEMO)
public class DemoDataConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(DemoDataConfiguration.class);
}