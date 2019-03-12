package com.cts.product.bean;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Product")
@Table(name="product_table")
public class Product {
	@Id
	@Column(name="productID", nullable = false, length=50, unique=true)
	private String productId;
	@Column(name="productName")

	private String productName;
	@Column(name="productPrice")

	private String price;
	@Column(name="productQuantity")

	private String quantity;
	public String getProId() {
		return productId;
	}
	public void setProId(String proId) {
		this.productId = proId;
	}
	public String getProName() {
		return productName;
	}
	public void setProName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
