# Sistema de Controle de Atendimentos para Petshop

Este é um sistema RESTful desenvolvido com **Spring Boot** para gerenciar atendimentos, cadastro de pets e clientes. O sistema possui autenticação JWT e autorização baseada em papéis (**Admin** e **Cliente**).

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security (JWT)**
- **Banco de Dados Relacional (PostgreSQL)**
- **Docker (Opcional)**
- **Swagger para documentação da API**

## Funcionalidades

- Cadastro de Clientes e Pets
- Gerenciamento de Endereços e Contatos
- Registro de Atendimentos
- Autenticação e Autorização via JWT
- Controle de Acesso por Perfis (Admin e Cliente)

## Como Executar o Projeto  

### **1️⃣ Configurar o Banco de Dados**
Certifique-se de ter um banco de dados PostgreSQL rodando e configure as credenciais no `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/petshop
spring.datasource.username=postgres
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.hikari.maximum-pool-size=10
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```
### 2️⃣ Clonar o Repositório
git clone [https://github.com/SEU-USUARIO/SEU-PROJETO.git](https://github.com/Januario86/petshop.git)

### 3️⃣ Executar a Aplicação
docker-compose up -d

### 4️⃣ Acessar a API
Após iniciar o projeto, a API estará disponível em http://localhost:8080.

Para visualizar a documentação da API:

Swagger: http://localhost:8080/swagger-ui.html

Endpoints Principais

POST	/auth/login	Autenticação e geração do token JWT
POST	/clientes	Cadastro de um novo cliente
GET	/clientes/{id}	Buscar informações do cliente
POST	/pets	Cadastro de um novo pet
GET	/pets/{id}	Buscar informações de um pet
POST	/atendimentos	Criar um atendimento
GET	/atendimentos/{id}	Consultar atendimento

Para acessar endpoints protegidos, faça login em /auth/login e use o token no header Authorization:
Authorization: Bearer SEU_TOKEN_JWT
