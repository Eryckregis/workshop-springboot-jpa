
# 👨‍💻 Workshop Spring Boot + JPA

Projeto desenvolvido com foco em aprendizado prático de backend, utilizando **Spring Boot** e **Spring Data JPA** para construção de **APIs REST** e **persistência de dados em banco relacional**

O foco é praticar **modelagem de domínio**, **relacionamentos JPA**, **API REST** e **boas práticas de arquitetura**.

Projeto desenvolvido durante estudos no curso de **Engenharia de Software**.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (ambiente de teste)
- Maven
- Jackson (JSON)

---

## 🧠 Conceitos Trabalhados

- Arquitetura em camadas (Controller, Service, Repository)
- API REST
- JPA / Hibernate
- Relacionamentos:
  - OneToMany
  - ManyToOne
  - ManyToMany
  - OneToOne
- Chave composta com `@EmbeddedId`
- Enum persistido como inteiro no banco
- Controle de serialização JSON (`@JsonIgnore`)
- População automática do banco com `CommandLineRunner`

---

## 📦 Modelo de Domínio

O sistema simula uma loja virtual contendo:

- **User** → Cliente da loja
- **Product** → Produtos disponíveis
- **Category** → Categorias dos produtos
- **Order** → Pedido realizado pelo usuário
- **OrderItem** → Itens do pedido (produto + quantidade + preço)
- **Payment** → Pagamento do pedido
- **OrderStatus** → Status do pedido (aguardando pagamento, pago, enviado, etc.)

---

## 🔗 Relacionamentos Principais

- Um **User** pode ter vários **Orders**
- Um **Order** pertence a um **User**
- Um **Order** possui vários **OrderItems**
- Um **Product** pode estar em vários **Orders**
- **OrderItem** utiliza **chave composta** (Order + Product)
- Um **Order** possui um **Payment**
- **Product** e **Category** possuem relacionamento Many-to-Many

---

## 🌐 Endpoints Disponíveis

### Usuários
- `GET /users`
- `GET /users/{id}`

### Produtos
- `GET /products`
- `GET /products/{id}`

### Categorias
- `GET /categories`
- `GET /categories/{id}`

### Pedidos
- `GET /orders`
- `GET /orders/{id}`

---

## 🛠️ Banco de Dados

- Banco em memória **H2**
- Dados de teste são carregados automaticamente ao iniciar a aplicação
- Configuração feita via `TestConfig` usando `CommandLineRunner`

---

## 🎯 Objetivo do Projeto

Este projeto tem como objetivo:

Consolidar conhecimentos em Java e Spring Boot

Aplicar JPA e Hibernate em um cenário real

Praticar modelagem de domínio

Entender o funcionamento completo de uma API REST

Servir como base para projetos mais avançados

Demonstrar prática para vagas de estágio em backend

## ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
