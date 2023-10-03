package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num, r;

		 System.out.println("escreva um número: ");
		 num = sc.nextInt();
		 r = num%2;

		 if (r==0) {
		 System.out.println("o numero é par");
		 } else {
		 System.out.println("o numero é impar");
		 }
	}

}
