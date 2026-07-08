# MaratonaJava

Repositório de estudos e exercícios em Java, organizado por tópicos. Contém exemplos práticos cobrindo desde conceitos básicos de orientação a objetos até tópicos mais avançados como concorrência, streams, generics, design patterns e acesso a banco de dados.

## 🎯 Objetivo

Este projeto reúne pequenos programas e testes (classes `*Test`) que demonstram, na prática, os principais recursos da linguagem Java. Cada pacote representa um tema específico, com classes de domínio (`dominio`/`domain`) e classes de teste/execução (`test`) que exercitam o conteúdo estudado.

## 🛠️ Tecnologias

- **Java 17**
- **Maven** (gerenciamento de dependências e build)
- **MySQL** (via `mysql-connector-j`) para os exemplos de JDBC/CRUD
- **Lombok** para redução de boilerplate
- **Log4j 2** para logging
- **JUnit 5 (Jupiter)** para testes
- **Docker Compose** para subir um banco MySQL local

## 📁 Estrutura do projeto

O código-fonte principal está em `src/main/java/academy/devdojo/maratonajava`, organizado nos seguintes tópicos:

| Pacote | Assunto |
|---|---|
| `Associacao` | Associação entre classes (composição/agregação) |
| `BlocoInicializacao` | Blocos de inicialização |
| `Classes` | Conceitos básicos de classes |
| `ClassesAbstratas` | Classes abstratas |
| `ClassesInternas` | Classes internas e anônimas |
| `Colecoes` | Collections Framework (List, Set, Map, Queue etc.) |
| `Comportamento` | Comportamento por parâmetro (interfaces funcionais) |
| `Concorrencia` | Threads, Executors, CompletableFuture, locks etc. |
| `Construtores` | Construtores de classes |
| `Crud` | Exemplo de CRUD com banco de dados |
| `Dates` | API de datas (LocalDate, Instant, Duration etc.) |
| `DesignPatterns` | Padrões de projeto (Singleton, Factory, Builder etc.) |
| `Enumeracoes` | Enums |
| `Exeption` | Tratamento de exceções |
| `FormatacaoDatas` | Formatação de datas, números e moedas |
| `Generics` | Generics e wildcards |
| `Heranca` | Herança |
| `Interfaces` | Interfaces |
| `Io` | Entrada e saída (I/O) com arquivos |
| `Jdbc` | Acesso a banco de dados via JDBC |
| `Junit` | Testes unitários com JUnit |
| `Lambdas` | Expressões lambda e method references |
| `Metodos` | Métodos e sobrecarga |
| `ModificadorFinal` | Modificador `final` |
| `ModificadorStatic` | Modificador `static` |
| `NIO` | Java NIO (Path, Files, atributos de arquivos) |
| `Optional` | Uso de `Optional` |
| `Polimorfismo` | Polimorfismo |
| `Regex` | Expressões regulares |
| `Resourcebundle` | Internacionalização com `ResourceBundle` |
| `Seminario` | Exercício prático de modelagem |
| `Serialization` | Serialização de objetos |
| `SobreCarga` | Sobrecarga de métodos |
| `SobreEscrita` | Sobrescrita de métodos |
| `Streams` | Streams API |
| `String` | Manipulação de Strings |
| `Threads` | Threads e sincronização |
| `Wrapper` | Classes wrapper |

Também há uma versão mais antiga dos exercícios em `academy.devdojo.exercicios`, cobrindo tópicos semelhantes (pagamentos, transações, repositórios etc.).

Arquivos de internacionalização (`messages_en_US.properties` e `messages_pt_BR.properties`) ficam na raiz de `src`.

## ✅ Pré-requisitos

- JDK 17 ou superior
- Maven 3.6+
- Docker e Docker Compose (opcional, apenas para os exemplos que usam MySQL)

## 🚀 Como executar

Clone o repositório e compile o projeto com Maven:

```bash
git clone https://github.com/Tevezx/MaratonaJava.git
cd MaratonaJava
mvn compile
```

Para rodar uma classe específica (ex.: `OlaMundo`):

```bash
mvn exec:java -Dexec.mainClass="academy.devdojo.maratonajava.OlaMundo"
```

Ou, alternativamente, compile e execute diretamente com `javac`/`java`, ou pela sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).

### Banco de dados (MySQL)

Alguns exemplos (pacotes `Jdbc` e `Crud`) precisam de um banco MySQL. Suba o container com:

```bash
docker-compose up -d
```

Isso inicia um MySQL na porta `3306` com usuário `root` e senha `root`.

## 🧪 Testes

O projeto também possui testes em `src/test`. Para executá-los:

```bash
mvn test
```

## 📚 Sobre

Projeto de estudos pessoais em Java, servindo como referência e prática dos principais conceitos da linguagem e do ecossistema Java (Collections, Streams, Concorrência, JDBC, Design Patterns, entre outros).
