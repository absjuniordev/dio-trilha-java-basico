# Banco DIO

Este projeto é um desafio do módulo de Sintaxe do curso de Java Básico da DIO. O objetivo é criar uma aplicação Java simples que receba dados de uma conta bancária via terminal e exiba uma mensagem formatada com essas informações.

## Autores

- Arnaldo Junior

## Descrição

O programa solicita ao usuário informações sobre uma conta bancária e exibe uma mensagem formatada com os dados fornecidos.

## Funcionalidades

- Recebe dados do usuário via terminal:
  - **Número da Conta** (Inteiro)
  - **Agência** (Texto)
  - **Nome do Cliente** (Texto)
  - **Saldo** (Decimal)

- Exibe uma mensagem formatada com os dados inseridos.

## Pilares Abordados

- **Programação Orientada a Objetos (POO)**
- **Declaração e uso de variáveis**
- **Leitura de dados do terminal**
- **Manipulação de strings e concatenação**
- **Tratamento de exceções**
- **Utilização da classe `Scanner`**

--- 

Esse formato organiza as informações de forma clara e fácil de ler.


### Como Baixar o Repositório e Usar no VS Code

#### 1. **Baixar o Repositório**

1. **Clone o Repositório**

   Se o repositório estiver hospedado no GitHub, GitLab ou outro serviço de hospedagem de código, você pode cloná-lo usando o Git. Abra o terminal e execute o seguinte comando:

   ```sh
   git clone <https://github.com/absjuniordev/dio-trilha-java-basico/tree/main/ContaBanco>
   ```
.

2. **Navegue até o Diretório do Repositório**

   Após clonar o repositório, entre no diretório do projeto:

   ```sh
   cd nome-do-repositorio
   ```

   Substitua `nome-do-repositorio` pelo nome do diretório criado pelo comando `git clone`.

#### 2. **Abrir o Projeto no VS Code**

1. **Abrir o VS Code**

   Inicie o Visual Studio Code.

2. **Abrir o Diretório do Projeto**

   No VS Code, vá para `Arquivo > Abrir Pasta...` (ou use o atalho `Ctrl+K Ctrl+O`).

   Navegue até o diretório onde você clonou o repositório e selecione-o.

   O VS Code abrirá o diretório do projeto e exibirá a estrutura de arquivos no painel lateral.

#### 3. **Configurar o Ambiente de Desenvolvimento**

1. **Instalar as Extensões Necessárias**

   Certifique-se de ter as extensões necessárias instaladas para Java. A principal extensão é o **Java Extension Pack**, que inclui várias ferramentas úteis:

   - Abra a aba de extensões (`Ctrl+Shift+X`).
   - Procure por `Java Extension Pack` e instale-o se ainda não estiver instalado.

2. **Configurar o JDK**

   Verifique se o JDK está instalado e configurado corretamente. O VS Code pode detectar automaticamente a instalação do JDK, mas você pode precisar configurar o caminho manualmente se não estiver funcionando:

   - Abra as configurações (`Ctrl+,`).
   - Procure por `java.home` e defina o caminho para o diretório onde o JDK está instalado.

#### 4. **Compilar e Executar o Código**

1. **Abrir o Terminal Integrado**

   No VS Code, abra o terminal integrado (`Ctrl+` ` ou `Terminal > Novo Terminal`).

2. **Compilar o Código**

   No terminal, compile os arquivos Java usando o comando `javac`. Por exemplo:

   ```sh
   javac ContaTerminal.java
   ```

3. **Executar o Código**

   Após a compilação, execute o programa com o comando `java`:

   ```sh
   java ContaTerminal
   ```

   Certifique-se de estar no diretório onde o arquivo `.class` foi gerado.

#### 5. **Editar e Salvar**

Você pode editar os arquivos diretamente no VS Code. O editor oferece recursos de autocompletar, realce de sintaxe e verificação de erros para facilitar o desenvolvimento.

---

Seguindo esses passos, você será capaz de baixar o repositório, configurar o ambiente e começar a trabalhar no seu projeto Java usando o VS Code.