package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conta[] = new int[10],i, j, codigo, op;;
        double saldo[] = new double[10],valor, soma;;
        boolean achou;

        
        for (i = 0; i < 10; i++) {
            achou = false;
            do {
                System.out.println("Insira o número da conta " + (i + 1) + ":");
                conta[i] = sc.nextInt();

                achou = false;
                for (j = 0; j < i; j++) {
                    if (conta[i] == conta[j]) {
                        achou = true;
                        System.out.println("Conta já cadastrada.");
                        break;
                    }
                }
            } while (achou);

            System.out.println("Digite o saldo da conta " +(i+1)+ ":");
            saldo[i] = sc.nextDouble();
        }

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar saldo total");
            System.out.println("4 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    codigo = sc.nextInt();
                    System.out.println("Digite o depósito:");
                    valor = sc.nextDouble();
                    achou = false;

                    for (i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            saldo[i] += valor;
                            achou = true;
                            System.out.println("Depósito efetuado");
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 2:
                    System.out.println("Digite o número da conta:");
                    codigo = sc.nextInt();
                    System.out.println("Digite o valor do saque:");
                    valor = sc.nextDouble();
                    achou = false;

                    for (i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            if (saldo[i] >= valor) {
                                saldo[i] -= valor;
                                achou = true;
                                System.out.println("Saque efetuado");
                            } else {
                                System.out.println("Saldo insuficiente");
                            }
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Conta não cadastrada");
                    }
                    break;

                case 3:
                    soma = 0;
                    for (i = 0; i < 10; i++) {
                        soma += saldo[i];
                    }
                    System.out.println("Saldo total: " + soma);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (op != 4);

	}

}