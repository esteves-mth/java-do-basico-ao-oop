# Library Management System

Sistema simples de gerenciamento de biblioteca desenvolvido em Java, com foco na aplicação prática de **Programação Orientada a Objetos (OOP)**.

O projeto simula o controle de livros, usuários e empréstimos, permitindo registrar retiradas e devoluções de livros.

## Funcionalidades

### 📚 Book
- Cadastro de livros com:
  - Título
  - Autor
  - Categoria
  - Total de páginas
- Validação do número de páginas

### 👤 User
- Cadastro de usuários da biblioteca
- Identificação por nome e ID

### 🔄 Loan
- Representa um empréstimo de livro
- Controle de estado (ativo ou devolvido)
- Associação entre usuário e livro

### 🏛️ LibraryManager
- Gerenciamento central do sistema
- Cadastro e remoção de usuários
- Cadastro e remoção de livros
- Listagem de livros disponíveis
- Busca de livros por:
  - Título
  - Categoria
- Controle de empréstimos e devoluções

## Estrutura do Projeto

- **Book**
  - Representa um livro da biblioteca
  - Contém informações básicas e validações

- **User**
  - Representa um usuário da biblioteca

- **Loan**
  - Controla o empréstimo de um livro
  - Define se o empréstimo está ativo

- **LibraryManager**
  - Classe responsável por toda a lógica do sistema
  - Gerencia usuários, livros e empréstimos

## Exemplo de Fluxo

1. Criar usuários
2. Cadastrar livros
3. Listar livros disponíveis
4. Realizar empréstimo de um livro
5. Devolver livro emprestado
6. Consultar livros por título ou categoria

## Conceitos de OOP Aplicados

- Encapsulamento
- Composição (`LibraryManager → Loan → Book / User`)
- Validação de dados
- Separação de responsabilidades
- Uso de Collections (`ArrayList`)
- Controle de estado de objetos

## Tecnologias Utilizadas

- Java
- Java Collections Framework
- Programação Orientada a Objetos (OOP)

## Objetivo do Projeto

Projeto desenvolvido para praticar a modelagem de sistemas de biblioteca em Java, reforçando conceitos de OOP, lógica de negócio e organização de código.

📌 Projeto focado apenas na lógica, sem interface gráfica.
