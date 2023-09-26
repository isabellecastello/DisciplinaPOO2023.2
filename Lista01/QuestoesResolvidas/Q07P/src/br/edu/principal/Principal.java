package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, novo_peso15, novo_peso20;
		
		System.out.println("informe o peso da pessoa: ");
		peso= sc.nextDouble();
		
		novo_peso15 = peso + (peso * 15/100);
		novo_peso20 = peso - (peso * 20/100);
		
		System.out.println("novo peso se ela engordar 15% do seu peso: " +novo_peso15 +"kg");
		System.out.println("novo peso se ela emagrecer 20% do seu peso: " +novo_peso20 +"kg");
		
				
				
				
	}

}
