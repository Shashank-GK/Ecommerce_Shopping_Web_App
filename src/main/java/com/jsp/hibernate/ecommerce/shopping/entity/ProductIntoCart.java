package com.jsp.hibernate.ecommerce.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductIntoCart {
	@Id
	private int cartProductId;
	private String cartProductName;
	private String cartProductBrand;
	private int cartProductPrice;
 	
	// Getters and Setters
	//for cartProductId
	public int getCartProductId() {
		return cartProductId;
	}
	public void setCartProductId(int cartProductId) {
		this.cartProductId = cartProductId;
	}
	
	//for cartProductName
	public String getCartProductName() {
		return cartProductName;
	}
	public void setCartProductName(String cartProductName) {
		this.cartProductName = cartProductName;
	}
	
	//for cartProductBrand
	public String getCartProductBrand() {
		return cartProductBrand;
	}
	public void setCartProductBrand(String cartProductBrand) {
		this.cartProductBrand = cartProductBrand;
	}
	
	//for cartProductPrice
	public int getCartProductPrice() {
		return cartProductPrice;
	}
	public void setCartProductPrice(int cartProductPrice) {
		this.cartProductPrice = cartProductPrice;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Details of Product inside the cart:\nProduct Id=" + cartProductId + ".\nProduct Name=" + cartProductName
				+ ".\nProduct Brand=" + cartProductBrand + ".\nProduct Price=" + cartProductPrice + ".";
	}
}
