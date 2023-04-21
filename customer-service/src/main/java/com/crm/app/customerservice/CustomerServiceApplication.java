package com.crm.app.customerservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crm.app.customerservice.entity.Customer;
import com.crm.app.customerservice.repo.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	
}
