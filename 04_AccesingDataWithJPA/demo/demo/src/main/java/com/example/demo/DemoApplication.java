package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.rmi.StubNotFoundException;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

	@Bean
	@GetMapping("/")
	public CommandLineRunner demo(StudentRepository repository) {
		return args -> {
			//save students
			repository.save(new Student("Anna", "Williams"));
			repository.save(new Student("Emma", "Johnson"));
			repository.save(new Student("Jerry", "Koonan"));

			//fetch all students
			log.info("Students found with findAll:");
			for(Student student : repository.findAll()) {
				log.info(student.toString());
			}
			log.info("");

			//fetch an individual customer by ID
			Student student = repository.findById(3);
			log.info("Student found with findById:");
			log.info(student.toString());
			log.info("");

			//fetch student by last name
			log.info("Student found with findByLastName:");
			repository.findByLastName("Williams").forEach(lastName -> {
				log.info(lastName.toString());
			});
			log.info("");

			log.info("Student found with findByFirstName:");
			repository.findByFirstName("Emma").forEach(firstName -> {
				log.info(firstName.toString());
			});
		};
	}

}
