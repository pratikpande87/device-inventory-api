# Device Inventory API (Java • Spring Boot)

![CI](https://github.com/pratikpande87/device-inventory-api/actions/workflows/ci.yml/badge.svg)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

A beginner-friendly REST API to manage a small **device inventory**, inspired by EMS/NMS workflows.  
Built with **Java 17, Spring Boot 3, Gradle, JPA (H2), Swagger/OpenAPI**.

---

## 🚀 Features
- CRUD endpoints for devices
- Validation (status = `ONLINE|OFFLINE|MAINTENANCE`, IPv4 address format)
- In-memory H2 database (no external setup)
- OpenAPI/Swagger UI at `/swagger-ui.html`
- Unit tests with MockMvc
- GitHub Actions CI (Gradle build + test + JaCoCo report)

---

## 📚 API Endpoints

| Method | Endpoint          | Description              |
|--------|------------------|--------------------------|
| POST   | `/api/devices`   | Create a new device      |
| GET    | `/api/devices`   | List all devices         |
| GET    | `/api/devices/{id}` | Get device by ID      |
| PUT    | `/api/devices/{id}` | Update device by ID   |
| DELETE | `/api/devices/{id}` | Delete device by ID   |

---

## 🔧 Quickstart

```bash
# Ensure Java 17+ and Gradle are installed
java -version
gradle -v

# Run tests
gradle test

# Start the app
gradle bootRun

![Swagger UI](docs/swagger-ui.png)
