package com.learning.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication             //equal to 3 annotation-@componentscan/@SpringBootConfiguration/@EnableAutoConfiguration
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

}
