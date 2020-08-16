package com.gunjan.product.model;
import java.util.*;

import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product{

	@Id
	private String productId;
	private String name;
	private HashSet<String> category;
	private double price;
    private Boolean availability;
	private int quantity;
	public Product()
	{
		
	}
	public Product(String id, String name, HashSet<String> category, double price, boolean availability, int quantity) {
		super();
		this.productId = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashSet<String> getCategory() {
		return category;
	}
	public void setCategory(HashSet<String> category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Boolean isAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", availability=" + availability + ", quantity=" + quantity + "]";
	}
	
	
}
