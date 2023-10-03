package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double valor_inicial, juros, valor_parc, total, valor_juros, num_parc, i;
		System.out.println( "Digite o valor inicial da dívida:"); 
		 valor_inicial = sc.nextDouble();
		System.out.println(" ----------------------------------------");


		juros = 0;
		num_parc = 1;
		total = valor_inicial;
		valor_parc = valor_inicial;
		
		System.out.println("total:" +total);
		System.out.println(" juros:" +juros);
		System.out.println("numero de parcelas: " +num_parc);
		System.out.println("valor da parcela: " +valor_parc );
		System.out.println(" ----------------------------------------");



		juros =juros + 10;
		num_parc = num_parc + 2;
		
		for( i = 1; i<= 4; i++){
		valor_juros = valor_inicial * juros / 100 ;
		total = valor_inicial + valor_juros;
		valor_parc = total / num_parc;
		System.out.println("total:" +total);
		System.out.println(" juros:" +juros);
		System.out.println("numero de parcelas: " +num_parc);
		System.out.println("valor da parcela: " +valor_parc );
		System.out.println(" ----------------------------------------");

		juros = juros + 5;
		num_parc = num_parc + 3;
		}}}