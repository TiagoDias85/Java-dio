# Desafio Banco Java

Este projeto consiste em uma implementação básica de um sistema bancário em Java, onde são criadas contas correntes e contas poupança para diferentes clientes.

- Adicionei a funcionalidade de percorrer pelos objetos (clientes e contas) executados na Classe Main.java.

## Autor
Tiago Dias

## Funcionalidades

- Criar contas correntes e poupança para diferentes clientes.
- Realizar depósitos, saques e transferências entre contas.
- Imprimir extrato de cada conta, incluindo informações sobre o titular e o tipo de conta.

## Estrutura do Projeto

O projeto está organizado em várias classes Java:

- `Cliente`: Representa um cliente do banco.
- `Conta`: Classe abstrata que representa uma conta bancária genérica, com implementações específicas para contas correntes e poupança.
- `ContaCorrente`: Implementação específica de uma conta corrente.
- `ContaPoupanca`: Implementação específica de uma conta poupança.
- `Banco`: Classe que representa o banco e gerencia as contas dos clientes.
- `Main`: Classe principal que contém o método `main` para executar o programa.
- `iConta`: Classe que possuí a interface das contas Poupança e Corrente.

## Execução

Para executar o programa, basta compilar e rodar a classe `Main`. Certifique-se de ter todas as classes necessárias no mesmo pacote.

## Resultado

O programa cria contas correntes e poupança para diferentes clientes e realiza operações básicas de depósito, saque e transferência entre contas. Ao imprimir o extrato de cada conta, o tipo de conta (corrente ou poupança) é identificado para facilitar a visualização.

## Contribuindo

Se você deseja contribuir para este projeto e ajudar a melhorá-lo, sinta-se a vontade e siga estas etapas:

1. Faça um fork do projeto e clone-o localmente.
2. Crie uma branch para sua contribuição: `git checkout -b sua-contribuicao`.
3. Faça suas alterações e commit-as: `git commit -m 'Adiciona nova funcionalidade'`.
4. Envie suas alterações para o fork: `git push origin sua-contribuicao`.
5. Abra um pull request neste repositório.

Após revisão, suas alterações serão mescladas ao projeto principal. Agradeço pela sua contribuição e sugestões!

