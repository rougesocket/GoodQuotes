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
### 🔹 Get Quotes by Author (Paginated)

Retrieve quotes from the database that match a specific author, with **pagination support**.

- **URL**: `/quotes/author/{author}`
- **Method**: `GET`
- **Path Variable**:
    - `author` – (string) The name of the author to filter by
- **Query Parameters**:
    - `page` – (optional, default = 0) Page number (0-based index)
    - `size` – (optional, default = 20) Number of quotes per page

---

#### ✅ Sample Request

```http
GET /quotes/author/Einstein?page=0&size=5
```
```json
{
    "content": [
        {
            "id": "6857d02fca0197cddc50ae70",
            "quote": "Don't cry because it's over, smile because it happened.",
            "author": "Dr. Seuss"
        },
        {
            "id": "6857d02fca0197cddc50ae71",
            "quote": "Don't cry because it's over, smile because it happened.",
            "author": "Dr. Seuss"
        },
        {
            "id": "6857d02fca0197cddc50ae7d",
            "quote": "You know you're in love when you can't fall asleep because reality is finally better than your dreams.",
            "author": "Dr. Seuss"
        },
        {
            "id": "6857d02fca0197cddc50aec4",
            "quote": "I like nonsense, it wakes up the brain cells. Fantasy is a necessary ingredient in living.",
            "author": "Dr. Seuss"
        },
        {
            "id": "6857d02fca0197cddc50aede",
            "quote": "Sometimes the questions are complicated and the answers are simple.",
            "author": "Dr. Seuss"
        }
    ],
    "page": {
        "size": 5,
        "number": 0,
        "totalElements": 37,
        "totalPages": 8
    }
}
```