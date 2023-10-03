package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num[], i, soma, qtde;
		 boolean achou;
		 num= new int[6];
		 for(i = 0; i<6;i++) {
			 System.out.println("digite um numero");
			 num[i] = sc.nextInt();
			 }
		
		 soma = 0;
		 achou = false;
		 System.out.println("os numeros pares sao: ");
		 
		 
		 for(i=0;i<6;i++) {
			 if(num[i]%2==0) {
				 achou = true;
				 System.out.println("numero " +num[i]+ " na posiçao " +i);
				 soma = soma + num[i];
			 }
		 }
		 if(achou== false) {
			 System.out.println("nenhum numero par foi digitado");
		 }
		 else { System.out.println("soma dos pares = "+soma);
		 }
		 qtde= 0;
		 achou = false;
		 for(i=0;i<6;i++) {
			 if(num[i]%2!=0) {
				 achou = true;
				 System.out.println("numero " +num[i]+ " na posiçao " +i);
				 qtde = qtde + 1;
			 }
		 }
		 if(achou == false) {
			 System.out.println("nenhum numero impar foi digitado");
		 }else {
			 System.out.println("quantidade de impares = "+qtde);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}}