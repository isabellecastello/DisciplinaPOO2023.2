package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int vet1 []= new int[5],vet2 []= new int[10], mat [] []= new int[4][3], mat_result [] []= new int[4][3], i,j,maior,menor,mult,soma,qtde;
		
		for (i=0;i <5;i++) {
			System.out.println("digite um valor para o vetor 1: ");
			vet1[i] = sc.nextInt();
		}
		for (i=0;i <10;i++) {
			System.out.println("digite um valor para o vetor 2: ");
			vet2[i] = sc.nextInt();
		}
		for(i=0;i <4;i++) {
			for(j= 0;j<3;j++) {
				System.out.println("Digite um numero inteiro para a posicao "+(i+1)+"x"+(j+1)+ " da matriz.");
				mat[i][j]=sc.nextInt();
			}
		}
		maior = vet1[i];
		for(i=0;i <5;i++) {
			if(vet1[i] >maior) {
				maior = vet1[1];
			}
		}
		menor = vet2[i];
		for (i=0;i <10;i++) {
			if(vet2[i] < menor) {
				menor = vet2[i];
			}
		}
		mult = maior * menor;
		for(i=0;i <4;i++) {
			for(j= 0;j<3;j++) {
				mat_result[i] [j] = mat [i] [j] + mult;
			}
		}
		System.out.println("matriz resultante");
		for(i=0;i <4;i++) {
			for(j= 0;j<3;j++) {
				System.out.println(mat_result[i][j] + " ");
			}
		}
		for(i=0;i <4;i++) {
			soma = 0;
			for (j= 0;j<3;j++) {
				if(mat_result[i][j]%2 == 0) {
					soma = soma + mat_result[i][j];
				}
			}System.out.println("Soma dos elementos pares da linha "+ (i+1)+ " da matriz resultante = "+soma);
		}
		
		for(j=0;j<3;j++) {
			qtde = 0;
			for(i=0;i<4;i++) {
				if(mat_result[i][j] > 1 && mat_result[i][j] < 5) {
					qtde = qtde + 1;
				}
			}
			System.out.println("Total de números entre 1 e 5 na coluna "+ (j+1)+ " da matriz resultante="+qtde);
		}

	}

	
			
			
			
		}