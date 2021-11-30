package com.example.ecommerceproject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CartController {

  @Autowired
  private CartRepository cartRepository;

  @GetMapping("cart/{id}")
  public Cart getCartbyId(@PathVariable int id){

    return this.cartRepository.findById(id).get();
  }

}

  


