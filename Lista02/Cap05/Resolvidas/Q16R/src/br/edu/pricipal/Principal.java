package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        double base, altura, área;
	        
	        do {
	            System.out.println("Informe a base: ");
	            base = sc.nextDouble();
	        } while (base <= 0);

	        do {
	            System.out.println("Informe a altura: ");
	            altura = sc.nextDouble();
	        } while (altura <= 0);

	        área = base * altura / 2;
	        System.out.println("A área é igual a: " + área);
	    }
	}