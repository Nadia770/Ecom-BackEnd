package com.example.ecommerceproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="cart")
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "price")
  private int price;
  @Column(name = "description")
  private String description;
  @Column(name = "image")
  private String image;

  @OneToOne
  @JoinColumn(name ="cusomter_id", referencedColumnName = "id")
  private Customer customer; 


  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public Cart() {
  }
  public Cart(String name, int price, String description, String image, Customer customer) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.image = image;
    this.customer = customer;
  }
  @Override
  public String toString() {
    return "Cart [description=" + description + ", image=" + image + ", name=" + name + ", price=" + price + "]";
  }
  
}
