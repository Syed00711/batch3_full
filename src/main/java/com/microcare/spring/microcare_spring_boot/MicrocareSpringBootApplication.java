package com.microcare.spring.microcare_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MicrocareSpringBootApplication {
	@Autowired
	 ExampleComponent ec;
	
	public static void main(String[] args) {
		SpringApplication.run(MicrocareSpringBootApplication.class, args);

	}
	
	

}
