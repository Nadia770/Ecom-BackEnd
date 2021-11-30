package com.example.ecommerceproject;


import java.util.List;
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

  

