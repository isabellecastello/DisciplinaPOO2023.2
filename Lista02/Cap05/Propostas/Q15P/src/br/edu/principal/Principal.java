package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 char genero, respostas;
	 double qtd_s=0, qtd_n=0,gene_f_s=0, gene_m_n=0,perc=0;
	
	 
	 for(int i = 1;i<=10;i++ ) {
		 System.out.println("digite o genero " +i+ "ª entrevistado(M- masculino, F- feminino)." );
		 genero = sc.next().charAt(0);
		 System.out.println("digite a resposta " +i+ "ª entrevistado(S- sim, N-nao)." );
		 respostas = sc.next().charAt(0);
		 
		 if(respostas=='S') {
			 	qtd_s++;
		 }
		 if(respostas=='N') {
			 qtd_n++;
		 }
		 if(genero== 'F' && respostas == 'S') {
				 gene_f_s++;
	 }
		 if(genero== 'M' && respostas == 'N'){
			 gene_m_n++;
		 }
	    perc= (gene_m_n/10)*100;
	 }
	System.out.println("o número de pessoas que responderam sim:" +qtd_s);
	System.out.println("o número de pessoas que responderam não:" +qtd_n);
	System.out.println("o número de mulheres que responderam sim:" +gene_f_s);
	System.out.println("a percentagem de homens que responderam não, entre todos os homens analisados:" +perc);

	 
	 
	 
	 }}