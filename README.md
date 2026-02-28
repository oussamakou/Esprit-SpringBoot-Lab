# 🏥 University Hostel Management System - Spring Boot Lab

This project is a practical application for the **Architecture des SI II (4NIDS6)** course at ESPRIT University. It implements a complete backend for managing university dormitories (Foyers), blocks, rooms (Chambres), reservations, and students.

## 📐 Project Architecture

The project follows a **Layered Architecture** (Multi-tier), which is standard for Spring Boot applications:

- `entities`: JPA Entities representing the database schema (mapped from the Class Diagram).
- `repositories`: Interfaces extending `JpaRepository` for data access (Low-level CRUD).
- `services`: Business logic layer. Contains interfaces and their implementations.
- `controllers`: REST APIs to handle HTTP requests and return JSON.
- `configurations`: Spring configurations (e.g., Swagger, Security).

### 🏷️ Class Diagram Analysis
Based on the provided `diagramme_de_classe.png`:
- **Universite (1) <-> (1) Foyer**: One university has one foyer.
- **Foyer (1) <-> (*) Bloc**: One foyer contains multiple blocks.
- **Bloc (1) <-> (*) Chambre**: One block has several rooms.
- **Chambre (*) <-> (*) Reservation**: Many-to-Many relationship (via an association table).
- **Etudiant (*) <-> (*) Reservation**: Many-to-Many relationship.

## 🛠️ Technology Stack
- **Spring Boot 3+**: Core framework.
- **Spring Data JPA**: For database operations.
- **MySQL**: Relational database.
- **Lombok**: To reduce boilerplate code (Getters/Setters/Constructors).
- **Spring Web**: To build RESTful services.

## 📚 Exam Preparation Guide (Key Concepts)

### 1. JPA Annotations to Master
- `@Entity`: Marks a class as a database table.
- `@Id` & `@GeneratedValue`: Primary key definition.
- `@ManyToOne`, `@OneToMany`, `@ManyToMany`, `@OneToOne`: Relationship mappings.
- `@Enumerated(EnumType.STRING)`: For Java Enums (like `TypeChambre`).
- `@JsonIgnore`: Crucial to avoid infinite loops in bidirectional relationships.

### 2. Spring Data JPA
- The repositories extend `JpaRepository<Entity, IdType>`.
- You can add custom queries using **Derived Query Methods** (e.g., `findByNomBloc(String nom)`) or `@Query` (JPQL).

### 3. Service Layer (Business Logic)
- Define an interface (e.g., `IBlocService`) and its implementation (`BlocServiceImpl`).
- Annotate the implementation with `@Service`.
- Use **Constructor Injection** (best practice) to inject repositories.

### 4. Controller Layer (REST)
- `@RestController`: Combines `@Controller` and `@ResponseBody`.
- `@RequestMapping("/api/...")`: Base URI.
- HTTP Methods: `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`.
- `@RequestBody`: To get JSON from the request.
- `@PathVariable`: To get values from the URL (e.g., `/chambre/{id}`).

## 🚀 How to Run
1. Configure your MySQL database in `src/main/resources/application.properties`.
2. Run `mvn spring-boot:run`.
3. The database tables will be automatically generated (`ddl-auto=update`).

---
*Created for 4NIDS6 students - Keep this as your main reference for the practical exam.*
