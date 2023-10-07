package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double precoantigo, precoatual, acrescimo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o antigo preco.");
		precoantigo=sc.nextDouble();
		System.out.println("Insira o atual preco.");
		precoatual=sc.nextDouble();
		
		acrescimo = calculo_reajuste(precoantigo, precoatual);
		System.out.println("Percentual de acréscimo entre esses valores:" +acrescimo);

	}
	
	public static double calculo_reajuste(double PA,double PN) {
		double result;
		result = (100 * PN - 100 * PA) / PA;
		return result;
	}

}