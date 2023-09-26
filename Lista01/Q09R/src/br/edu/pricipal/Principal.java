package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		System.out.println("base: ");
		base = sc.nextDouble();
		System.out.println("altura: ");
		altura = sc.nextDouble();
		area = (base * altura)/2;
		System.out.println("total da area: " +area);

	}

}
