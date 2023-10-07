#    Lista de Questões do Capítulo 6

Questão | Enunciado
:--------: | :-----------:
[**17**](https://github.com/isabellecastello/DisciplinaPOO2023.2/blob/main/Lista03/Cap06/Q17R/src/br/edu/principal/Principal.java) | Faça um programa que receba seis números inteiros e mostre:os números pares digitados;a soma dos números pares digitados; os números ímpares digitados; e a quantidade de números ímpares digitados.
[**18**](https://github.com/isabellecastello/DisciplinaPOO2023.2/blob/main/Lista03/Cap06/Q18R/src/br/edu/principal/Principal.java) | Faça um programa que receba o número sorteado por um dado em vinte jogadas. Mostre os númerossorteados e a frequência com que apareceram.
[**19**](https://github.com/isabellecastello/DisciplinaPOO2023.2/blob/main/Lista03/Cap06/Q19R/src/br/edu/principal/Principal.java) | Faça um programa que preencha dois vetores, A e B, com vinte caracteres cada. A seguir, troque o 1o elemento de A com o 20o de B, o 2o de A com o 19o de B, e assim por diante, até trocar o 20o de A com o 1o de B. Mostre os vetores antes e depois da troca.
[**21**](https://github.com/isabellecastello/DisciplinaPOO2023.2/blob/main/Lista03/Cap06/Q21R/src/br/edu/principal/Principal.java) | Faça um programa que leia um conjunto de quinze valores e armazene-os em um vetor. A seguir, separe-os em dois outros vetores (P e I) com cinco posições cada. O vetor P armazena números pares e o vetor I, números ímpares. Como o tamanho dos vetores pode não ser suficiente para armazenar todos os números, deve-se sempre verificar se já estão cheios. Caso P ou I estejam cheios, deve-se mostrá-los e recomeçar o preenchimento da primeira posição. Terminado o processamento, mostre o conteúdo restante dentro dos vetores P e I.
[**22**](https://github.com/isabellecastello/DisciplinaPOO2023.2/blob/main/Lista03/Cap06/Q22R/src/br/edu/principal/Principal.java) | Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros(não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na tela:

| Dígito | Ação |
|:------:|:----:|
|1. | Efetuar depósito;
|2. | Efetuar saque;
|3. | Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes;
|4. | Finalizar o programa.


* Para efetuar depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver cadastrada, deverám aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, atualizar seu saldo;

- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a contaexistir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo que a conta não possa ficar com o saldo negativo.) Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem Saldo insuficiente e voltar ao menu;

- Para consultar o ativo bancário, deve-se somar o saldo de todas as contas do banco. Depois demostrar esse valor, voltar ao menu;

- O programa só termina quando for digitada a opção 4 — Finalizar o programa.


