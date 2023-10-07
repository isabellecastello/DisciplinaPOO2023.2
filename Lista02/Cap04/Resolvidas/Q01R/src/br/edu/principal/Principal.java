package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota_trab, aval_sem, exame, media;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Digite a nota do trabalho de laborat�rio: ");
		nota_trab = dado.nextDouble();
		System.out.println("Digite a nota da avalia��o semestral:");
		aval_sem = dado.nextDouble();
		System.out.println("Digite a nota da avalia��o semestral:");
		exame = dado.nextDouble();
		
		media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
		System.out.println("M�dia ponderada: " +media);
		
		if (media >= 8 && media <= 10) {
			System.out.println("Obeteve conceito A");
		} else if (media >= 7 && media < 8) {
			System.out.println("Obteve conceito B");	
		} else if (media >= 6 && media < 7) {
			System.out.println("Obteve conceito C");
		} else if (media >= 5 && media < 6) {
			System.out.println("Obteve conceito D");
		} else {
			System.out.println("Obteve conceito E");
		}
	}



	}


