# Hexagonal Architecture Explanation

This application follows the Hexagonal Architecture (Ports and Adapters pattern).

## Layers:

- **Domain:** Contains core business logic (`Event`, `Place`, and their interfaces).
- **Application:** Implements use cases as services (e.g., `EventService`, `PlaceService`).
- **Adapters:**
  - **In (Web):** REST controllers to handle HTTP requests.
  - **Out (Persistence):** Adapters to connect to PostgreSQL using JPA.
  
## Security:
JWT-based security ensures endpoints are protected, only authorized users can access or modify resources.

## Technologies:
- Java 17
- Spring Boot 3
- Spring Data JPA (XML-based mapping)
- Spring Security + JWT
- Docker & PostgreSQL
- Swagger / OpenAPI for API docs
