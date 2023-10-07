package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a=sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b=sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c=sc.nextDouble();
		
		if(a==0) {
			System.out.println("Estes valores n�o formam uma equa��o de segundo grau");
		}
		
		delta = Math.pow(b, 2) - (4*a*c);
		
		if(delta < 0) {
			System.out.println("N�o existe raiz real");
		} else if (delta == 0) {
			x1 = (- b) / (2 * a);
			System.out.println("Existe uma raiz real igual a " +x1);
		} else if(delta > 0) {
			x1 = (- b + delta) / ( 2 * a);
			x2 = (- b - delta) / ( 2 * a);
			System.out.println("Existem duas ra�zes reais sendo a primeira igual a " +x1+ " e a segunda igual a " +x2);
		}
		

	}


	}


