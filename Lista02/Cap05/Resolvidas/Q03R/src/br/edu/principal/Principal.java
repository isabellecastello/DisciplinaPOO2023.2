package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n, num, i, j, fat = 0,fatT;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira quantos numeros inteiros e positivos quer calcular.");
		n=sc.nextDouble();
		
		 for(i=1;i<n;i++) {
			System.out.println("Digite um numero inteiro e positivo.");
			num=sc.nextDouble();
			fat=1;
			for(j=1;j<=num;j++) {
				fat*=j;
			}
			System.out.println("O fatorial do numero é igual a " +fat);
		}

	}

}