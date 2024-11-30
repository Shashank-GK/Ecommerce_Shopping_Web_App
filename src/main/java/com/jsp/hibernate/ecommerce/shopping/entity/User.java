package com.jsp.hibernate.ecommerce.shopping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class User {
	@Id
    private int userId;
    private String userName;
    private String userEmail;
    private int userAge;
    private String userCity;

    @OneToOne
    private Cart cart;

    //getters and setters
    //for userId
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	//for userName
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	//for userEmail
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}

	//for userAge
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	//for cart
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	//toString method
	@Override
	public String toString() {
		return "User Details:\nUser Id=" + userId + ".\nUser Name=" + userName + ".\nUser Email=" + userEmail + ".\nUser Age=" + userAge
				+ ".\nUser City=" + userCity + ".\nCart=" + cart + ".";
	}
    
	
    
}
