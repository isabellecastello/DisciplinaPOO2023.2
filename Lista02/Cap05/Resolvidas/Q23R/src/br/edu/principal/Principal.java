package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, qtd, tipo, valor_kw, gasto, acresc = 0,total, tot_geral, qtd_cons;
		Scanner sc = new Scanner(System.in);
		
		tot_geral = 0;
		qtd_cons = 0;
		
		System.out.println("Digite o valor do salário mínimo:");
		sal=sc.nextDouble();
		System.out.println("Insira quantidade de quilowatts gasta por consumidor");
		qtd=sc.nextDouble();
		valor_kw = sal / 8;
		
		while(qtd!=0) {
			gasto = qtd * valor_kw;
			System.out.println("Insira tipo de consumidor (1 — residencial; 2 — comercial; ou 3 — industrial)");
			tipo=sc.nextDouble();
			
			if(tipo==1) {
				acresc = gasto * 5 / 100;
			}else if(tipo==2) {
				acresc = gasto * 10 / 100;
			}else if(tipo==3) {
				acresc = gasto * 15 / 100;
			}
			
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			
			if(total >= 500 && total <= 1000) {
				qtd_cons = qtd_cons + 1;
			}
			
			System.out.println("Gasto:" +gasto);
			System.out.println("Acrescimo:" +acresc);
			System.out.println("Total: " +total);
			System.out.println("Insira quantidade de quilowatts gasta por consumidor");
			qtd=sc.nextDouble();
		}
		
		System.out.println("Total geral: " + tot_geral);
        System.out.println("Quantidade de consumidores com gasto entre 500 e 1000: " + qtd_cons);

	}

}