package com.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDockerApplication {

	@GetMapping("/msg")
	public String hello(){
		return "dockerize spring boot app";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}


}
