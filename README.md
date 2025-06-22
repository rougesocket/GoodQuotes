# 📚 GoodQuotes API - Spring Boot + MongoDB

A simple RESTful API for managing inspirational quotes, built with **Spring Boot** and **MongoDB**.

---

## 🚀 Features

- Get quotes based on id,category,author or tags
- Get Random quote
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

### 🔹 Get Quotes By Id

- **URL**: `/quotes/{id}`
- **Method**: `GET`
- **Response**:`/quotes/6857d02fca0197cddc50ae76`
```json
{
  "id": "6857d02fca0197cddc50ae76",
  "quote": "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
  "author": "Albert Einstein",
  "category": "humor"
}
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
GET /quotes/author/Albert Einstein?page=0&size=5
```
```json
{
  "content": [
    {
      "id": "6857d02fca0197cddc50ae76",
      "quote": "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
      "author": "Albert Einstein",
      "category": "humor"
    },
    {
      "id": "6857d02fca0197cddc50ae77",
      "quote": "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
      "author": "Albert Einstein",
      "category": "philosophy"
    },
    {
      "id": "6857d02fca0197cddc50ae78",
      "quote": "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
      "author": "Albert Einstein",
      "category": "science"
    },
    {
      "id": "6857d02fca0197cddc50aea6",
      "quote": "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.",
      "author": "Albert Einstein",
      "category": "life"
    },
    {
      "id": "6857d02fca0197cddc50aea7",
      "quote": "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.",
      "author": "Albert Einstein",
      "category": "inspiration"
    }
  ],
  "page": {
    "size": 5,
    "number": 0,
    "totalElements": 164,
    "totalPages": 33
  }
}
```
### 🔹 Get Quotes by Category (Paginated)

Fetch a paginated list of quotes that belong to a specific category.

- **URL**: `/quotes/category/{category}`
- **Method**: `GET`
- **Path Variable**:
  - `category` – (string) The quote category (e.g., "humor", "motivation")
- **Query Parameters**:
  - `page` – (optional, default = `0`) Page number (0-indexed)
  - `size` – (optional, default = `20`) Number of quotes per page

---

#### ✅ Sample Request

```http
GET /quotes/category/humor?page=1&size=5
```
```json
{
    "content": [
        {
            "id": "6857d02fca0197cddc50ae76",
            "quote": "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
            "author": "Albert Einstein",
            "category": "humor"
        },
        {
            "id": "6857d02fca0197cddc50ae80",
            "quote": "So many books, so little time.",
            "author": "Frank Zappa",
            "category": "humor"
        },
        {
            "id": "6857d02fca0197cddc50ae83",
            "quote": "You only live once, but if you do it right, once is enough.",
            "author": "Mae West",
            "category": "humor"
        },
        {
            "id": "6857d02fca0197cddc50ae9a",
            "quote": "Insanity is doing the same thing, over and over again, but expecting different results.",
            "author": "Narcotics Anonymous",
            "category": "humor"
        },
        {
            "id": "6857d02fca0197cddc50aea4",
            "quote": "The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid.",
            "author": "Jane Austen,  Northanger Abbey",
            "category": "humor"
        }
    ],
    "page": {
        "size": 5,
        "number": 0,
        "totalElements": 3811,
        "totalPages": 763
    }
}
```

### 🔹 Get Popular Quotes (Paginated & Sorted by Popularity)

Retrieve a list of quotes, sorted by **popularity in descending order**, with pagination support.

- **URL**: `/quotes/popular`
- **Method**: `GET`
- **Query Parameters**:
  - `page` – (optional, default = `0`) Page number (0-based index)
  - `size` – (optional, default = `20`) Number of quotes per page

---

#### ✅ Sample Request

```http
GET /quotes/popular?page=0&size=10
```
```Json
{
    "content": [
        {
            "id": "6857d02fca0197cddc50ae70",
            "quote": "Don't cry because it's over, smile because it happened.",
            "author": "Dr. Seuss",
            "category": "life"
        },
        {
            "id": "6857d02fca0197cddc50ae71",
            "quote": "Don't cry because it's over, smile because it happened.",
            "author": "Dr. Seuss",
            "category": "happiness"
        },
        {
            "id": "6857d02fca0197cddc50ae73",
            "quote": "I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.",
            "author": "Marilyn Monroe",
            "category": "life"
        },
        {
            "id": "6857d02fca0197cddc50ae74",
            "quote": "I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.",
            "author": "Marilyn Monroe",
            "category": "truth"
        },
        {
            "id": "6857d02fca0197cddc50ae72",
            "quote": "I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best.",
            "author": "Marilyn Monroe",
            "category": "love"
        }
    ],
    "page": {
        "size": 5,
        "number": 0,
        "totalElements": 48391,
        "totalPages": 9679
    }
}
```
### 🔹 Get a Random Quote

Returns a single, randomly selected quote from the MongoDB collection.

- **URL**: `/quotes/random`
- **Method**: `GET`
- **Response**: A single quote object (or empty optional)

---

#### ✅ Sample Request

```http
GET /quotes/random
```
```Json
{
  "id": "6857d031ca0197cddc512ba9",
  "quote": "And to 'scape stormy days, I choose an everlasting night.",
  "author": "John Donne,  The Complete English Poems",
  "category": "poetry"
}
```