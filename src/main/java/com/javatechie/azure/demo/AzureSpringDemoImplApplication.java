package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringDemoImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringDemoImplApplication.class, args);
	}

	@GetMapping("/messages")
	public String message(){
		return "Congrats ! Your application is successfully deployed !";
	}

}
