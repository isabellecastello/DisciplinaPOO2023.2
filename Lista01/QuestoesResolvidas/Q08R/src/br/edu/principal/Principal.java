package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dep, taxa, rend, total;
		System.out.println("insira o valor do deposito: ");
		dep= sc.nextDouble();
		System.out.println("insira o valor da taxa de juros: ");
		taxa= sc.nextDouble();
		rend = dep * taxa/100;
		total = dep + rend;
		System.out.println("escreva o redimento: " +rend);
		System.out.println("total: " +total);


	}

}
