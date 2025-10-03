# Device Inventory API (Java • Spring Boot)

A beginner-friendly REST API to manage a tiny device inventory, inspired by EMS/NMS workflows.

## Features
- CRUD endpoints for devices (name, serial, type, status, IP)
- In‑memory H2 database (no setup required)
- Bean validation (status: `ONLINE|OFFLINE|MAINTENANCE`, IPv4 format)
- OpenAPI/Swagger UI at `/swagger-ui.html`
- Unit test with MockMvc
- GitHub Actions CI (build + tests + JaCoCo report)

## Quickstart
```bash
# 0) Ensure Java 17+ and Gradle are installed
java -version
gradle -v

# 1) Run tests and app
gradle test
gradle bootRun

# 2) Open the API docs
open http://localhost:8080/swagger-ui.html   # macOS
# or start the H2 console (optional): http://localhost:8080/h2-console
```

## API Examples
```bash
# Create
curl -X POST http://localhost:8080/api/devices -H "Content-Type: application/json" -d '{
  "name":"Core Router","serialNumber":"SN-123","type":"router","status":"ONLINE","ipAddress":"10.0.0.1"
}'

# List
curl http://localhost:8080/api/devices

# Get by id
curl http://localhost:8080/api/devices/1

# Update
curl -X PUT http://localhost:8080/api/devices/1 -H "Content-Type: application/json" -d '{
  "name":"Core Router","serialNumber":"SN-123","type":"router","status":"MAINTENANCE","ipAddress":"10.0.0.1"
}'

# Delete
curl -X DELETE http://localhost:8080/api/devices/1
```

## Push to GitHub
```bash
# From the project root
git init
git add .
git commit -m "Initial commit: Device Inventory API (Spring Boot)"
# If you have GitHub CLI:
gh repo create device-inventory-api --public --source=. --remote=origin --push
# Or manually (replace USERNAME):
git branch -M main
git remote add origin https://github.com/USERNAME/device-inventory-api.git
git push -u origin main
```

## CI (GitHub Actions)
On every push, CI runs `gradle build test` on Java 17.

## License
MIT
