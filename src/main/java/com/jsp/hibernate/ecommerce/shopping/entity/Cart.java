package com.jsp.hibernate.ecommerce.shopping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
    private int cartId;

    @ManyToMany
    private List<ProductIntoCart> productIntoCart ;

    // Getters and Setters
    //for CartId:
    public int getCartId() {
        return cartId;
    }
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    //for ExistingProduct:
    public List<ProductIntoCart> getProduct() {
        return productIntoCart;
    }
    public void setProduct(List<ProductIntoCart> product) {
        this.productIntoCart = product;
    }

    @Override
    public String toString() {
        return "Cart Details:\nCart Id=" + cartId + ".\nProduct=" + productIntoCart;
    }
}
