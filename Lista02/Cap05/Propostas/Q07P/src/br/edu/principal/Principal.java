package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i,idade=0,alt,peso,qtd_idade=0,soma_alt=0,peso_40=0,media_alt=0,perc=0;
		
		for(i=1;i<=5;i++) {
		System.out.println("digite a idade da " +i+ "ª pessoa: ");
		idade= sc.nextDouble();
		
		System.out.println("digite o peso da " +i+ "ª pessoa: ");
		peso= sc.nextDouble();
		
		System.out.println("digite a altura da " +i+ "ª pessoa: ");
		alt= sc.nextDouble();
		
		if(idade>50) {
			qtd_idade+=1;
		}
		if(idade >=10 && idade<=20){
			soma_alt+=1;
		}
		if(peso<40) {
			peso_40+=1;
		}
		media_alt= soma_alt/5;
		perc=(peso_40/5)*100;
	}
		System.out.println("a quantidade de pessoas com idade superior a 50 anos:" +qtd_idade);
		System.out.println("a média das alturas das pessoas com idade entre 10 e 20 anos:" +media_alt);
		System.out.println("a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas." +perc);		

}}
