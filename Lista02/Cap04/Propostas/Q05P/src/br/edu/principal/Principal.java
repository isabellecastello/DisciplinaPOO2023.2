package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double numero_1, numero_2, opcao, media, produto, divisao;

        System.out.println("Escreva o primeiro numero:");
        numero_1 = sc.nextDouble();

        System.out.println("Escreva o segundo numero:");
        numero_2 = sc.nextDouble();

        System.out.println("Escreva a opção desejada (1 para média, 2 para verificar o maior, 3 para produto, 4 para divisão):");
        opcao = sc.nextDouble();

        if (opcao == 1) {
            media = (numero_1 + numero_2) / 2;
            System.out.println("A média será: " + media);
        } else if (opcao == 2) {
            if (numero_1 > numero_2) {
                System.out.println("O número 1 é maior.");
            } else {
                System.out.println("O número 2 é maior.");
            }
        } else if (opcao == 3) {
            produto = numero_1 * numero_2;
            System.out.println("Produto dessa multiplicação é: " + produto);
        } else if (opcao == 4) {
            if (numero_2 != 0) {
                divisao = numero_1 / numero_2;
                System.out.println("A divisão é: " + divisao);
            } else {
                System.out.println("Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }


	}


