# Greeting Spring Application

## 📌 Overview
A simple Spring Boot REST application to generate and manage greeting messages.

---

## ✨ Features
- Layered architecture (Controller, Service, Repository)
- REST APIs for greeting operations
- In-memory data storage
- Supports GET, PUT, DELETE operations

---

## 📂 Project Structure
```text
com.gevernova
├── configuration
│   └── Config.java
├── controller
│   └── GreetingController.java
├── entity
│   └── Greeting.java
├── repository
│   └── GreetingRepository.java
├── service
│   ├── GreetingService.java
│   └── GreetingServiceImpl.java
```
---

## ▶️ How to Run
- Open the project in IntelliJ / Eclipse

- Run the GreetingApplication class

- Application starts on http://localhost:8080

---
## Sample API Endpoints

- GET /greeting

- GET /greeting/{id}

- GET /greeting/all

- PUT /greeting/{id}?message=Hello

- DELETE /greeting/{id}
---

## 📌 Architecture Overview
- **Controller**: Handles REST requests
- **DTO**: Transfers request data
- **Model**: Represents database entity
- **Service**: Contains business logic
- **Repository**: Handles database operations
- **Exception**: Centralized error handling