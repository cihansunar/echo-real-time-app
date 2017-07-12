package com.echo.realtime.services.greeting;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.client.RestTemplate;

import com.echo.common.domain.model.greeting.Greeting;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class GreetingService {
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
	public  Greeting getGreet(String name) throws JsonParseException, JsonMappingException, IOException{
		for(int i=0; i<10000;i++){
			RestTemplate template = new RestTemplate();
			String test =template.getForObject("http://localhost:8080/greeting", String.class);	
			ObjectMapper mapper = new ObjectMapper();
			
			Greeting obj = mapper.readValue(test, Greeting.class);
			
		}
		
        return new Greeting(1, "Finished");
	}
}