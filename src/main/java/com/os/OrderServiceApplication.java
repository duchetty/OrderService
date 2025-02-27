package com.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		System.out.println("Welcome to OrderService");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}	
	
}
