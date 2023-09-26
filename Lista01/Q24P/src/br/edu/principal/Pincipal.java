package br.edu.principal;

import java.util.Scanner;

public class Pincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double real, dolar, marco, libra;

		System.out.println("escreva a quantidade de dinheiro que voce irprecisar em real: ");
		real= sc.nextDouble();

		dolar= real/1.80;
		marco= real/2.0;
		libra= real/3.57;

		System.out.println("seu dinheiro em dolar será: " +dolar+ " dolares ");
		System.out.println("seu dinheiro em marco será: " +marco+ " marcos ");
		System.out.println("seu dinheiro em libra será: " +libra+ " libra ");

	}

}
