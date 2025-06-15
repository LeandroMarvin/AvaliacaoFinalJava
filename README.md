# RPG por Turnos - Projeto Java

## Informações Gerais sobre o Projeto

Este projeto é um jogo de RPG por turnos desenvolvido em Java, com foco em programação orientada a objetos. O objetivo é oferecer uma experiência básica de combate por turnos entre um herói e inimigos, incluindo escolha de classes, uso de habilidades especiais, poções e estratégias de defesa.

Funcionalidades principais:
- Escolha do nome e da classe do herói (Guerreiro, Mago, Anão, Elfo).
- Sistema de combate por turnos contra inimigos variados (Goblin, Orc, Dragão).
- Implementação de habilidades especiais, uso de poções e defesa.
- Registro de pontuação em arquivo de texto (ranking.txt).
- Menu interativo para seleção de ações durante a batalha.

## Informações sobre as Classes e suas Relações

- **Heroi (abstract class)**: Classe base para os heróis, com atributos comuns como nome, vida, ataque, recurso, número de poções e método abstrato para habilidade especial e defesa. Utiliza encapsulamento com atributos privados e getters/setters.

- **Guerreiro, Mago, Anao, Elfo (classes concretas)**: Estendem `Heroi`, implementando habilidades e características específicas.

- **Inimigo (classe base)**: Representa inimigos no jogo, com atributos de nome, vida, ataque e chance de ataque crítico. Subclasses `Orc` e `Dragao` estendem `Inimigo` com atributos e comportamentos específicos.

- **IAcoesDeCombate (interface)**: Define métodos para ações de combate que `Heroi` deve implementar, promovendo polimorfismo.

- **RankingManager (classe utilitária)**: Gerencia a persistência do ranking de jogadores em arquivo texto.

- **MostrarDescricao (classe utilitária)**: Fornece descrições para as classes de heróis, modularizando a apresentação.

**Relações entre as classes:**
- Herança: `Guerreiro`, `Mago`, `Anao`, `Elfo` herdam de `Heroi`; `Orc`, `Dragao` herdam de `Inimigo`.
- Implementação de interface: `Heroi` implementa `IAcoesDeCombate`.
- Associação: `Principal` associa herói e inimigo durante o jogo.
- Composição/Agregação: `Principal` utiliza instâncias de `Heroi`, `Inimigo` e classes utilitárias.

## Como Executar o Projeto

1. **Pré-requisitos:** Java JDK instalado (versão 8 ou superior).

2. **Compilar:**
   - Compile todas as classes do projeto. Exemplo:
     ```
     javac *.java
     ```

3. **Executar:**
   - Execute a classe principal:
     ```
     java Principal
     ```

4. **Funcionamento:**
   - Siga as instruções do console para criar seu herói, escolher a classe e iniciar a batalha contra inimigos.
   - Ao final, seu resultado será salvo no arquivo `ranking.txt` criado no diretório do programa.

## Uso do ChatGPT

Durante o desenvolvimento, o ChatGPT foi utilizado para auxiliar na estruturação inicial do código, sugestões para organização modular, implementação de conceitos avançados como herança, polimorfismo, interfaces e tratamento de exceções. O suporte ajudou a acelerar o processo e garantir boas práticas, mas o desenvolvimento e as decisões finais foram realizadas pelo desenvolvedor.

## Referências e Recursos

- Documentação oficial Java: https://docs.oracle.com/javase/8/docs/
- Conceitos de POO e Design Patterns
- Tutoriais e exemplos de RPG por turnos disponíveis online
- ChatGPT (OpenAI) para auxílio na programação

