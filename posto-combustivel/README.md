# ⛽ Sistema de Gerenciamento de Posto de Combustível

Projeto desenvolvido com Java + Spring Boot para gerenciamento de um posto de combustível, permitindo o controle de abastecimentos, bombas de combustível e tipos de combustível.

## 🚀 Tecnologias Utilizadas

* Java 26
* Spring Boot
* Spring Web MVC
* Spring Data JPA
* PostgreSQL
* Maven
* Lombok

---

## 📚 Funcionalidades

O sistema possui funcionalidades para:

### 🔹 Tipos de Combustível

* Cadastrar tipos de combustível
* Listar combustíveis
* Atualizar combustíveis
* Remover combustíveis

### 🔹 Bombas de Combustível

* Cadastrar bombas
* Listar bombas cadastradas
* Atualizar informações das bombas
* Remover bombas

### 🔹 Abastecimentos

* Registrar abastecimentos
* Consultar abastecimentos realizados
* Relacionar abastecimento com bomba e combustível

---

## 📂 Estrutura do Projeto

```bash
src/main/java/com/example/posto_combustivel
│
├── Controller
├── Entity
├── Repository
├── Service
└── PostoCombustivelApplication
```

### 📌 Camadas

* **Controller** → Responsável pelas rotas da API
* **Service** → Regras de negócio
* **Repository** → Comunicação com o banco de dados
* **Entity** → Representação das tabelas

---

## ⚙️ Configuração do Banco de Dados

Configure o arquivo:

```properties
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/posto_combustivel
spring.datasource.username=postgres
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

### 2️⃣ Entrar na pasta do projeto

```bash
cd posto-combustivel
```

### 3️⃣ Executar o projeto

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux/Mac:

```bash
./mvnw spring-boot:run
```

---

## 🔌 Endpoints Principais

### Combustíveis

* `GET /tipos-combustivel`
* `POST /tipos-combustivel`

### Bombas

* `GET /bombas`
* `POST /bombas`

### Abastecimentos

* `GET /abastecimentos`
* `POST /abastecimentos`

---

## 🎯 Objetivo do Projeto

O objetivo deste projeto é praticar conceitos importantes de desenvolvimento backend utilizando Spring Boot, como:

* API REST
* Arquitetura em camadas
* CRUD
* Integração com banco de dados
* JPA/Hibernate
* Organização de projeto Java

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática com Spring Boot.
