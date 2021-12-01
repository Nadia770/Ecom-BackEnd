package com.example.ecommerceproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

  @GetMapping("/http://localhost:3000/")
  public String home() {
    return ("home");
  }

  @GetMapping("/http://localhost:3000/cart")
  public String cart() {
    return ("<h1>cart</h1>");

  }

  @GetMapping("/error")
  public String error() {
    return ("<h1>Error</h1>");

  }

}
