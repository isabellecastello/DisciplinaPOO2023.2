package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1, num2;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		num1 = dado.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = dado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior numero : " +num1);
		} else if (num1<num2) {
			System.out.println("O maior numero : " +num2);
		}else if (num1==num2) {
			System.out.println("Os numeros sao iguais.");
		}
	}

}
