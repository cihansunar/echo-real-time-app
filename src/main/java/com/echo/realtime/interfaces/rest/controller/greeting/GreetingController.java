package com.echo.realtime.interfaces.rest.controller.greeting;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.echo.common.domain.model.greeting.Greeting;
import com.echo.realtime.services.greeting.GreetingService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class GreetingController {

	@Autowired
	GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws JsonParseException, JsonMappingException, IOException {
    	return greetingService.getGreet(name);
    }
}
