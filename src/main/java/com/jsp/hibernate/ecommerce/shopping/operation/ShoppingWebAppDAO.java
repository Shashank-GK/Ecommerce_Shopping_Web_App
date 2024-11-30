package com.jsp.hibernate.ecommerce.shopping.operation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.hibernate.ecommerce.shopping.base.HibernateUtil;
import com.jsp.hibernate.ecommerce.shopping.entity.Cart;
import com.jsp.hibernate.ecommerce.shopping.entity.ExistingProduct;
import com.jsp.hibernate.ecommerce.shopping.entity.ProductIntoCart;
import com.jsp.hibernate.ecommerce.shopping.entity.User;

import java.util.List;
import java.util.Scanner;

public class ShoppingWebAppDAO {

    // Add product to cart
    public void addProductToCart(Scanner scanner) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            // User input
            System.out.print("Enter User ID: ");
            int userId = scanner.nextInt();

            System.out.print("Enter Product ID to add: ");
            int productId = scanner.nextInt();

            User user = session.get(User.class, userId);
            ExistingProduct existingProduct = session.get(ExistingProduct.class, productId);

            if (user != null && existingProduct != null) {
                // Create ProductIntoCart object and set details
                ProductIntoCart productIntoCart = new ProductIntoCart();
                productIntoCart.setCartProductId(existingProduct.getExeistingProductId());
                productIntoCart.setCartProductName(existingProduct.getExistingProductName());
                productIntoCart.setCartProductBrand(existingProduct.getExistingProductBrand());
                productIntoCart.setCartProductPrice(existingProduct.getExistingProductPrice());

                // Add to Cart
                Cart cart = user.getCart();
                if (cart == null) {
                    cart = new Cart();
                    user.setCart(cart);
                    session.save(user);
                }
                cart.getProduct().add(productIntoCart);
                session.save(productIntoCart);
                
                transaction.commit();
                System.out.println("Product added to the cart successfully!");
            } else {
                System.out.println("User or Product not found!");
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close(); // Always close the session
        }
    }

    // Remove product from cart
    public void removeProductFromCart(Scanner scanner) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            System.out.print("Enter User ID: ");
            int userId = scanner.nextInt();

            System.out.print("Enter Product ID to remove: ");
            int productId = scanner.nextInt();

            User user = session.get(User.class, userId);
            ExistingProduct existingProduct = session.get(ExistingProduct.class, productId);

            if (user != null && existingProduct != null) {
                Cart cart = user.getCart();
                List<ProductIntoCart> productList = cart.getProduct();

                ProductIntoCart productToRemove = null;
                for (ProductIntoCart product : productList) {
                    if (product.getCartProductId() == existingProduct.getExeistingProductId()) {
                        productToRemove = product;
                        break;
                    }
                }

                if (productToRemove != null) {
                    productList.remove(productToRemove);
                    session.delete(productToRemove);
                    transaction.commit();
                    System.out.println("Product removed from the cart successfully!");
                } else {
                    System.out.println("Product not found in the cart.");
                }
            } else {
                System.out.println("User or Product not found!");
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
    }

    // View cart for a user
    public void viewCart(Scanner scanner) {
        System.out.print("Enter User ID to view cart: ");
        int userId = scanner.nextInt();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            User user = session.get(User.class, userId);
            if (user != null && user.getCart() != null) {
                Cart cart = user.getCart();
                System.out.println("User: " + user.getUserName() + "'s Cart:");
                for (ProductIntoCart product : cart.getProduct()) {
                    System.out.println(product.getCartProductName() + " - " + product.getCartProductPrice());
                }
            } else {
                System.out.println("No cart found for this user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
