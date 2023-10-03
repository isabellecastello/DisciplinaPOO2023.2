package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux, vet1[]= new String[20],vet2[] = new String[20];
		int i, j;
		
		for(i =0;i<20; i++) {
		 System.out.println("insira os caracteres do vetor 1: ");
		 vet1[i]=sc.next();
		}
		for(i =0;i<20; i++) {
			 System.out.println("insira os caracteres do vetor 2: ");
			 vet2[i]=sc.next();
			}
		System.out.println("Vetor 1 antes da troca");
		for(i =0;i<20; i++) {
			 System.out.println(vet1[1] + " ");
		}
		System.out.println("Vetor 2 antes da troca ");
		for(i=0;i<20;i++) {
			System.out.print(vet2[i]+" ");
		}
		j = 20;
		for(i =0;i<20; i++) {
			aux = vet1[1];
			vet1[1] = vet2[j];
			vet2[j] = aux;
			j = j - 1;
		}
		System.out.println("Vetor 1 depois da troca");
		for(i=0;i<20;i++) {
			System.out.print(vet1[i]+ " ");
		}
		System.out.println("Vetor 2 depois da troca");
		for(i=0;i<20;i++) {
			System.out.print(vet2[i]+" ");
		}
			 
		
	
	
	
	
	
	
	
	}}