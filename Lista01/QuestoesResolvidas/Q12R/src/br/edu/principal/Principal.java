package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1,num2,r1,r2;
		Scanner dado = new Scanner(System.in);
		
		do {
			System.out.println("Digite o primeiro numero maior que zero: ");
			num1 = dado.nextDouble();
			
			if (num1 <= 0) {
				System.out.println("Numero invalido,tente novamente");
				
			}
			
		} while (num1 <= 0);
		
		
		
		do {
			System.out.println("Digite o segundo numero maior que zero:");
			num2 = dado.nextDouble();
			
			if (num2 <= 0) {
				System.out.println("Numero invalido,tente novamemte.");
			}
		} while (num2 <= 0);
		
		r1 = Math.pow(num1, num2);
		r2 = Math.pow(num2, num1);
		
		
		System.out.println("O resultado de numero1 elevado ao numero2: " +r1);
		System.out.println("O resultado de numero2 elevado ao numero1: " +r2);

	}

}
