package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_fixo, vlr_vendas, comissao, sal_final;
		
		System.out.println("informe o salario fixo: ");
		sal_fixo = sc.nextDouble();
		System.out.println("informe o valor de vendas: ");
		vlr_vendas = sc.nextDouble();

		comissao = sal_fixo * 4/100;
		sal_final =  sal_fixo + comissao;
		System.out.println("valor do salario final: " +sal_final);
		

	}

}
