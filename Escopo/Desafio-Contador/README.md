# Projeto Contador

Este projeto em Java implementa um contador simples que conta de um número para outro.

## Funcionalidades

- Solicita dois parâmetros ao usuário.
- Conta de um número até o outro, exibindo cada número no console.

## Como executar

Para executar este projeto, você precisará do Java instalado em sua máquina. Siga estas etapas:

1. Clone este repositório para o seu computador:

git clone https://github.com/seu-usuario/contador.git

2. Navegue até o diretório do projeto:

cd contador

3. Compile o código-fonte:

javac Contador.java

4. Execute o programa:

java Contador


5. Siga as instruções no console para inserir os parâmetros.

## Utilização do bloco try-catch

Dentro do método `main`, há um bloco `try-catch` que captura exceções do tipo `ParametrosInvalidosException`. Aqui está como funciona:

```java
try {
 // chamando o método contendo a lógica de contagem
 contar(parametroUm, parametroDois);
} catch (ParametrosInvalidosException e) {
 System.out.println("O segundo parâmetro deve ser maior que o primeiro");
 e.printStackTrace();
}

O código dentro do bloco try é executado.
Se uma exceção do tipo ParametrosInvalidosException é lançada durante a execução do método contar, o controle é transferido para o bloco catch.

A exceção é capturada e referenciada pela variável e.
Uma mensagem de erro é impressa no console.
O stack trace da exceção é impresso no console para ajudar na depuração.

Contribuindo
Se você encontrar um problema ou tiver uma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.


Esse script inclui todas as informações necessárias sobre o projeto Contador, incluindo como executá-lo, uma explicação sobre o uso do bloco try-catch e uma seção sobre contribuições.

