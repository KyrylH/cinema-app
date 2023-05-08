# Cinema app
## Description
Cinema app is RESTful web application designed for demonstration purposes.\
It's simulates cinema ticket booking system.\
The application follows the REST architecture style.\
and application have role-based authorization.

## Navigation
* [Technologies](#technologies)
* [Project structure](#project-structure)
* [Make sure you have installed](#make-sure-you-have-installed)
* [Features](#features)
* [To run this app you need to](#to-run-this-app-you-need-to)
* [Available endpoints for the Cinema app](#available-endpoints-for-the-cinema-app)
* [Usage](#usage)

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
* Create database in MySQL
* Change username and password in application.properties
* Set up local tomcat server in IDE 
* Open in browser: `http://localhost:8080/`
---
## Available endpoints for the Cinema app:
* `/` - home page
* `/login` - login page
* `/register` - register page
* `/movie-sessions/available` - available sessions page
* `/cinema-halls` - cinema halls page
* `/sessions` - sessions page
* `/shopping-cart` - shopping cart page
* `/tickets` - tickets page
---
## Usage
You can use postman to test this app.\
## Author
**Kyryl Hyliuk**
