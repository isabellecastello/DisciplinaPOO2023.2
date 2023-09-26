package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double num1, num2, r1, r2;
	System.out.println("numero 1: ");
	num1= sc.nextDouble();
	System.out.println("numero 2: ");
	num2= sc.nextDouble();
	r1= Math.pow(num1, num2);
	r2= Math.pow(num2, num1);
	System.out.println("1 elevado ao 2: " +r1);
	System.out.println("2 elevado ao 1: " +r2);

	}

}
