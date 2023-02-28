# SpringBootAppHelloWorld
Classic “Hello World!” endpoint which any browser can connect to

1. Use start.spring.io to create a “web” project.
2. Open up the project in your IDE.
3. Position in src/main/java/com.helloWorldEndpoint.endpointTest.
4. Put this code:

	package com.helloWorldEndpoint.endpointTest;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController 
	
	public class EndpointTestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EndpointTestApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello (@RequestParam(value="name", defaultValue="World")String name) {
		return String.format("Hello %s!", name);
	}

}
     
     
 5. Build and run the program. For this project you need to inside Lifecycle click on install to compile the project's source code. Or in Command Prompt or Terminal write this command if you are on Windows: .\gradlew.bat bootRun or if you are on Linux/MacOs: ./gradlew bootRun
 6. Open your browser and in the address bar at the top enter http://localhost:8080/hello
	
