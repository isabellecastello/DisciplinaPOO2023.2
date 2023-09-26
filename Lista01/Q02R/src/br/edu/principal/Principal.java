 package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
	double nota1, nota2, nota3, media;
	System.out.println("nota 1: ");
	nota1= sc.nextDouble();
	System.out.println("nota 2: ");
	nota2= sc.nextDouble();
	System.out.println("nota 3: ");
	nota3= sc.nextDouble();
	media = (nota1+nota2+nota3)/3;
	System.out.println("media: " +media);
	

	}

}
