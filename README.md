# Cinema app
## Description
Cinema app is RESTful web application designed for demonstration purposes.\
It's application simulates cinema ticket booking system.\
The application follows the REST architecture style.\
and application have role-based authorization.
## Navigation
* [Technologies](#technologies)
* [Project structure](#project-structure)
* [Make sure you have installed](#make-sure-you-have-installed)
* [Features](#features)
* [To run this app you need to](#to-run-this-app-you-need-to)
* [Available endpoints for the Cinema app](#available-endpoints-for-the-cinema-app)
## Technologies
| Techonology     | version |
|-----------------|---------|
| Java            | 17      |
| Apache maven    | 3.8.2   |
| Apache tomcat   | 9.0.78  |
| MySQL           | 8.0.32  |
| Spring Framework | 5.3.20  |
| Spring Security | 5.6.10  |
| Spring MVC      | 5.3.9   |
| Hibernate ORM   | 5.6.14  |
### Project structure
The project following 3-tier architecture:
* Presentation layer (Controllers)
* Service layer (Services)
* Data access layer (DAO)
## Package structure
* `controllers` - Controllers contains endpoints
* `model` - contains entities
* `service` - contains services and business logic
* `dao` - contains data access objects and database logic
* `security` - contains security configuration
* `util` - contains util classes
* `config` - contains configuration classes
### Make sure you have installed:
* Java 17
* Apache maven 3.8.2
* Apache tomcat 9.0.78
* MySQL 8.0.32
### Features:
* Registration with role-based authorization
* Multiple endpoints for different roles
### To run this app you need to:
* Clone this repository
* Create database in MySQL with name `cinema`
* Set up database connection in `src/main/resources/db.properties`
* Run `mvn clean install`
* Deploy war file to tomcat server
* Run tomcat server
* Open in browser: `http://localhost:8080/`
---
## Api endpoints
### Available endpoints for the Cinema app:
* Authentication endpoints:
  * `POST /register` - register new user. (Available for all)
* CinemaHall
    * `POST /cinema-halls` - Create new cinema hall. (Available for ADMIN)
    * `GET /cinema-halls` - Show all cinema halls. (Available for all)
* Movie
    * `POST /movies` - Create new movie. (Available for ADMIN)
    * `GET /movies` - Show all movies. (Available for all)
* MovieSession
    * `POST /movie-sessions` - Create new movie session. (Available for ADMIN)
    * `GET /movie-sessions/available` - Show all available movie sessions. (Available for all)
    * `PUT /movie-sessions/{id}` - Update movie session. (Available for ADMIN)
    * `DELETE /movie-sessions/{id}` - Delete movie session. (Available for ADMIN)
* Order
  * `POST /orders/complete` - Complete order. (Available for user)
  * `GET /orders` - Show all orders. (Available for current user)
* ShoppingCart
    * `POST /shopping-carts/movie-sessions` - Add movie session to shopping cart. (Available for user)
    * `PUT /shopping-carts/by-user` - Show shopping cart by user. (Available for user)
* User
  * `GET /users/by-email` - Show user by email. (Available for ADMIN)
---
## Credentials for testing
* Email: `admin@i.ua`
* Password: `admin123`
## Author
**Kyryl Hyliuk**
