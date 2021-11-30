package com.example.ecommerceproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
  @Column(name = "userId")
  private int userId;
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
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public Cart() {
  }
  public Cart(String name, int price, String description, String image, int userId) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.image = image;
    this.userId = userId;
  }
  @Override
  public String toString() {
    return "Cart [description=" + description + ", image=" + image + ", name=" + name + ", price=" + price + ", userId="
        + userId + "]";
  }
  
}
