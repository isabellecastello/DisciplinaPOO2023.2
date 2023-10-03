package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, idade, alt,media,media_alt=0, idade_50=0, soma_alt=0;
		
		while(true) {
			System.out.println("insira a idade: ");
			idade = sc.nextDouble();
			
			if(idade<0) {
				break;
			}
			
			System.out.println("Insira a altura:");
			alt=sc.nextDouble();
			
			if(idade>50) {
				idade_50++;
				soma_alt += alt;
			}
			if(idade_50>0) {
				media_alt= soma_alt/idade_50;
				System.out.println("Média das alturas das pessoas com mais de 50 anos: " +media_alt+" cm.");
			}
			else {System.out.println("Nenhuma pessoa com mais de 50 anos foi inserida.");
			}
		}

	}

}
