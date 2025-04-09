# Event managers for POSAM
## How to run 

## Technologies:
Java 17+

Spring Boot 3.x

Spring Data JPA 

MapStruct 
PostgreSQL (via Docker)

OpenAPI (Swagger UI)

Postman collection for API testing

JWT Security 
## File struct 
📦 src
├── 📁 domain
│   ├── 📁 model
│   │   ├── Event.java
│   │   └── Place.java
│   └── 📁 port
│       └── EventRepository / PlaceRepository (интерфейсы)
│
├── 📁 application
│   └── 📁 service
│       └── EventService / PlaceService
│
├── 📁 adapter
│   ├── 📁 in
│   │   └── 📁 web
│   │       └── EventController / PlaceController
│   └── 📁 out
│       └── 📁 persistence
│           └── EventJpaAdapter / PlaceJpaAdapter
│
└── 📁 config
    └── OpenAPI + Security config
