package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y , z;
		System.out.println("valor do tamanho da escada: ");
		z = sc.nextDouble();
		System.out.println("alura que deseja pendurar o quadro:  ");
		x = sc.nextDouble();
		if(x>z) {
			System.out.println("a escada deve ser maior. ");
		}
		
		else {
		y = Math.pow(z, 2) - Math.pow(x, 2);
		
		y = Math.sqrt(y);
		
		System.out.println("Distância em que deverá ficar a escada: " +y+ "metros");
		
		}
		
	}

}
