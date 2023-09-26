package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, qntd;
	
		 
		System.out.println("custo do espetaculo:");
		custo = sc.nextDouble();
		System.out.println("valor do convite:");
		convite = sc.nextDouble();
		qntd = custo / convite;
		System.out.println(" devem ser vendidos " +qntd+ " convites para que o custo do espetaculo seja alcançado: " );
		
		
 
	}

}
