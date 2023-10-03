package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_bruto, vlr_receber, gratificacao, imposto;

        System.out.print("Digite o salário bruto: ");
        sal_bruto = sc.nextDouble();

        if (sal_bruto <= 350) {
            gratificacao = 100;
        } else if (sal_bruto > 350 && sal_bruto <= 600) {
            gratificacao = 75;
        } else if (sal_bruto > 600 && sal_bruto <= 900) {
            gratificacao = 50;
        } else {
            gratificacao = 35;
        }

        imposto = sal_bruto * 0.07 / 100;

        vlr_receber = sal_bruto + gratificacao - imposto;
        System.out.println("O salario a receber é: " + vlr_receber);
    }
}
