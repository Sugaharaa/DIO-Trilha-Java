# Desafio POO - Modelagem do iPhone (DIO)

Projeto desenvolvido como parte do desafio de **Programação Orientada a Objetos** da trilha Java Básico da DIO.

O objetivo foi modelar e implementar, utilizando **interfaces e classes**, as principais funcionalidades do iPhone apresentadas no lançamento de 2007:

- Reprodutor Musical  
- Aparelho Telefônico  
- Navegador na Internet 

---

## Diagrama UML (Mermaid)

```mermaid
classDiagram
    class Iphone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +desligar()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +fecharAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +desligar()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +fecharAba()
        +atualizarPagina()
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
