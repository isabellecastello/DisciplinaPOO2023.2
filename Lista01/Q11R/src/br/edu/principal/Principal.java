package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, r2, r3;
		System.out.println("numero: ");
		num= sc.nextDouble();
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("quadrado do numero: " +quad);
		System.out.println("cubo do numero: " +cubo);
		System.out.println("raiz quadrada do numero: " +r2);
		System.out.println("raiz cubica do numero: " +r3);
		
		

	}

}
