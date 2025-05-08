# Desafio POO - Modelagem iPhone

Implementação do desafio de Programação Orientada a Objetos da DIO, simulando as funcionalidades do iPhone (2007).

## Funcionalidades
- Reprodutor Musical
- Aparelho Telefônico
- Navegador Internet

## Diagrama UML
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String)
    }

    class AparelhoTelefonico {
        +ligar(String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String)
        +ligar(String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
