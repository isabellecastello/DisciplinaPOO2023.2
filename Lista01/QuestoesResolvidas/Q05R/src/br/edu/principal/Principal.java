package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, perc, aumento, novosal;
		System.out.println("salario: ");
		sal= sc.nextDouble();
		System.out.println("percentual: ");
		perc= sc.nextDouble();
		aumento= sal * perc/100;
		System.out.println("aumento: " +aumento);
		novosal= sal + aumento;
		System.out.println("novo salario: " +novosal);
		

	}

}
