package com.example.ecommerceproject.Entities;

import java.util.Optional;

import com.example.ecommerceproject.Repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
  @Autowired
  private CustomerRepository customerRepository;

  // @Override
  // public UserDetails loadUserByID(Integer id) throws UsernameNotFoundException
  // {
  // customerRepository.findById(id);
  // }

  @Override
  public UserDetails loadUserByUsername(String username) {
    Optional<Customer> customer = customerRepository.findByUsername(username);

    if (customer == null) {
      throw new UsernameNotFoundException(username);
    }
    return customer.map(MyUserDetails::new).get();

  }

}
