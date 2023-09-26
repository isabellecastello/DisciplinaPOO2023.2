package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso_saco, racao_gato1, racao_gato2, total_final;
		System.out.println("peso do saco: ");
		peso_saco= sc.nextDouble();
		System.out.println("raçao gato 1: ");
		racao_gato1= sc.nextDouble();
		System.out.println("raçao gato 2: ");
		racao_gato2= sc.nextDouble();
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		total_final = peso_saco - 5 *(racao_gato1 + racao_gato2);
		System.out.println("total de racao apos 5 dias: " +total_final);
	}

}
