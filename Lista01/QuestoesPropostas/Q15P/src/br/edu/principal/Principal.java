package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, conta1, conta2, multa1, multa2, rest_sal;
		
		System.out.println("informe seu salario:  ");
		sal= sc.nextDouble();
		System.out.println("informe o valor da conta 1:  ");
		conta1= sc.nextDouble();
		System.out.println("informe o valor da conta 2:  ");
		conta2= sc.nextDouble();
		
		multa1=  conta1 + (conta1 * 2/100);
		multa2= conta2 + (conta2 * 2/100);
		rest_sal= sal- multa1 - multa2;
	    System.out.println("o resto do seu salario é: " +rest_sal+ "reais");
		
		

	}

}
