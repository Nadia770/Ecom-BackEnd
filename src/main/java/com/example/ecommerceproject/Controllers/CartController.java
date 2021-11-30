package com.example.ecommerceproject.Controllers;

import java.util.List;

import com.example.ecommerceproject.Entities.Cart;
import com.example.ecommerceproject.Repositories.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping("cart/{id}")
  public List<Cart> addToCartbyId(@RequestBody Cart cart, @PathVariable int id ){
    this.cartRepository.save(cart);
    return this.cartRepository.findAll();
  }


}

  


