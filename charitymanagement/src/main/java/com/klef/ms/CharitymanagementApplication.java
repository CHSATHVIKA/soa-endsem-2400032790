package com.klef.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(
		title = "Charity Fund API",
		version = "1.0",
		description = "APIs to add, view, update and delete charity fund records"))
@SpringBootApplication
public class CharitymanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharitymanagementApplication.class, args);
	}

}
