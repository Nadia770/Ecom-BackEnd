package com.example.ecommerceproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/http://localhost:3000/login")
  public String login() {
    return "login";
  }

}
