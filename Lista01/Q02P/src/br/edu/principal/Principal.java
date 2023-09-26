package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, numero3, multi;
		System.out.println("escreva o 1 numero: ");
		numero1= sc.nextInt();
		System.out.println("escreva o 2 numero: ");
		numero2= sc.nextInt();
		System.out.println("escreva o 3 numero: ");
		numero3= sc.nextInt();
		
		multi = numero1 * numero2 * numero3;
		System.out.println("a multiplicaçao dos 3 numeros é: " +multi);

	}

}
