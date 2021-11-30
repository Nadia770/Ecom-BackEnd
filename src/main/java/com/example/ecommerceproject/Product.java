package com.example.ecommerceproject;

public class Product {
  private int id;
  private String name;
  private int price;
  private String description;
  private String image;

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
  public Product() {
  }
  public Product(String name, int price, String description, String image) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.image = image;
  }
  @Override
  public String toString() {
    return "Product [description=" + description + ", image=" + image + ", name=" + name + ", price=" + price + "]";
  }
  
  

  
}
