package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
	double n1, n2, n3, n4, soma;
	System.out.println("n1: ");
	n1= sc.nextDouble();
	System.out.println(" n2: ");
	n2= sc.nextDouble();
	System.out.println(" n3: ");
	n3= sc.nextDouble();
	System.out.println(" n4: ");
	n4= sc.nextDouble();
	soma= n1+n2+n3+n4;
	System.out.println("soma é igual a: " +soma);
	
	

	}

}
