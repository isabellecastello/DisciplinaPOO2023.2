package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vendas [][] = new int[4][5], tot_ven,tot_sem,tot_geral,i,j;
		System.out.println("Insira as vendas semanais (de um mês) de cinco vendedores de uma loja.");
		for(i=0;i <4;i++) {
			for(j= 0;j<5;j++) {
				System.out.println("Insira as vendas da semana "+(i+1)+ " do "+(j+1)+ " vendedor de uma loja.");
				vendas[i][j]= sc.nextInt();
			}
		}
		System.out.println("o total de vendas do mês de cada vendedor:");
		for(i=0;i <5;i++) {
			tot_ven = 0;
			for(j= 0;j<4;j++) {
				tot_ven = tot_ven + vendas[j][i];
			}
			System.out.println(tot_ven);
		}
		for(i=0;i <4;i++) {
			tot_sem= 0;
			for(j= 0;j<5;j++) {
				tot_sem = tot_sem + vendas[i][j];
			}
			System.out.println(tot_sem);
		}
		tot_geral = 0;
		for(i=0;i <4;i++) {
			for(j= 0;j<5;j++) {
				tot_geral = tot_geral + vendas[i][j];
			}
		}
		System.out.println(tot_geral);
		
		
		
		
	}}