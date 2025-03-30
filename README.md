# Microservices Architecture

Welcome to the **Microservices Architecture** project! This system is designed with a **Service Registry**, **Admin Server**, **API Gateway**, **Config Server**, and **Config Client** to ensure scalability, maintainability, and ease of management for a distributed system.

## 🛠️ Architecture Overview

This microservices architecture follows a modular design where each component plays a specific role in maintaining the flow of data, managing configurations, and ensuring high availability.

### Components

- **Service Registry**: Registers all available microservices and enables dynamic discovery of services.
- **Admin Server**: Provides administrative capabilities like health checks, monitoring, and metrics for all services.
- **API Gateway**: Acts as the entry point for external clients to interact with internal services, routing requests and providing security features.
- **Config Server**: Centralizes configuration management for all services to provide consistency and manageability.
- **Config Client**: Fetches configuration properties from the Config Server and makes them available to the services.

---

## 🌟 Features

- **Dynamic Service Discovery**: With the Service Registry, services can dynamically discover and interact with each other without hard-coding IP addresses.
- **Centralized Configuration Management**: Config Server allows centralized management of configuration properties, keeping consistency across services.
- **Single Entry Point**: API Gateway acts as the gatekeeper to access all microservices through a unified entry point.
- **Health Monitoring & Metrics**: Admin Server enables real-time health checks and tracking of system performance.

---

## 🚀 Getting Started

### Prerequisites

To run this project locally, make sure you have the following tools installed:

- Java 17+ (for Spring Boot applications)
- Docker (optional, for containerization)
- Maven (or Gradle, depending on your build tool)

---

### Step-by-Step Guide

 **Clone the Repository**

   ```bash
   git clone https://github.com/ms593/microservices.git
   cd microservices-architecture
