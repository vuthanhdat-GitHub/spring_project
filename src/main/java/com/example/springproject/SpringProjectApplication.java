package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SpringProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
}
