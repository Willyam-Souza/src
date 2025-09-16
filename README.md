
# API de Biblioteca Pessoal 📚

> 🚧 Projeto desenvolvido como parte dos estudos em Java e Spring Boot, com foco na criação de APIs RESTful. 🚧

## 📝 Descrição

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de uma coleção pessoal de livros. O principal objetivo foi aplicar e consolidar conhecimentos em desenvolvimento backend, seguindo as melhores práticas de arquitetura, validação de dados e design de APIs.

A aplicação permite realizar um ciclo completo de operações CRUD (Criar, Ler, Atualizar e Deletar) para os livros, tratando cenários de erro e garantindo a integridade dos dados.

## ✨ Funcionalidades

  - ✅ **CRUD completo para Livros**:
      - Criar um novo livro.
      - Listar todos os livros cadastrados.
      - Buscar um livro específico por seu ID.
      - Atualizar as informações de um livro existente.
      - Deletar um livro.
  - ✅ **Validação de Dados**: Garante que dados inválidos (como títulos em branco ou anos negativos) não sejam persistidos no banco de dados, retornando respostas de erro claras (`400 Bad Request`).
  - ✅ **Tratamento de Erros**: Responde com códigos de status HTTP apropriados, como `404 Not Found` ao tentar acessar ou manipular um livro que não existe.
  - ✅ **Arquitetura em Camadas**: O código é organizado em camadas de Controller e Repository (e preparado para uma camada de Serviço), seguindo o princípio da Separação de Responsabilidades.

## 🛠️ Tecnologias Utilizadas

A seguinte stack foi utilizada para construir este projeto:

  - **Backend**:
      - `Java 17`
      - `Spring Boot 3.x`
      - `Spring Web`
      - `Spring Data JPA`
      - `Hibernate`
      - `Bean Validation`
  - **Banco de Dados**:
      - `H2 Database` (Banco de dados em memória para ambiente de desenvolvimento)
  - **Ferramentas e Gerenciamento**:
      - `Maven`
      - `Postman` (para testes e consumo da API)
      - `Git & GitHub` (para controle de versão)

## 🚀 Como Executar o Projeto

Siga os passos abaixo para executar o projeto em seu ambiente local.

**Pré-requisitos:**

  - `Java 17` ou superior
  - `Maven 3.8` ou superior
  - `Git`

**Passos:**

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/api-biblioteca.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd api-biblioteca
    ```
3.  **Execute a aplicação com o Maven Wrapper:**
      - No Windows:
        ```bash
        .\mvnw spring-boot:run
        ```
      - No Linux ou macOS:
        ```bash
        ./mvnw spring-boot:run
        ```
4.  **Acesse a API:**
      - A aplicação estará rodando em `http://localhost:8080`.

## 📖 Endpoints da API

Abaixo estão os endpoints disponíveis e como utilizá-los.

| Método HTTP | Endpoint           | Descrição                             | Exemplo de Corpo (Body)                                                                          |
|-------------|--------------------|---------------------------------------|--------------------------------------------------------------------------------------------------|
| `GET`       | `/livros`          | Lista todos os livros cadastrados.    | N/A                                                                                              |
| `GET`       | `/livros/{id}`     | Busca um livro específico pelo ID.    | N/A                                                                                              |
| `POST`      | `/livros`          | Cria um novo livro.                   | `{ "titulo": "A Guerra dos Tronos", "autor": "George R. R. Martin", "anoPublicacao": 1996 }`      |
| `PUT`       | `/livros/{id}`     | Atualiza um livro existente pelo ID.  | `{ "titulo": "A Fúria dos Reis", "autor": "George R. R. Martin", "anoPublicacao": 1998 }`         |
| `DELETE`    | `/livros/{id}`     | Deleta um livro pelo ID.              | N/A                                                                                              |

## 🎯 Próximos Passos (Future Work)

  - [ ] Implementar a entidade `Autor` e o relacionamento `@ManyToOne` com `Livro`.
  - [ ] Adicionar Paginação para a listagem de todos os livros.
  - [ ] Refatorar o tratamento de exceções com `@ControllerAdvice`.
  - [ ] Implementar Spring Security para proteger os endpoints.

## 👨‍💻 Autor

Desenvolvido por Willyam Souza.

  - LinkedIn: Willyam Souza - https://www.linkedin.com/in/willyam-souza-652a5437a/
  - GitHub: @Willyam-Souza  - https://github.com/Willyam-Souza
