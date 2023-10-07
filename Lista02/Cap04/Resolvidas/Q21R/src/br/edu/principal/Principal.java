package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cod_est,cod_carga;
		double peso_toneladas,peso_quilos, pre_carga = 0, imposto = 0, valor_total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o c�digo do estado de origem da carga do caminh�o (1 � 5):");
		cod_est=sc.nextInt();
		if(cod_est < 1 && cod_est >5) {
			System.out.println("C�digo inv�lido.");
		}
		
		System.out.println("Insira o c�digo de carga(entre 10 e 40):");
		cod_carga=sc.nextInt();
		if(cod_carga <10 && cod_carga>40) {
			System.out.println("C�digo inv�lido.");
		}
		
		System.out.println("Insira o peso da carga do caminh�o em toneladas;");
		peso_toneladas=sc.nextDouble();
		
		peso_quilos = peso_toneladas * 1000;
		System.out.println("O peso da carga em kg: " +peso_quilos+ " kg.");
		
		if(cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
			System.out.println("O pre�o da carga do caminh�o � de " +pre_carga+ "reais.");
		} else if(cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = 250 * peso_quilos;
			System.out.println("O pre�o da carga do caminh�o � de " +pre_carga+ "reais.");
		} else if(cod_carga >= 31 && cod_carga <= 40) {
			pre_carga = 340 * peso_quilos;
			System.out.println("O pre�o da carga do caminh�o � de " +pre_carga+ "reais.");
		}
		
		if(cod_est==1) {
			imposto = 35/100 * pre_carga;
			System.out.println("O valor do imposto � de " +imposto+ " reais.");
		} else if(cod_est == 2) {
			imposto = 25/100 * pre_carga;
			System.out.println("O valor do imposto � de " +imposto+ " reais.");
		} else if(cod_est == 3) {
			imposto = 15/100 * pre_carga;
			System.out.println("O valor do imposto � de " +imposto+ " reais.");
		} else if(cod_est == 4) {
			imposto = 5/100 * pre_carga;
			System.out.println("O valor do imposto � de " +imposto+ " reais.");
		} else if(cod_est == 5) {
			imposto = 0;
			System.out.println("O valor do imposto � de " +imposto+ " reais.");
		}
		
		valor_total = pre_carga + imposto;
		System.out.println("Valor total transportado pelo caminh�o :" +valor_total+ " reais.");

	}



	}


