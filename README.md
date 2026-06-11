# 🚦 Sistema de Gestão de Infrações de Trânsito

## 📖 Descrição

O **Sistema de Gestão de Infrações de Trânsito** é uma aplicação desenvolvida em Java com o objetivo de registrar condutores, associar infrações de trânsito, calcular e validar multas de acordo com a gravidade da infração e gerar relatórios de auditoria.

O sistema simula um ambiente de fiscalização rodoviária, permitindo o cadastro de condutores, o registo de infrações e a emissão de relatórios detalhados para fins de controlo e auditoria.

---

# 🎯 Objetivos

* Cadastrar condutores.
* Associar categorias de carta de condução.
* Registrar infrações de trânsito.
* Validar valores das multas conforme a categoria da infração.
* Gerar registos de auditoria em ficheiros TXT.
* Aplicar conceitos de Programação Orientada a Objetos (POO).

---

# 🏗️ Estrutura do Projeto

```
src
│
├── App.java
│
├── auditoria
│   └── Auditoria.java
│
├── entidades
│   ├── Pessoa.java
│   ├── Condutor.java
│   └── AgenteTransito.java
│
├── enums
│   ├── CategoriaCarta.java
│   └── InfracaoCategoria.java
│
└── infracoes
    └── Infracao.java
```

---

# 📋 Funcionalidades

## Cadastro de Condutores

Permite registrar:

* Nome completo
* Contacto telefónico
* Categoria da carta de condução

### Categorias Disponíveis

* LIGEIRO
* PESADO
* PROFISSIONAL
* TRANSPORTES_PUBLICOS

---

## Registo de Infrações

O sistema permite associar várias infrações a um único condutor.

### Categorias de Infração

| Categoria   | Faixa da Multa (MT) |
| ----------- | ------------------- |
| LEVE        | 1.000 - 3.000       |
| MEDIA       | 3.001 - 7.000       |
| GRAVE       | 7.001 - 15.000      |
| MUITO_GRAVE | 15.001 - 50.000     |

Cada infração possui:

* Categoria
* Valor da multa
* Data de emissão
* Descrição

---

## Auditoria

Após o registo dos dados, o sistema gera automaticamente um ficheiro `.txt` contendo:

* Dados do condutor
* Categoria da carta
* Lista de infrações
* Valores das multas
* Datas de emissão
* Descrições

### Exemplo de saída

```txt
===== CONDUTOR =====

Nome: João Manuel
Contacto: 841234567
Categoria da carta: LIGEIRO

Infrações:

Categoria: LEVE
Multa: 2000 MT
Data: 31/05/2026 14:30:10
Descrição: Excesso de velocidade
```

O ficheiro é gravado com o seguinte padrão:

```txt
Nome_Contacto.txt
```

Exemplo:

```txt
Joao_Manuel_841234567.txt
```

---

# 🧩 Conceitos de Programação Aplicados

## Herança

Classe base:

```java
Pessoa
```

Classes derivadas:

```java
Condutor
AgenteTransito
```

---

## Polimorfismo

O método:

```java
mostrarDetalhes()
```

é sobrescrito pelas classes filhas.

---

## Encapsulamento

Todos os atributos são privados e acessados através de métodos:

```java
getters
setters
```

---

## Enumerações

O sistema utiliza enums para garantir integridade dos dados.

### CategoriaCarta

```java
LIGEIRO
PESADO
PROFISSIONAL
TRANSPORTES_PUBLICOS
```

### InfracaoCategoria

```java
LEVE
MEDIA
GRAVE
MUITO_GRAVE
```

---

# ⚙️ Requisitos

* Java JDK 17 ou superior
* IntelliJ IDEA (recomendado)
* VS Code com extensão Java (opcional)

---

# ▶️ Como Executar

## 1. Clonar o repositório

```bash
git clone https://github.com/seu-utilizador/Sistema-de-Transito.git
```

## 2. Entrar no diretório

```bash
cd Sistema-de-Transito
```

## 3. Compilar

```bash
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out App
```

## 4. Executar

```bash
java App
```

---

# 🖥️ Fluxo de Utilização

1. Informar nome do condutor.
2. Informar contacto.
3. Selecionar categoria da carta.
4. Informar quantidade de infrações.
5. Registrar cada infração:

   * Categoria
   * Valor da multa
   * Descrição
6. Visualizar os dados registados.
7. Gerar ficheiro de auditoria.

---

# 📚 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections Framework (ArrayList)
* Enum
* LocalDateTime
* FileWriter
* Scanner

---

# 🔒 Validações Implementadas

### Categoria LEVE

```java
1000 <= multa <= 3000
```

### Categoria MEDIA

```java
3001 <= multa <= 7000
```

### Categoria GRAVE

```java
7001 <= multa <= 15000
```

### Categoria MUITO_GRAVE

```java
15001 <= multa <= 50000
```

Caso o valor não esteja dentro da faixa permitida, a multa não é registada.

---

# 👨‍💻 Autor

Desenvolvido como projeto académico para demonstração dos conceitos de:

* Programação Orientada a Objetos
* Herança
* Polimorfismo
* Encapsulamento
* Manipulação de Ficheiros
* Enumerações
* Validação de Regras de Negócio

---

# 📄 Licença

Este projeto é de carácter académico e educacional, podendo ser utilizado para fins de estudo e aprendizagem.
