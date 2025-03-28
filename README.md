# 🏥 Sistema de Gerenciamento de Consultas Médicas

> API RESTful para gestão de consultas médicas, pacientes e médicos desenvolvida com Spring Boot

## 📋 Índice
- [Tecnologias](#-tecnologias)
- [Pré-requisitos](#-pré-requisitos)
- [Endpoints](#-endpoints)
- [Exemplo de requisições](#-Exemplos-de-Requisições)
- [Licença](#-licença)

## 🛠 Tecnologias
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## 📌 Pré-requisitos
- JDK 17+
- Maven 3.8+
- PostgreSQL 14+
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)


## 🔍 Endpoints
Pacientes
Método	Endpoint	Descrição
POST	/api/pacientes	Cadastra novo paciente
GET	/api/pacientes	Lista todos pacientes
GET	/api/pacientes/{id}	Obtém paciente por ID
PUT	/api/pacientes/{id}	Atualiza paciente
DELETE	/api/pacientes/{id}	Remove paciente
 
📡 Exemplos de Requisições

POST /api/pacientes
Content-Type: application/json

{
  "nome": "João Silva",
  "cpf": "123.456.789-00",
  "dataNascimento": "1990-05-15",
  "telefone": "(11) 98765-4321",
  "email": "joao.silva@email.com",
  "endereco": "Rua das Flores, 123 - São Paulo/SP"
}
