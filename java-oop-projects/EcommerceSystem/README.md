# Ecommerce System

Projeto em Java que simula um **sistema básico de e-commerce**, com gerenciamento de clientes, produtos, carrinho de compras e itens de pedido, aplicando conceitos fundamentais de **Programação Orientada a Objetos (OOP)**.

## Funcionalidades

### 👤 Cliente (Customer)
- Criar clientes com **ID** e **nome**
- Associar pedidos a um cliente
- Limpar histórico de pedidos

### 📦 Produto (Product)
- Criar produtos com:
  - ID
  - nome
  - preço
  - estoque
- Atualizar preço do produto
- Adicionar ou remover quantidade do estoque
- Validação básica de estoque e valores

### 🛒 Carrinho de Compras (ShoppingCart)
- Adicionar produtos ao carrinho com quantidade
- Remover produtos do carrinho
- Visualizar itens do carrinho
- Calcular valor total da compra
- Limpar carrinho

### 🧾 Item de Pedido (OrderItem)
- Representa um produto dentro do carrinho
- Controla:
  - produto
  - quantidade
  - subtotal (preço × quantidade)

## Estrutura do Projeto

- **Customer**
  - Armazena dados do cliente
  - Mantém uma lista de pedidos associados

- **Product**
  - Representa um produto do sistema
  - Controla preço e estoque

- **OrderItem**
  - Representa um produto + quantidade dentro de um pedido ou carrinho

- **ShoppingCart**
  - Gerencia uma lista de `OrderItem`
  - Calcula o valor total da compra

## Conceitos de OOP Aplicados

- Encapsulamento
- Composição (ShoppingCart → OrderItem → Product)
- Validação de dados
- Uso de Collections (`ArrayList`)
- Responsabilidade bem definida por classe

## Tecnologias Utilizadas

- Java
- Collections Framework (`List`, `ArrayList`)
- Programação Orientada a Objetos

## Objetivo do Projeto

Projeto desenvolvido para **praticar a modelagem de um sistema de e-commerce**, focando em lógica de negócio, organização de classes e boas práticas de OOP.

📌 Projeto sem interface gráfica, focado em lógica e estrutura.
