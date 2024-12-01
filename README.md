
# Ecommerce Shopping WebApp

This project is a basic **Ecommerce Shopping Web Application** implemented in **Java** using **Hibernate** as the ORM (Object-Relational Mapping) tool. The application handles basic operations like adding products to a cart, managing users, and interacting with the database.

## Folder Structure

```
Ecommerce_Shopping_WebApp/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.jsp.hibernate.ecommerce.shopping.base/
│   │   │   │   ├── App.java                 # Main entry point for the application
│   │   │   │   ├── HibernateUtil.java       # Utility class to manage Hibernate sessions
│   │   │   ├── com.jsp.hibernate.ecommerce.shopping.entity/
│   │   │   │   ├── Cart.java                # Represents the shopping cart entity
│   │   │   │   ├── ExistingProduct.java     # Represents the products available in the store
│   │   │   │   ├── ProductIntoCart.java     # Represents the products added to the cart
│   │   │   │   ├── User.java                # Represents the user entity
│   │   │   ├── com.jsp.hibernate.ecommerce.shopping.operation/
│   │   │       ├── ShoppingWebAppDAO.java   # Contains business logic and database operations
│   ├── resources/
│   │   ├── Hibernate.cfg.xml                # Hibernate configuration file for database settings
│   ├── test/
│
├── JRE System Library [JavaSE-1.8]          # Java Runtime Environment
├── Maven Dependencies                       # Project dependencies managed by Maven
├── pom.xml                                  # Maven configuration file
```

## Features

- **User Management:** Create, read, update, and delete user details.
- **Product Management:** Manage available products and their details.
- **Cart Operations:** Add, view, and remove products from the shopping cart.
- **Database Interaction:** Uses Hibernate ORM to interact with the database.

## Technologies Used

- **Java** (Java SE 8)
- **Hibernate** (ORM framework)
- **Maven** (Dependency management and build tool)
- **JRE System Library**
- **XML** (for Hibernate configuration)

## Setup and Usage

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```bash
   cd Ecommerce_Shopping_WebApp
   ```

3. **Import the project into your IDE** (Eclipse/IntelliJ):
   - Select **File > Import > Maven > Existing Maven Projects**.
   - Browse to the project directory and click **Finish**.

4. **Configure the Database**:
   - Update the `Hibernate.cfg.xml` file with your database details (URL, username, password, and dialect).

5. **Run the Application**:
   - Execute the `App.java` file located in `com.jsp.hibernate.ecommerce.shopping.base` to start the application.

## Project Modules

1. **Base Module**:
   - Contains `App.java` (main entry point) and `HibernateUtil.java` for Hibernate session management.

2. **Entity Module**:
   - Defines the core entities like `User`, `Cart`, `ExistingProduct`, and `ProductIntoCart`.

3. **Operation Module**:
   - Contains `ShoppingWebAppDAO.java` which includes data access and business logic.

## Dependencies

All dependencies are managed using Maven. Refer to the `pom.xml` file for details.
---
