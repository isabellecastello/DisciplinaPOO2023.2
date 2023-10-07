package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double i, preco, custo_est = 0, imp, preco_final, adicional,maior_p = 0, menor_p = 0, tot_imp, qtd_b, qtd_n, qtd_c;
		char refri, categ;
		Scanner sc = new Scanner(System.in);
		
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		
		for(i=1;i<=12;i++) {
			System.out.println("Digite o preço unitário do " +i+ "ª  produto");
			preco=sc.nextDouble();
			System.out.println("Digite se necessita de refrigeração ou não(S para os produtos que necessitam de refrigeração e N para os que não necessitam).");
			refri=sc.next().charAt(0);
			System.out.println("Insira a categoria do produto(A — alimentação; L — limpeza; e V —vestuário)");
			categ=sc.next().charAt(0);
			
			if(preco <= 20) {
				if(categ=='A') {
					custo_est = 2;
				}else if(categ == 'L') {
					custo_est = 3;
				} else if(categ=='V') {
					custo_est = 4;
				}
			}
			if(preco > 20 && preco <= 50) {
				if(refri=='S') {
					custo_est = 6;
				}else {
					custo_est =0;
				}
			}
			if(preco > 50) {
				if(refri=='S') {
					if(categ=='A') {
						custo_est = 5;
					}else if(categ=='L') {
						custo_est = 2;
					}else if(categ=='V') {
						custo_est = 4;
					}
				} else {
					if(categ=='A' || categ=='V') {
						custo_est = 0;
					}else if(categ=='L') {
						custo_est = 1;
					}
				}
			}
			
			if(categ!='A' && refri !='S') {
				imp = preco * 2 / 100;
			}else {
				imp = preco * 4 / 100;
			}
			
			preco_final = preco + custo_est + imp;
			System.out.println("Preço de estocagem: " +custo_est);
			System.out.println("Preço do imposto: " +imp);
			System.out.println("Preço final: " +preco_final);
			
			if(preco_final <= 20) {
				qtd_b = qtd_b + 1;
				System.out.println("Classificação barato.");
			}
			if(preco_final > 20 && preco_final <= 100) {
				qtd_n = qtd_n + 1;
				System.out.println("Classificação Normal.");
			}
			if(preco_final > 100) {
				qtd_c = qtd_c + 1;
				System.out.println("Classificação caro.");
			}
			
			adicional = adicional + custo_est + imp;
			tot_imp = tot_imp = imp;
			
			if(i==1) {
				maior_p = preco_final;
				menor_p = preco_final;
			}else {
				if(preco_final > maior_p) {
					maior_p = preco_final;
				}else if(preco_final < menor_p) {
					menor_p = preco_final;
				}
			}
		}
		
		adicional = adicional / 12;
		System.out.println("Adicionais:" +adicional);
		System.out.println("Maior preço final: " +maior_p);
		System.out.println("Menor preço final: " + menor_p);
		System.out.println("Total dos impostos: "+tot_imp);
		System.out.println("A quantidade de produtos com classificação barato:" +qtd_n);
		System.out.println("A quantidade de produtos com classificação caro:"+qtd_c);
		System.out.println("A quantidade de produtos com classificação normal:"+qtd_n);
	}

}