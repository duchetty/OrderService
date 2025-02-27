package com.os;

import java.util.stream.Collectors;

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
		int d=a-b;
		int c=a+b;
		System.out.println(" c :"+c + "d :"+d);
		System.out.println("Completed");
		System.out.println("Completed example of order service");
		
		String s1="listen";
		String s2="silent";
		
		if(areAnagram(s1,s2))
		{
			System.out.println("it is an anagram"+ s1 +":"+ s2);
		}
		else
		{
			System.out.println("it is not anagram"+ s1 +":"+ s2);
		}
		
	}	
	public static boolean areAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		String st1=s1.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		String st2=s2.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		 
		return st1.equals(st2);
	
	}
	
}
