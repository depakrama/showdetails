package com.showdetails.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.showdetails"})
public class ShowDetailsRestApplication {
	
		public static void main(String[] args) {
		SpringApplication.run(ShowDetailsRestApplication.class, args);
		
	}
}
