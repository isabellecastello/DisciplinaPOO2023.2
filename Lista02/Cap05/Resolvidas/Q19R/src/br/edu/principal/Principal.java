package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int m, n, soma, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros e positivos.");
		m=sc.nextInt();
		n=sc.nextInt();
		
		if(m<0 || n<0) {
			System.out.println("Opção inválida.");
		}
		
		while(m < n) {
			soma=0;
			for(i=m;i<=n;i++) {
				soma = soma + i;
			}
			System.out.println("Soma:" +soma);
			System.out.println("Digite M:" );
			m=sc.nextInt();
			System.out.println("Digite N:");
			n=sc.nextInt();
		}

	}

}