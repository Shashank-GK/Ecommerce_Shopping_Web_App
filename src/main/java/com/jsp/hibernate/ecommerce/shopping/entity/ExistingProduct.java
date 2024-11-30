package com.jsp.hibernate.ecommerce.shopping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExistingProduct {
	@Id
	private int exeistingProductId;
	private String existingProductName;
	private String existingProductBrand;
	private int existingProductPrice;
	
	// Getters and Setters
	//for exeistingProductId
	public int getExeistingProductId() {
		return exeistingProductId;
	}
	public void setExeistingProductId(int exeistingProductId) {
		this.exeistingProductId = exeistingProductId;
	}
	
	//for existingProductName
	public String getExistingProductName() {
		return existingProductName;
	}
	public void setExistingProductName(String existingProductName) {
		this.existingProductName = existingProductName;
	}
	
	//for existingProductBrand
	public String getExistingProductBrand() {
		return existingProductBrand;
	}
	public void setExistingProductBrand(String existingProductBrand) {
		this.existingProductBrand = existingProductBrand;
	}
	
	//for existingProductPrice
	public int getExistingProductPrice() {
		return existingProductPrice;
	}
	public void setExistingProductPrice(int existingProductPrice) {
		this.existingProductPrice = existingProductPrice;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Existing Product Details:\nProduct Id=" + exeistingProductId + ".\nProduct Name="
				+ existingProductName + ".\nProduct Brand=" + existingProductBrand + ".\nProduct Price="
				+ existingProductPrice + ".";
	}
}
