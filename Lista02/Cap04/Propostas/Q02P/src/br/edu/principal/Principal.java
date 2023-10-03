package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double nota_1, nota_2, media;
	        
	        System.out.println("Escreva a primeira nota:");
	        nota_1 = sc.nextDouble();
	        
	        System.out.println("Escreva a segunda nota:");
	        nota_2 = sc.nextDouble();
	        
	        media = (nota_1 + nota_2) / 2;
	        System.out.println("Sua média foi: " + media);

	        if (media >= 0 && media < 3) {
	            System.out.println("Você está reprovado.");
	        } else if (media >= 3 && media < 7) {
	            System.out.println("Você irá para o exame.");
	        } else if (media >= 7 && media <= 10) {
	            System.out.println("Você está aprovado.");
	        } else {
	            System.out.println("Média inválida. Certifique-se de que as notas estão entre 0 e 10.");
	        }
	    }


	}


