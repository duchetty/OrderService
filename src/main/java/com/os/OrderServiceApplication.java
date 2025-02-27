package com.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		System.out.println("Welcome to OrderService");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("30");
		System.out.println("Complete the example");
		System.out.println("Complete the example in Order Service application");
		
		
	}	
	
}
