package com.example.ecommerceproject.Repositories;

import com.example.ecommerceproject.Entities.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>  {
  
}
