
# RPG por Turnos

## Informações Gerais sobre o Projeto

Este projeto é um jogo RPG por turnos desenvolvido em Java, onde o jogador controla um herói que enfrenta uma série de inimigos em batalhas por turnos. O objetivo principal é criar um sistema simples e funcional que demonstre conceitos fundamentais de programação orientada a objetos (POO), incluindo herança, polimorfismo, interfaces, tratamento de exceções, e persistência de dados.

### Funcionalidades principais:
- Escolha entre diferentes classes de heróis (Guerreiro, Mago, Anão, Elfo), cada uma com atributos e habilidades especiais próprias.
- Sistema de combate por turnos com opções de atacar, defender, usar habilidade especial e usar poção.
- Inimigos variados (Goblin, Orc, Dragão) com atributos e ataques próprios.
- Sistema de persistência simples para salvar pontuações em arquivo texto.
- Interface de texto no console para interação com o usuário.

---

## Informações sobre as Classes e suas Relações

### Hierarquia e Herança
- A classe abstrata `Heroi` é a superclasse de todas as classes de heróis específicas (`Guerreiro`, `Mago`, `Anao`, `Elfo`), fornecendo atributos comuns como nome, vida, ataque, recurso especial, número de poções e métodos básicos.
- A classe `Inimigo` é superclasse para inimigos específicos como `Orc`, `Dragao` e `Goblin` , que herdam seus atributos e podem implementar habilidades especiais.

### Interfaces e Polimorfismo
- A interface `IAcoesDeCombate` define o contrato para as ações de combate, com os métodos:
  - `void atacar(Inimigo inimigo);`
  - `void defender();`
  - `void usarHabilidadeEspecial(Inimigo inimigo);`
  - `void usarPocao();`
- As classes de heróis implementam essa interface para garantir a consistência nas ações de combate e permitir tratamento polimórfico dos objetos.

### Associações, Agregação e Composição
- O `Heroi` possui uma associação com `Inimigo` durante as batalhas.
- O sistema de ranking utiliza agregação para armazenar pontuações.
- O uso de poções dentro do herói demonstra composição, pois o herói gerencia seu próprio inventário de poções.

---

## Como Executar o Projeto

### Pré-requisitos
- Java JDK instalado (versão 8 ou superior)
- IDE ou editor de texto para Java (ex: IntelliJ, Eclipse, VSCode)
- Linha de comando ou terminal para compilar e executar

### Passos para executar

1. Clone ou baixe o repositório do projeto.
2. Compile as classes Java:
```bash
javac *.java
```
3. Execute a classe principal:
```bash
java Principal
```
4. Siga as instruções no console para jogar.

---

## Uso do ChatGPT no Desenvolvimento

Durante o desenvolvimento deste projeto, utilizei o ChatGPT para:

- Auxiliar na estruturação do código, especialmente para definição das classes e suas relações.
- Gerar exemplos de código para classes abstratas, interfaces e implementação de polimorfismo.
- Obter sugestões de tratamento de exceções e práticas de Clean Code.
- Corrigir erros e aprimorar o design do projeto em tempo real, melhorando a organização do código.
- Criar a documentação detalhada e o arquivo README para atender aos requisitos do professor.

O ChatGPT serviu como um assistente para acelerar o processo de desenvolvimento e garantir um código mais limpo e organizado.

---

## Referências e Recursos

- Documentação oficial Java: https://docs.oracle.com/javase/8/docs/
- Curso de Programação Orientada a Objetos – Material da disciplina
- Artigos e tutoriais sobre POO, interfaces e design patterns
- ChatGPT, ferramenta de linguagem natural da OpenAI para suporte no desenvolvimento

---

**Autor:** Leandro Bosco  
**Data:** 2025

