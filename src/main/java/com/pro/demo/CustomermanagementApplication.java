package com.pro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pro.demo.dao.CustomerDao;

@SpringBootApplication
public class CustomermanagementApplication {

	public static void main(String[] args) {
		System.out.println("springboot started");
		SpringApplication.run(CustomermanagementApplication.class, args);
		System.out.println("springboot ended");
		
	

	}

}
