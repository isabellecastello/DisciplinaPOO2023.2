package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, peso_gramas;
		
		System.out.println("peso em kg: ");
		peso= sc.nextDouble();
		
		peso_gramas = peso*1000;
		System.out.println("em gramas voce pesa: " +peso_gramas+ " gramas ");
		
		
	}

}
