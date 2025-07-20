# 🔗 Encurtador de Link

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2_Database-000000?style=for-the-badge&logo=h2&logoColor=white)
![REST API](https://img.shields.io/badge/REST_API-005571?style=for-the-badge&logo=rest-api&logoColor=white)

## 📝 Descrição do Projeto

Este projeto é uma **API RESTful desenvolvida com Java e Spring Boot para encurtar URLs longas**, gerando códigos curtos que redirecionam para os links originais. Oferece funcionalidades de encurtamento, redirecionamento e consulta de estatísticas de acesso (número de visitas).

## ✨ Funcionalidades Principais

*   **Encurtamento de URLs**: Converta URLs longas em códigos curtos e únicos.
*   **Redirecionamento**: Redireciona para a URL original ao acessar o link encurtado.
*   **Estatísticas de Acesso**: Visualize o número de visitas para cada link encurtado.

## 🚀 Tecnologias Utilizadas

*   **Java 17**
*   **Spring Boot 3.5.3** (Web, Data JPA, Validation)
*   **Maven**
*   **H2 Database** (para desenvolvimento/testes)

## 🛠️ Como Rodar o Projeto

### Pré-requisitos

*   JDK 17 ou superior
*   Maven

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/thoncoder/encurtador-de-link-api.git
    cd encurtador-de-link-api
    ```
2.  **Compile e execute:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
    A API estará disponível em `http://localhost:8080`.

## 💡 Endpoints da API

*   **`POST /encurtar`**: Encurta uma URL.
    *   **Corpo**: `{"originalUrl": "sua-url-longa"}`
    *   **Resposta**: `{"urlEncurtada": "http://localhost:8080/abcde"}`
*   **`GET /stats/{code}`**: Retorna estatísticas (originalUrl, visitas) de um link.
*   **`GET /{code}`**: Redireciona para a URL original.

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## 📄 Licença

Este projeto está licenciado sob a licença [MIT](https://opensource.org/licenses/MIT).
