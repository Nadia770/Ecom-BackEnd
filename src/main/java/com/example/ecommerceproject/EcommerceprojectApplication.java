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

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ProductRepository productRepository;

	public void run(String...args) throws Exception {
var hannah = new Customer("Hannah123", "bluerries");
var nadia = new Customer("Nadia221", "redlorry");
var tony = new Customer("Tony_5", "yellowlolly");

this.customerRepository.save(hannah);
this.customerRepository.save(nadia);
this.customerRepository.save(tony);

this.cartRepository.save(new Cart("Pineapple", 5, "Ripe Pinapple",
"https://images.unsplash.com/photo-1550258987-190a2d41a8ba?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60/",
hannah));
this.cartRepository.save(new Cart("Strawberries", 5, "Ripe Strawberries",
"https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"
,nadia));

this.productRepository.save(new Product(
					"Pineapple",
          5,
          "Ripe Pinapple",
          "https://images.unsplash.com/photo-1550258987-190a2d41a8ba?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60/"
        ));
this.productRepository.save(new Product(
          "Strawberries",
          5,
        	"Ripe Strawberries",
          "https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"
				));
this.productRepository.save(new Product(
          "Oranges",
          3,
          "Ripe Oranges",
          "https://images.unsplash.com/photo-1557800636-894a64c1696f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"
				));
this.productRepository.save(new Product(
          "Bananas",
          2,
          "Ripe Bananas",
          "https://images.unsplash.com/photo-1528825871115-3581a5387919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=830&q=80"
				));
	}

	

}
