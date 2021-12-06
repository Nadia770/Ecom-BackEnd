package com.example.ecommerceproject.Repositories;

import java.util.Optional;

import com.example.ecommerceproject.Entities.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  Optional<Customer> findByUsername(String username);
}
