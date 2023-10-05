package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, tot_prod, tot_loja = 0, maior = 0,mes1[][]=new int[5][3],mes2[][]=new int[5][3],bim[][]=new int[5][3];
		
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Digite a venda do produto "+(i+1)+ " na loja "+(j+1)+ " no primeiro mes.");
				mes1[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Digite a venda do produto "+(i+1)+ " na loja "+(j+1)+ " no segundo mes.");
				mes2[i][j]=sc.nextInt();
			}
		}
		System.out.println("as vendas de cada produto, em cada loja, no bimestre:");
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				bim[i][j] = mes1[i][j] + mes2[i][j];
				System.out.println(bim[i][j]);
				if(i==1 && j==1) {
					maior = bim[i][j];
				}else if(bim[i][j] > maior) {
					maior = bim[i][j];
				}
			}
			
		}
		
		System.out.println("Maior venda do bimestre: "+maior);
		System.out.println("o total vendido, por loja, no bimestre:");
		for(i=0;i<3;i++) {
			tot_loja = 0;
		   for(j=0;j<5;j++) {
			tot_loja = tot_loja + bim[j][i];
		}
			System.out.println(tot_loja);
		}
		System.out.println("o total vendido de cada produto no bimestre.");
		for(i=0;i<5;i++) {
			tot_prod = 0;
			for(j=0;j<3;j++) {
				tot_prod = tot_prod + bim[i][j];
			}
			System.out.println(tot_prod);
		}
	}

		
		
		
		
	}