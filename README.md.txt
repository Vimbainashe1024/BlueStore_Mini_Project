README for Spring Boot User Registration and Authentication for Blue Store System
This Spring Boot application demonstrates user registration, authentication, and authorization using MySQL and Thymeleaf. It provides a basic foundation for building secure web applications.

Features

●User Registration: Allows users to create new accounts by providing their first name, last name, registration number, phone number, address, and password.
●Registration Number-Based Authentication: Authenticates users using their registration number and password.
●Password Encryption: Uses BCrypt to encrypt user passwords for security.
●Input Validation: Validates user input during registration to ensure data integrity.
●Role-Based Authorization: Sets a default user role ("client") upon registration, laying the groundwork for role-based access control.
●Thymeleaf Integration: Uses Thymeleaf templates for rendering dynamic HTML content.
●Bootstrap Framework: Utilizes Bootstrap for styling and layout, providing a responsive and visually appealing user interface.

Technologies Used

●Spring Boot: Framework for building production-ready Spring applications.
●Spring MVC: Framework for building web applications using the Model-View-Controller pattern.
●Spring Security: Framework for providing authentication and authorization mechanisms.
●MySQL: Relational database management system for data persistence.
●Spring Data JPA: Simplifies database interactions using Java Persistence API.
●Thymeleaf: Templating engine for server-side rendering of HTML.
●Bootstrap: Front-end framework for styling and responsiveness.

Project Structure

●controllers: Contains Spring MVC controllers for handling user requests.
●models: Contains data models, including entity classes for database persistence and DTOs (Data Transfer Objects) for data exchange between layers.
●repositories: Contains Spring Data JPA repositories for interacting with the database.
●services: Contains service classes that implement business logic, such as user registration and authentication.
●config: Contains configuration classes, including Spring Security configuration.
●templates: Contains Thymeleaf templates for rendering HTML views.

Database Setup

1.Create a MySQL database named "DB1".
2.Configure database connection properties in application.properties:

Running the Application

1.Build the project: Use Maven to build the project: mvn clean install.
2.Run the application: Execute the main class MyStoreApplication.
3.Access the application: Open a web browser and go to http://localhost:8080/.

Future Enhancements

●Custom Login Page: Implement a custom login page instead of the default Spring Security login form.
●Advanced Role-Based Authorization: Define different user roles and implement access control based on those roles.
●Registration Number Verification: Add registration number verification during user registration to confirm registration number.
●Password Reset Functionality: Allow users to reset their passwords if they forget them.

Contributing

Contributions to this project are welcome. Feel free to submit issues and pull requests.