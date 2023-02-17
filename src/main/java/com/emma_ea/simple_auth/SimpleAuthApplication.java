package com.emma_ea.simple_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SimpleAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleAuthApplication.class, args);
	}

}
