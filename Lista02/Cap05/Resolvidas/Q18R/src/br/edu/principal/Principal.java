package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
double	num, quad, cubo, raiz;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		
		while(num > 0) {
			
			quad = Math.pow(num, 2);
			cubo = Math.pow(num, 3);
			raiz = Math.sqrt(num);
			
			System.out.println("O quadrado do número é: " + quad);
			System.out.println("O cubo do número é: " + cubo);
			System.out.println("A raiz do número é: " + raiz + "\n");
			
			System.out.println("Digite um número: ");
			num = sc.nextDouble();
		}
		
	}



	}


