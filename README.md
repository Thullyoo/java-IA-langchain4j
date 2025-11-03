 
# Java IA com LangChain4j

## 📖 Descrição

Este projeto é uma implementação em **Java** que integra **Inteligência Artificial (IA)** utilizando a biblioteca **LangChain4j**. O LangChain4j é uma framework poderosa para construir aplicações de IA em Java, permitindo a integração fácil com modelos de linguagem como o GPT, embeddings vetoriais, chains de processamento e ferramentas de RAG (Retrieval-Augmented Generation).

O foco principal é demonstrar conceitos básicos de IA em aplicações Java, como:
- Geração de texto com LLMs (Large Language Models).
- Manipulação de chains e prompts personalizados.
- Integração com provedores de IA (ex: Gemini, OpenAI, Hugging Face).
- Exemplos práticos de chatbots ou assistentes inteligentes.

Este repositório serve como um ponto de partida para desenvolvedores Java que desejam explorar IA de forma simples e escalável.

## 🚀 Tecnologias Utilizadas

- **Linguagem**: Java 17+ (recomendado)
- **Framework de IA**: LangChain4j (versão mais recente)
- **Build Tool**: Maven (ou Gradle, dependendo da configuração)
- **Dependências Principais**:
  - `<dependency>
            <groupId>dev.langchain4j</groupId>
            <artifactId>langchain4j-spring-boot-starter</artifactId>
            <version>1.8.0-beta15</version>
        </dependency>
    `
  - ` <dependency>
            <groupId>dev.langchain4j</groupId>
            <artifactId>langchain4j-google-ai-gemini</artifactId>
            <version>1.8.0</version>
        </dependency>
    `
  - `<dependency>
            <groupId>dev.langchain4j</groupId>
            <artifactId>langchain4j</artifactId>
            <version>1.8.0</version>
        </dependency>
    `
    
## 📦 Pré-requisitos

- JDK 17 ou superior instalado.
- Conta em um provedor de IA (ex: Genmini, OpenAI API key).
- Maven 3.6+ ou IDE compatível (IntelliJ, Eclipse).
