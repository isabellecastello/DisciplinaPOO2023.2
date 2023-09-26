package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double p_fab,perc_d,perc_i,vlr_d,vlr_i,p_final;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o preço de fábrica do veículo:");
		p_fab = sc.nextDouble();
		
		System.out.println("Digite o percentual de lucro do distribuidor:");
		perc_d = sc.nextDouble();
		
		System.out.println("Digite o percentual de impostos:");
		perc_i = sc.nextDouble();
		
		vlr_d = p_fab * perc_d/100;
		vlr_i = p_fab * perc_i/100;
		p_final = p_fab + vlr_d + vlr_i;
		
		System.out.println("O lucro do distribuidor: R$" +vlr_d);
		System.out.println("O valor de imposto: R$" +vlr_i);
		System.out.println("O preço final do veiculo: R$" +p_final);
		

	}

}
