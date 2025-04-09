# Event Managers for POSAM

A Spring Boot application following **Hexagonal Architecture** to manage events and places, using **JWT-secured REST APIs**, **PostgreSQL**, and **OpenAPI** documentation.

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




