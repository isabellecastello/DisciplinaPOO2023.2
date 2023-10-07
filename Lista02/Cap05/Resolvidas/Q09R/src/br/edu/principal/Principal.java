package br.edu.principal;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cont, n1, n2, media, ta = 0, te = 0, tr = 0,media_classe, total_classe;
		Scanner sc = new Scanner(System.in);
		
		total_classe = 0;
		for(cont=1;cont<=6;cont++) {
			System.out.println("Digite a primeira nota:");
			n1=sc.nextDouble();
			System.out.println("Digite a segunda nota:");
			n2=sc.nextDouble();
			media = (n1 + n2) /2;
			System.out.println("Media: " +media);
			
			if(media <= 3) {
				tr = tr + 1;
				System.out.println("Reprovado.");
			}if(media >3 && media < 7) {
				te = te + 1;
				System.out.println("Exame.");
			}if(media >= 7) {
				ta = ta + 1;
				System.out.println("Aprovado.");
			}
			
			total_classe = total_classe + media;
		}
		
		System.out.println("Total de alunos aprovados: " +ta);
		System.out.println("Total de alunos que farão exame: " +te);
		System.out.println("Total de alunos reprovados: " +tr);
		
		media_classe = total_classe/6;
		System.out.println("Media da classe: " +media_classe);

	}

}