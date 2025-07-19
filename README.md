# 📋 Student Survey Application

This is a **Spring Boot** based backend application designed for collecting and managing student survey submissions. The project implements RESTful APIs for survey management and is containerized for deployment in modern DevOps environments using Docker and Kubernetes.

---

## 🚀 Features

- 📊 **Student Survey API** – collect and manage student surveys
- ✅ **CRUD Operations** on survey submissions
- 🛡️ **Data Validation** with Jakarta Validation API
- 🛠️ **Secure Configuration** – sensitive key file included for secure backend communication (handle carefully)
- 📦 Containerized with **Docker**
- ☸️ Kubernetes-ready using deployment descriptors
- 🔄 CI/CD-ready with **Jenkinsfile**
- 📡 Designed for cloud deployment (AWS EC2 recommended)

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.4.4
- Maven
- Docker
- Kubernetes (YAML deployment files)
- Jenkins (CI/CD)
- AWS EC2 (suggested deployment environment)

---

## 📂 Project Structure

- `momtrimo/`: Main Spring Boot project
  - `src/`: Java source code and configuration
  - `pom.xml`: Maven configuration
  - `Dockerfile`: Container image definition
  - `deployment.yaml`: Kubernetes Deployment descriptor
  - `service.yaml`: Kubernetes Service descriptor
  - `Jenkinsfile`: CI/CD pipeline definition
- `survey/`: (Unused/empty)
- `survey-backend.yaml`: Additional backend service configuration
- `survey-backend-key.pem`: SSL/TLS key (ensure secure handling!)

---

## 📡 REST API Endpoints

Base URL: `/api/surveys`

| Method   | Endpoint          | Description                      |
|----------|-------------------|----------------------------------|
| `GET`    | `/api/surveys`    | Fetch all surveys                |
| `POST`   | `/api/surveys`    | Create a new survey              |
| `GET`    | `/api/surveys/{id}` | Fetch survey by ID             |
| `PUT`    | `/api/surveys/{id}` | Update existing survey         |
| `DELETE` | `/api/surveys/{id}` | Delete survey by ID            |

All endpoints expect/return JSON payloads. Create/Update APIs require a valid `Survey` object in the request body.

---

## 📬 API Testing with Postman

- Import the API collection manually or test endpoints directly in **Postman**:
    - Set **Base URL**: `http://localhost:8080/api/surveys`
    - Use appropriate HTTP methods (GET, POST, PUT, DELETE)
    - Set **Headers**: `Content-Type: application/json`
    - For POST/PUT, include a JSON body representing the survey object

Example POST body:

```json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "state": "Virginia",
    "streetAddress": "1234 Main St",
    "city": "Fairfax",
    "zip": "22030",
    "telephoneNumber": "1234567890",
    "url": "http://example.com",
    "dateOfSurvey": "2025-07-19"
}
```

## ⚙️ Setup & Usage

### 1️⃣ Prerequisites

- Java 17
- Maven
- Docker (optional, for container builds)
- Kubernetes (optional, for deployment)
- AWS CLI (optional)

### 2️⃣ Build the Application

```bash
cd momtrimo
./mvnw clean install
./mvnw spring-boot:run
```

### 3️⃣ 📦 Docker Deployment

```bash
docker build -t student-survey-app .
docker run -p 8080:8080 student-survey-app
```
This will package the application as a Docker image and expose it on port 8080.

### 4️⃣ ☸️ Kubernetes Deployment

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```
This deploys the application to a Kubernetes cluster using the provided deployment and service YAML files.

## 📈 CI/CD Pipeline

Automated builds and deployments are handled using the provided **Jenkinsfile**.

**Recommended Setup:**

- **Source Control:** GitHub or GitLab repository
- **CI/CD Server:** Jenkins configured to monitor your repository
- **Deployment Target:** AWS EC2 instance or Kubernetes cluster

**The Jenkins pipeline will:**

- Build the application
- Create Docker images
- Push Docker images to a container registry (optional)
- Deploy to production environments automatically

---

## 🏗️ Future Enhancements

- Role-based access control (RBAC)
- Swagger/OpenAPI Documentation
- Analytics Dashboard for survey metrics
- Docker Compose setup for local multi-container development
- Centralized Logging and Monitoring using:
  - ELK Stack (Elasticsearch, Logstash, Kibana)
  - Prometheus + Grafana


## 👨‍💻 Author

Developed by **Gautama Shastry** and **Maheedar Sai** as part of **SWE645** coursework.

---

## 📄 License

Licensed under the **MIT License**.
