package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double altura, peso;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura em cm:");
		altura=sc.nextDouble();
		System.out.println("Digite seu peso em kg:");
		peso=sc.nextDouble();
		
		if(altura < 120) {
			if(peso<=60) {
				System.out.println("classifica��o A.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classifica��o D.");
			} else if(peso>90) {
				System.out.println("classifica��o G.");
			}
		} else if (altura >=120 && altura <=170) {
			if(peso<=60) {
				System.out.println("classifica��o B.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classifica��o E.");
			} else if(peso>90) {
				System.out.println("classifica��o H.");
			}
		} else if (altura > 170) {
			if(peso<=60) {
				System.out.println("classifica��o C.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classifica��o F.");
			} else if(peso>90) {
				System.out.println("classifica��o I.");
			}
		}
	



	}

}
