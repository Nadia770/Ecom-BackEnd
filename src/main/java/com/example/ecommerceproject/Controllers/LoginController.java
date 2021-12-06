package com.example.ecommerceproject.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.ecommerceproject.Repositories.CustomerRepository;
import com.example.ecommerceproject.Entities.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

  @Autowired
  private CustomerRepository repository;

  @GetMapping("/http://localhost:3000/login")
  public String login() {
    return "login";
  }

  @PostMapping("/http://localhost:3000/login")
  public Customer loginCustomer(@RequestBody Customer customer) {

    System.out.println(customer);
    return repository.save(customer);
  }

}
