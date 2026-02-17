Spring Microservices Learning Journey
A hands-on learning repository showcasing practical implementation of Microservices Architecture using Spring Boot, Spring Cloud, Docker, Kubernetes, and Event-Driven systems with progressive complexity across multiple sections.

📌 Overview
This project demonstrates the evolution of microservices architecture from fundamental concepts to enterprise-grade implementations. It includes multiple sections, each building upon the previous one with increasing complexity and advanced patterns.

Key Topics Covered:

Microservices design patterns and best practices
Spring Boot & Spring Cloud ecosystem
Service discovery, API Gateway, and load balancing
Centralized configuration management
Docker containerization and Docker Compose orchestration
Kubernetes deployment and management
Resilience patterns (Circuit Breaker, Retry, Timeout)
Event-driven architecture with RabbitMQ and Kafka
Security (OAuth2, JWT, service-to-service authentication)
Observability and monitoring
Distributed tracing and logging
🛠️ Tech Stack
Category	Technologies
Backend	Java, Spring Boot, Spring Cloud
Databases	MySQL
Messaging	RabbitMQ, Kafka
Service Mesh	Eureka (Service Discovery), API Gateway
Containerization	Docker, Docker Compose
Orchestration	Kubernetes
Config Management	Spring Cloud Config Server
Monitoring	Prometheus, Grafana
Security	OAuth2, JWT, mTLS
📂 Project Structure
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
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   └── docker-compose/
├── section8/                    # Service Discovery (Eureka)
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   ├── eurekaserver/
│   └── docker-compose/
├── section9/                    # API Gateway Pattern
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   ├── eurekaserver/
│   ├── gatewayserver/
│   └── docker-compose/
├── section10/                   # Advanced Gateway & Routing
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   ├── eurekaserver/
│   ├── gatewayserver/
│   └── docker-compose/
├── section11/                   # Event-Driven Architecture
│   ├── accounts/
│   ├── cards/
│   ├── loans/
│   ├── configserver/
│   ├── eurekaserver/
│   ├── gatewayserver/
│   └── docker-compose/
└── Microservices.postman_collection.json  # API test collection
📚 Section Breakdown
Section 2: Basic Microservices
Three independent Spring Boot services: Accounts, Cards, and Loans microservices.

Section 4: Docker Containerization
Services packaged as Docker containers with Docker Compose orchestration.

Section 6: Config Server & Security
Centralized configuration management using Spring Cloud Config Server with security enhancements.

Section 7: Advanced Configuration
Enhanced configuration management patterns and security implementations.

Section 8: Service Discovery
Eureka service discovery server with dynamic service registration and client-side load balancing.

Section 9: API Gateway
Spring Cloud Gateway implementation for request routing, filtering, and unified API access.

Section 10: Advanced Gateway & Routing
Enhanced API Gateway patterns with advanced routing rules and resilience strategies.

Section 11: Event-Driven Architecture
Asynchronous communication between services using message brokers (RabbitMQ/Kafka).

🚀 Quick Start
Prerequisites
Java 11+ (JDK)
Maven 3.6+
Docker & Docker Compose
MySQL (or Docker-based MySQL)
Running Individual Services
# Navigate to a section
cd section2/accounts

# Build the service
./mvnw clean package

# Run the service
./mvnw spring-boot:run
Running with Docker Compose
# Navigate to section with docker-compose
cd section8/docker-compose/default

# Start all services
docker-compose up -d

# View logs
docker-compose logs -f

# Stop services
docker-compose down
📡 API Testing
Import the provided Postman collection to test the microservices APIs:

Microservices.postman_collection.json
🔄 Service Communication
Service	Default Port	Purpose
Accounts	8080	Customer account management
Cards	8081	Credit/debit card services
Loans	8082	Loan management services
Config Server	8088	Centralized configuration
Eureka Server	8761	Service discovery
API Gateway	8072	Unified API gateway
🛡️ Security
OAuth2 and JWT token-based authentication
Service-to-service authentication
HTTPS/TLS encryption
API rate limiting via gateway
📊 Monitoring & Observability
Prometheus for metrics collection
Grafana for visualization
Distributed tracing capabilities
Centralized logging
🤝 Contributing
This is a learning repository. Feel free to explore, modify, and extend the implementations.

📖 Resources
Spring Boot Documentation
Spring Cloud Documentation
Docker Documentation
Kubernetes Documentation
📄 License
This project is for educational purposes.
