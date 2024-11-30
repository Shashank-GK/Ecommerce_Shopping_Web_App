package com.jsp.hibernate.ecommerce.shopping.base;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.ecommerce.shopping.entity.Cart;
import com.jsp.hibernate.ecommerce.shopping.entity.ExistingProduct;
import com.jsp.hibernate.ecommerce.shopping.entity.ProductIntoCart;
import com.jsp.hibernate.ecommerce.shopping.entity.User;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml")
                                      .addAnnotatedClass(User.class)
                                      .addAnnotatedClass(Cart.class)
                                      .addAnnotatedClass(ProductIntoCart.class)
                                      .addAnnotatedClass(ExistingProduct.class)
                                      .buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create session factory.");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
