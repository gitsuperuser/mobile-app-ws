package com.racharoomies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileAppWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppWsApplication.class, args);
		main("siva");
	}

	public static void main(String args) {
		SpringApplication.run(MobileAppWsApplication.class, args);
		System.out.println("in other main");
	}

}
