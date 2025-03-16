package com.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String name = "mike";
		int x = 100;
		boolean isPresent = false;
		int y = 200;
		char z = 'a';
		SpringApplication.run(DemoApplication.class, args);
	}

}
