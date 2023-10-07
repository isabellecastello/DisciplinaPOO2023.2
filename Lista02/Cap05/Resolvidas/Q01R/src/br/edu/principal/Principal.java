package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i, ano_atual, salario,novo_salario, percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o ano atual.");
		ano_atual=sc.nextDouble();
		
		salario=1000;
		percentual = 0.015;
		novo_salario = salario + percentual * salario;
		
		for(i=2007;i<=ano_atual;i++) {
			percentual *= 2;
			novo_salario += percentual * novo_salario;
		}
		
		System.out.println("O salário atual desse funcionário é de R$" +novo_salario);
	}

}
