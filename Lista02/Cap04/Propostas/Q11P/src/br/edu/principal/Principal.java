package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double sal_atual, aumento, novo_sal;

        System.out.print("Digite o salário atual: ");
        sal_atual = sc.nextDouble();

        if (sal_atual <= 300) {
            aumento = sal_atual * 0.15 / 100;
        } else if (sal_atual > 300 && sal_atual <= 600) {
            aumento = sal_atual * 0.10 / 100;
        } else if (sal_atual > 600 && sal_atual <= 900) {
            aumento = sal_atual * 0.05 / 100;
        } else {
            aumento = 0;
        }

        novo_sal = aumento + sal_atual;
        System.out.println("O aumento foi: " + aumento);
        System.out.println("O novo salário é: " + novo_sal);
    }

	}


