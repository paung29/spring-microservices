# 🚀 Spring Microservices Learning Journey

A hands-on learning repository showcasing practical implementation of **Microservices Architecture** using:

- Spring Boot
- Spring Cloud
- Docker
- Kubernetes
- Event-Driven systems

with progressive complexity across multiple sections.

---

## 📌 Overview

This project demonstrates the evolution of microservices architecture from fundamental concepts to enterprise-grade implementations.

### 🔑 Key Topics Covered

- Microservices design patterns and best practices  
- Spring Boot & Spring Cloud ecosystem  
- Service discovery, API Gateway, and load balancing  
- Centralized configuration management  
- Docker containerization and Docker Compose orchestration  
- Kubernetes deployment and management  
- Resilience patterns (Circuit Breaker, Retry, Timeout)  
- Event-driven architecture with RabbitMQ and Kafka  
- Security (OAuth2, JWT, service-to-service authentication)  
- Observability and monitoring  
- Distributed tracing and logging  

---

## 🛠️ Tech Stack

| Category | Technologies |
|----------|-------------|
| Backend | Java, Spring Boot, Spring Cloud |
| Databases | MySQL |
| Messaging | RabbitMQ, Kafka |
| Service Mesh | Eureka (Service Discovery), API Gateway |
| Containerization | Docker, Docker Compose |
| Orchestration | Kubernetes |
| Config Management | Spring Cloud Config Server |
| Monitoring | Prometheus, Grafana |
| Security | OAuth2, JWT, mTLS |

---

## 📂 Project Structure

```bash
spring-microservices/
├── section2/                    # Basic Microservices (3 services)
│   ├── accounts/
│   ├── cards/
│   └── loans/
├── section4/                    # Docker Containerization
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   └── docker-compose.yml
├── section6/                    # Config Server & Security
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   └── docker-compose/
├── section7/                    # Advanced Config Management
├── section8/                    # Service Discovery (Eureka)
├── section9/                    # API Gateway Pattern
├── section10/                   # Advanced Gateway & Routing
├── section11/                   # Event-Driven Architecture
└── Microservices.postman_collection.json
```

---

## 📚 Section Breakdown

### Section 2: Basic Microservices
Three independent Spring Boot services:
- Accounts
- Cards
- Loans

### Section 4: Docker Containerization
Services packaged as Docker containers with Docker Compose orchestration.

### Section 6: Config Server & Security
Centralized configuration management using Spring Cloud Config Server.

### Section 7: Advanced Configuration
Enhanced configuration patterns and security implementations.

### Section 8: Service Discovery
Eureka server with dynamic service registration and client-side load balancing.

### Section 9: API Gateway
Spring Cloud Gateway implementation for routing and filtering.

### Section 10: Advanced Gateway & Routing
Advanced routing rules and resilience strategies.

### Section 11: Event-Driven Architecture
Asynchronous communication using RabbitMQ / Kafka.

---

## 🚀 Quick Start

### 📦 Prerequisites

- Java 11+ (JDK)
- Maven 3.6+
- Docker & Docker Compose
- MySQL

---

### ▶️ Running Individual Services

```bash
cd section2/accounts
./mvnw clean package
./mvnw spring-boot:run
```

---

### 🐳 Running with Docker Compose

```bash
cd section8/docker-compose/default
docker-compose up -d
docker-compose logs -f
docker-compose down
```

---

## 📡 API Testing

Import:

```
Microservices.postman_collection.json
```

into Postman.

---

## 🔄 Service Communication

| Service | Default Port | Purpose |
|----------|-------------|----------|
| Accounts | 8080 | Customer account management |
| Cards | 8081 | Credit/debit card services |
| Loans | 8082 | Loan management services |
| Config Server | 8088 | Centralized configuration |
| Eureka Server | 8761 | Service discovery |
| API Gateway | 8072 | Unified API gateway |

---

## 🛡️ Security

- OAuth2 & JWT authentication
- Service-to-service authentication
- HTTPS/TLS encryption
- API rate limiting via gateway

---

## 📊 Monitoring & Observability

- Prometheus for metrics
- Grafana for dashboards
- Distributed tracing
- Centralized logging

---

## 🤝 Contributing

This is a learning repository. Feel free to explore, modify, and extend.

---

## 📖 Resources

- Spring Boot Documentation  
- Spring Cloud Documentation  
- Docker Documentation  
- Kubernetes Documentation  
