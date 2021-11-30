package com.example.ecommerceproject.Controllers;


import java.util.List;

import com.example.ecommerceproject.Entities.Product;
import com.example.ecommerceproject.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("products")
  public List<Product> getProducts(){

    return this.productRepository.findAll();
  }

}

  

