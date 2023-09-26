package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		System.out.println("valor do slario minimo: ");
		vlr_sal = sc.nextDouble();
		System.out.println("quantidade de quilowatt:  ");
		qtd_kw = sc.nextDouble();
		vlr_kw = vlr_sal/5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15 / 100;
		vlr_desc = vlr_reais - desc;
		System.out.println("valor de quilowatt: " +vlr_kw +"reais");
		System.out.println("valor pago pela residencia: " +vlr_reais +"reais");
		System.out.println("O valor a ser pago com desconto de 15%: " +vlr_desc+ "reais");
		
		
	}

}
