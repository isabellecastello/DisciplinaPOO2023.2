package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double nota1, nota2, nota3, peso1, peso2, peso3, media;
		System.out.println("nota 1: ");
		nota1= sc.nextDouble();
		System.out.println("nota 2: ");
		nota2= sc.nextDouble();
		System.out.println("nota 3: ");
		nota3= sc.nextDouble();
		System.out.println("peso 1: ");
		peso1= sc.nextDouble();
		System.out.println("peso 2: ");
		peso2= sc.nextDouble();
		System.out.println("peso 3: ");
		peso3= sc.nextDouble();
		media= (nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
		System.out.println("media: " +media);



	}

}
