package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
			double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;
			System.out.println("preço de fabrica: ");
			p_fab= sc.nextDouble();
			System.out.println("perc do distribuidor: ");
			perc_d= sc.nextDouble();
			System.out.println("perc de impostos: ");
			perc_i= sc.nextDouble();
			vlr_d = p_fab * perc_d / 100;
			vlr_i = p_fab * perc_i / 100;
			p_final = p_fab + vlr_d + vlr_i;
			System.out.println("valor lucro distribuidor:" +vlr_d);
			System.out.println("valor impostos:" +vlr_i);
			System.out.println("preço final do veiculo:" +p_final);
			
			
			
			

	}

}
