package com.helloWorldEndpoint.endpointTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //tells Spring that this code describes an endpoint that should be made available over the web
public class EndpointTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointTestApplication.class, args);
	}

	@GetMapping("/hello") //http://localhost:8080/hello
	//http://localhost:8080/hello?name=YOUR_NAME
	public String hello (@RequestParam(value="name", defaultValue="World")String name) {//take a String parameter called name and combine this parameter with the word "Hello"
		//@RequestParam -  telling Spring to expect a name value in the request
		return String.format("Hello %s!", name);
	}

}
