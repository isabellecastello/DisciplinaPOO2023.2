package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		System.out.println("angulo: ");
		ang= sc.nextDouble();
		System.out.println("altura da parede: ");
		alt= sc.nextDouble();
		radiano = ang * 3.14 / 180;
		escada =alt / Math.sin(radiano);
		System.out.println(" medida da escada: " +escada);
	}

}
