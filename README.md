# Desafio DIO - Aprendendo na Prática o Paradigma de Orientação a Objetos (POO)

Projeto desenvolvido como parte do desafio da Digital Innovation One (DIO) para praticar os pilares da Programação Orientada a Objetos (POO) com Java.

## 📌 Objetivo
Modelar um domínio de **Bootcamp** utilizando:
- Abstração
- Encapsulamento
- Herança
- Polimorfismo

## 🧩 Domínio Modelado
O domínio é composto por:
- **Conteudo (abstrato)**: classe base para conteúdos do bootcamp
- **Curso**: herda de Conteudo e calcula XP com base na carga horária
- **Mentoria**: herda de Conteudo e calcula XP com regra própria
- **Bootcamp**: contém conteúdos e devs inscritos
- **Dev**: se inscreve em bootcamps, progride e calcula XP total

## ✅ Pilares de POO aplicados

### 🔺 Abstração
A classe `Conteudo` representa o conceito genérico de um conteúdo do bootcamp e define o contrato `calcularXp()`.

### 🔺 Encapsulamento
Os atributos são privados e acessados via getters e setters, garantindo controle e organização.

### 🔺 Herança
`Curso` e `Mentoria` estendem `Conteudo`, reaproveitando atributos e comportamentos.

### 🔺 Polimorfismo
O método `calcularXp()` é sobrescrito em `Curso` e `Mentoria`, permitindo cálculo de XP de forma específica conforme o tipo do conteúdo.

## 🛠 Tecnologias utilizadas
- Java 11
- IntelliJ IDEA
- Git e GitHub

## ▶️ Como executar
1. Clone o repositório:
   ```bash
   git clone <URL_DO_SEU_REPO>
