package com.rxil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RxilGlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RxilGlobalApplication.class, args);
		System.out.println();
		System.out.println("Welcome to RXIL Global...");
	}

}
