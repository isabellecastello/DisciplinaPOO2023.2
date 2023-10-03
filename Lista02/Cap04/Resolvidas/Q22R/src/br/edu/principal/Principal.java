package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double salbase, tempo, imposto, grat, salliq;
		 System.out.println("declare o salario base:");
		 salbase = sc.nextDouble();
		 System.out.println("declare o o tempo de serviço do funcionario:");
		 tempo = sc.nextDouble();
		 
		 if(salbase < 200){
			 imposto = 0;}
		 else if(salbase <= 450) {
			 imposto = 0.03/100 * salbase;}
		 else if(salbase < 700) {
			 imposto = 0.08/100 * salbase;}
			 
		 
		 else{imposto = 0.12/100 * salbase;
		 }
		 
		 System.out.println("o valor do imposto é: " +imposto);
	   if(salbase > 500) {
		if(tempo <= 3) {
			grat = 20;
		}else {
			grat = 30;
		}
	}
	   else { 
		   if(tempo <= 3) {
			   grat = 23;}
		   else if(tempo < 6) {
				   grat = 35;  }
		   else {
		   grat = 33;}
	   }
	 System.out.println("gratificaçao: " +grat );
	 salliq= salbase - imposto + grat;
	 System.out.println("salario liquido: " +salliq);
	 if(salliq <= 350) {
		 System.out.println("Classificação A");
	 }
	 else if(salliq < 600) {
		 System.out.println("Classificação B");
	 }
	 else {
		 System.out.println("Classificação c");
	 }
	
	
	}}
