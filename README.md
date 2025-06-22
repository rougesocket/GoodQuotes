# 📚 Quotes API - Spring Boot + MongoDB

A simple RESTful API for managing inspirational quotes, built with **Spring Boot** and **MongoDB**.

---

## 🚀 Features

- Create, read, update, and delete quotes
- Search quotes by author
- MongoDB-backed persistence
- RESTful and easy to use

---

## 🏗️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven / Gradle

---

## 📦 API Endpoints

### 🔹 Get All Quotes

- **URL**: `/quotes/{id}`
- **Method**: `GET`
- **Response**:`/quotes/64abc123`
```json
[
  {
    "id": "64abc123",
    "quote": "Stay hungry, stay foolish.",
    "author": "Steve Jobs"
  }
]
```
