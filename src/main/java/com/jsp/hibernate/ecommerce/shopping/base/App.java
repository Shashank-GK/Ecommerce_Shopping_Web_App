package com.jsp.hibernate.ecommerce.shopping.base;

import java.util.Scanner;

import com.jsp.hibernate.ecommerce.shopping.operation.ShoppingWebAppDAO;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingWebAppDAO shoppingWebAppDAO = new ShoppingWebAppDAO();
        
        boolean isRunning = true;
        do {
            System.out.println("Welcome to the Shopping Cart Application");
            System.out.println("1. Add product to cart");
            System.out.println("2. Remove product from cart");
            System.out.println("3. View user cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shoppingWebAppDAO.addProductToCart(scanner);
                    break;
                case 2:
                    shoppingWebAppDAO.removeProductFromCart(scanner);
                    break;
                case 3:
                    shoppingWebAppDAO.viewCart(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (isRunning);
        
        scanner.close(); // Close scanner after use
    }
}
