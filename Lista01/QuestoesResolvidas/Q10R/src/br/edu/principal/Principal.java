package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio;
		System.out.println("raio: ");
		raio= sc.nextDouble();
		area= 3.1415 * Math.pow(raio,2);
		System.out.println("escreva a area: " +area);
		

	}

}
