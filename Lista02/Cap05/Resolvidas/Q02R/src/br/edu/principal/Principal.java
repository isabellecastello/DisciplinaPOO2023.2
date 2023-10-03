package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double e = 1.0;
	        int n;

	        System.out.println("Informe o valor de n positivo:");
	        n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            int fat = 1;
	            for (int j = 1; j <= i; j++) {
	                fat *= j;
	            }
	            e += 1.0 / fat;
	        }

	        System.out.println("O valor de E é igual a: " + e);
	    }
	}


	


	


