package com.example.ecommerceproject.Controllers;

import java.util.List;

import com.example.ecommerceproject.Entities.Cart;
import com.example.ecommerceproject.Repositories.CartRepository;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/")
public class CartController {

  @Autowired
  private CartRepository cartRepository;

  @GetMapping("cart")
  public  List<Cart> getCartby() {

    return this.cartRepository.findAll();
  }

  @PostMapping("cart")
  public Cart addToCart(@RequestBody Cart cart) {
   return this.cartRepository.save(cart);
  }


  @PutMapping(value="cart/{id}")
  public ResponseEntity<Cart> updateCartCountCart(@PathVariable Integer id, @RequestBody Cart newCart ) {
      Cart cart = cartRepository.findById(id).get();
      cart.setCount(newCart.getCount());
      Cart updatedCart = cartRepository.save(cart);
      return ResponseEntity.ok(updatedCart);
  }

}
