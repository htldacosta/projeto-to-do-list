# API de Lista de Tarefas (Todo-List) simples com H2 db

![badge-em-desenvolvimento](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

Esta é uma API RESTful simples para gerenciar uma lista de tarefas. O projeto foi desenvolvido com Spring Boot, utilizando o Spring Data JPA para persistência de dados em um banco de dados em memória (H2 Database).

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.x**
* **Spring Data JPA**
* **H2 Database** (para o banco de dados em memória)
* **Maven**

## ✨ Funcionalidades

A API permite realizar operações CRUD (Create, Read, Update, Delete) em tarefas.

* `GET /api/task`: Lista todas as tarefas.
* `GET /api/task/{id}`: Busca uma tarefa específica por ID.
* `POST /api/task`: Cria uma nova tarefa.
* `PUT /api/task/{id}`: Atualiza uma tarefa existente.
* `DELETE /api/task/{id}`: Remove uma tarefa.

## ⚙️ Como Rodar o Projeto

### Pré-requisitos

Certifique-se de ter o **JDK 17** ou superior e o **Maven** instalados em sua máquina.

### Passos para Executar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-projeto.git](https://github.com/seu-usuario/seu-projeto.git)
    cd seu-projeto
    ```

2.  **Construa o projeto com Maven:**
    ```bash
    ./mvnw clean package
    ```

3.  **Execute o aplicativo:**
    ```bash
    java -jar target/todolist-0.0.1-SNAPSHOT.jar
    ```

O servidor será iniciado na porta padrão `8080`.

### Acessando o Console do H2

Se você quiser visualizar o banco de dados em memória, acesse o console do H2 no seu navegador:

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Use as seguintes credenciais:
* **Driver Class:** `org.h2.Driver`
* **JDBC URL:** `jdbc:h2:mem:todolistdb`
* **User Name:** `sa`
* **Password:** `123`

## 🤝 Contribuições
O propósito do projeto foi apenas de estudo. Não são necessárias melhorias ou qualquer tipo de mudança no curto e médio prazo.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT.