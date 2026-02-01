
# Banco Digital (POO) — Java

Projeto desenvolvido como desafio de **Programação Orientada a Objetos (POO)** da trilha Java Básico da **DIO**.

A ideia aqui é simular um banco com **duas contas (Corrente e Poupança)**, permitindo operações básicas como:

- Depósito
- Saque
- Transferência (entre contas do mesmo banco)
- Impressão de extrato
- Listagem de contas cadastradas no banco

---

## Objetivo do desafio

Abstrair uma solução orientada a objetos no contexto bancário, aplicando os pilares:

- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

---

## Diagrama UML (Mermaid)


```mermaid
classDiagram
    class Banco {
        -String nome
        -List~Conta~ contas
        +Banco(String nome)
        +String getNome()
        +void adicionarConta(Conta conta)
        +void listarContas()
    }

    class Cliente {
        -String nome
        +Cliente(String nome)
        +String getNome()
    }

    class Conta {
        <<abstract>>
        -static final int AGENCIA_PADRAO
        -static int SEQUENCIAL
        #int agencia
        #int numero
        #double saldo
        #Cliente cliente
        +Conta(Cliente cliente)
        +void sacar(double valor)
        +void depositar(double valor)
        +void transferir(double valor, Conta contaDestino)
        +int getAgencia()
        +int getNumero()
        +double getSaldo()
        +Cliente getCliente()
        +void imprimirExtrato()
    }

    class ContaCorrente {
        +ContaCorrente(Cliente cliente)
        +void imprimirExtrato()
    }

    class ContaPoupanca {
        +ContaPoupanca(Cliente cliente)
        +void imprimirExtrato()
    }

    Banco "1" o-- "*" Conta : contém
    Conta "*" --> "1" Cliente : titular
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
