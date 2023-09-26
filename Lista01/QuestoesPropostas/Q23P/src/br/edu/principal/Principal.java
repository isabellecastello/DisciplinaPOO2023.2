package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double medi1, medi2, medi3;

		System.out.println("escreva o 1 angulo: ");
		medi1 = sc.nextDouble();
		System.out.println("escreva o 2 angulo: ");
		medi2 = sc.nextDouble();

		medi3 = 180 - (medi1+medi2);
		System.out.println("medida do terceiro angulo é: " +medi3);

	}

}
