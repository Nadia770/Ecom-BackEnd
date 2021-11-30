package com.example.ecommerceproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EcommerceprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EcommerceprojectApplication.class, args);
	}


	@Autowired
	private CustomerRepository customerRepository;

	public void run(String...args) throws Exception {
		this.customerRepository.save(new Customer("Hannah123", "bluerries"));
		this.customerRepository.save(new Customer("Nadia221", "redlorry"));
		this.customerRepository.save(new Customer("Tony_5", "yellowlolly"));
	}


}
