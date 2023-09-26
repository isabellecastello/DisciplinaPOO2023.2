package br.esu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   double diago_maior, diago_menor, area;
	   
	   System.out.println("escreva o comprimento da diagonal maior do losango: ");
	   diago_maior = sc.nextDouble(); 
	   System.out.println("escreva o comprimento da diagonal menor do losango: ");
	   diago_menor = sc.nextDouble(); 
	   
	   area = (diago_maior * diago_menor)/2;
	   System.out.println("o valor da area do losango é: " +area);
	   
		
	   

	}

}
