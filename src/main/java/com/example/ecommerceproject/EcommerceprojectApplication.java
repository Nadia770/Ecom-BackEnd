package com.example.ecommerceproject;

import com.example.ecommerceproject.Entities.Cart;
import com.example.ecommerceproject.Entities.Customer;
import com.example.ecommerceproject.Entities.Product;
import com.example.ecommerceproject.Repositories.CartRepository;
import com.example.ecommerceproject.Repositories.CustomerRepository;
import com.example.ecommerceproject.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
public class EcommerceprojectApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(EcommerceprojectApplication.class, args);
  }

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private CartRepository cartRepository;

  @Autowired
  private ProductRepository productRepository;

  public void run(String... args) throws Exception {
    var hannah = new Customer("Hannah123", "bluerries", "USER", true);
    var nadia = new Customer("Nadia221", "redlorry", "USER", true);
    var tony = new Customer("Tony_5", "yellowlolly", "USER", true);

    this.customerRepository.save(hannah);
    this.customerRepository.save(nadia);
    this.customerRepository.save(tony);

    this.productRepository.save(new Product(1,
        "Pineapple",
        5,
        "Ripe Pineapple",
        "https://images.unsplash.com/photo-1550258987-190a2d41a8ba?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60/"));
    this.productRepository.save(new Product(0,
        "Strawberries",
        5,
        "Ripe Strawberries",
        "https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"));
    this.productRepository.save(new Product(0,
        "Oranges",
        3,
        "Ripe Oranges",
        "https://images.unsplash.com/photo-1557800636-894a64c1696f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"));
    this.productRepository.save(new Product(0,
        "Bananas",
        2,
        "Ripe Bananas",
        "https://images.unsplash.com/photo-1528825871115-3581a5387919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=830&q=80"));
    this.productRepository.save(new Product(0,
        "Peach",
        2,
        "Ripe Peach",
        "https://images.pexels.com/photos/6157041/pexels-photo-6157041.jpeg?cs=srgb&dl=pexels-laker-6157041.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Grape",
        1,
        "Ripe Grape",
        "https://images.pexels.com/photos/5945854/pexels-photo-5945854.jpeg?cs=srgb&dl=pexels-any-lane-5945854.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Lemon",
        1,
        "Ripe Lemon",
        "https://images.pexels.com/photos/7657204/pexels-photo-7657204.jpeg?cs=srgb&dl=pexels-cup-of-couple-7657204.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Kiwi",
        1,
        "Ripe Kiwi",
        "https://images.pexels.com/photos/6156993/pexels-photo-6156993.jpeg?cs=srgb&dl=pexels-laker-6156993.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Grape Fruit",
        1,
        "Ripe Grape Fruit",
        "https://images.pexels.com/photos/7195269/pexels-photo-7195269.jpeg?cs=srgb&dl=pexels-shvets-production-7195269.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Papaya",
        1,
        "Ripe Papaya",
        "https://images.pexels.com/photos/5945731/pexels-photo-5945731.jpeg?cs=srgb&dl=pexels-any-lane-5945731.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Avocado",
        1,
        "Ripe Avocado",
        "https://images.pexels.com/photos/5945769/pexels-photo-5945769.jpeg?cs=srgb&dl=pexels-any-lane-5945769.jpg&fm=jpg"));
    this.productRepository.save(new Product(0,
        "Melon",
        1,
        "Ripe Melon",
        "https://images.pexels.com/photos/7065188/pexels-photo-7065188.jpeg?cs=srgb&dl=pexels-laura-tancredi-7065188.jpg&fm=jpg"));

    this.cartRepository.save(new Cart(1, "Pineapple", 5, "Ripe Pinapple",
        "https://images.unsplash.com/photo-1550258987-190a2d41a8ba?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60/"));
    this.cartRepository.save(new Cart(1, "Strawberries", 5, "Ripe Strawberries",
        "https://images.unsplash.com/photo-1601004890684-d8cbf643f5f2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZnJ1aXR8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60"));

  }

}