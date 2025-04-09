# Event Managers for POSAM


---

## 🚀 How to Run

### 1. Start PostgreSQL via Docker Compose
```bash
docker-compose up -d
```

### 2. Build and Run the Application
```bash
./mvnw spring-boot:run
```

### 3.Postman 
**Token** 
```bash
POST /auth/login
Content-Type: application/json

{
  "username": "admin",
  "password": "admin123"
}

```
Answer look like
```bash
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI..."
}


```

**Request**
```bash
POST /auth/register
Content-Type: application/json

{
  "username": "admin",
  "password": "admin123"
}

```
Answer look like
```bash
{
  "message": "User registered"
}



```

---

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MapStruct**
- **PostgreSQL** (via Docker)
- **OpenAPI** (Swagger UI)
- **Postman** Collection for API testing
- **JWT-based Security**

---

## 📁 Project Structure – Hexagonal Architecture

```
📆 src
👤📁 domain
├── 📁 model
│   ├── Event.java
│   └── Place.java
└── 📁 port
    └── EventRepository / PlaceRepository (interfaces)

📁 application
└── 📁 service
    └── EventService / PlaceService

📁 adapter
├── 📁 in
│   └── 📁 web
│       └── EventController / PlaceController
└── 📁 out
    └── 📁 persistence
        └── EventJpaAdapter / PlaceJpaAdapter

📁 config
└── OpenAPI + Security configuration
```



