
# CadastroDeNinjas 🥷

A simple Spring Boot application to manage Ninjas using RESTful APIs. This project demonstrates basic usage of Spring Boot, Spring Data JPA, and an in-memory H2 database.  
Originally created by [JasrrelRamirez](https://github.com/JasrrelRamirez), enhanced by community contributions.

---

## 🚀 Features

- ✅ Create and list Ninjas (POST and GET)
- ✅ H2 in-memory database support
- ✅ REST API tested with Postman
- ✅ Spring Boot 3.4.4
- ✅ Java SDK 24

---

## 🛠️ Tech Stack

- Java 24
- Spring Boot (Web, Data JPA)
- H2 Database (in-memory)
- Maven
- Postman for API testing

---

## 📦 Getting Started

### Prerequisites

- Java 24 installed
- Maven installed

### Run the App

```bash
git clone https://github.com/mollanegash/CadastroDeNinjas.git
cd CadastroDeNinjas
./mvnw spring-boot:run

The app will start on http://localhost:8080.

⸻

🧪 API Endpoints

✅ POST /ninjas

Create a new Ninja.

Request Body (JSON):

{
  "name": "Naruto",
  "health": 100,
  "attachPower": 80
}

Response:
	•	200 OK with the created Ninja.

⸻

✅ GET /ninjas

Fetch the list of all ninjas.

Response:
	•	200 OK with list of ninjas.

⸻

🖼️ Screenshots

POST /ninjas

GET /ninjas


⸻

📁 Folder Structure

CadastroDeNinjas/
├── src/
│   ├── main/
│   │   └── java/dev/java10x/cadastrodeninjas/
│   │       ├── model/Ninja.java
│   │       ├── NinjaRepository.java
│   │       ├── NinjaService.java
│   │       └── Controller.java
│   └── resources/
│       └── application.properties
├── pom.xml
└── README.md



⸻

🤝 Contribution

Feel free to fork and contribute!
This repo was updated to help close Issue #1: Configurar o SpringBoot.

⸻

📄 License

MIT

Let me know if you want to localize or simplify it further!
