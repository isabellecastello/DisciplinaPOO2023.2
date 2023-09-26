package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salreceber, imp, grat;
		System.out.println("salario: ");
		sal = sc.nextDouble();

		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		System.out.println("salario a receber: " +salreceber);

	}

}
