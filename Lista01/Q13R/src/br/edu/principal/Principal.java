package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double pes, polegadas, jardas, milhas;
		System.out.println("pes: ");
		pes= sc.nextDouble();
		polegadas= pes * 12;
		jardas= pes /3;
		milhas= jardas /1760;
		System.out.println("polegadas: " +polegadas);
		System.out.println("jardas: " +jardas);
		System.out.println("milhas: " +milhas);
		
		
		
		

	}

}
