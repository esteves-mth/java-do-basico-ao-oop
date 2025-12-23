# Contact Manager

Projeto em Java que simula um **gerenciador de contatos**, permitindo criar, editar, remover e organizar contatos em grupos, utilizando **Programação Orientada a Objetos**.

## Funcionalidades

### 📇 Contatos
- Adicionar contatos com **nome, número e ID único**
- Editar nome ou número de um contato
- Remover contato por **ID** ou por **número**
- Listar todos os contatos cadastrados
- Buscar contato por **nome** ou **número**

### 👥 Grupos
- Criar grupos com **nome e ID único**
- Editar nome de grupos
- Remover grupos
- Listar todos os grupos

### 🔗 Contatos em Grupos
- Adicionar contato a um grupo usando **número** ou **ID**
- Remover contato de um grupo
- Listar contatos pertencentes a um grupo específico

## Estrutura do Projeto

- **AddressBook**  
  Classe principal de gerenciamento, responsável por controlar contatos e grupos.

- **Contact**  
  Representa um contato com:
  - nome
  - número
  - ID único

- **Group**  
  Representa um grupo de contatos, permitindo adicionar e remover contatos.

## Conceitos de OOP Aplicados

- Encapsulamento
- Composição (Group contém uma lista de Contact)
- Manipulação de listas (`ArrayList`)
- Validação de dados (IDs únicos)
- Separação de responsabilidades por classe

## Tecnologias Utilizadas

- Java
- Collections Framework (`List`, `ArrayList`)
- Programação Orientada a Objetos

## Objetivo do Projeto

Este projeto foi desenvolvido para **praticar conceitos de OOP em Java**, simulando um sistema real de gerenciamento de contatos via console.

📌 Projeto focado em lógica e estrutura de código, sem interface gráfica.
