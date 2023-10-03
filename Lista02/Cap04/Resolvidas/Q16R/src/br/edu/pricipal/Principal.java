package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre, venda, novo_pre=0;
		 System.out.println("digite o valor do preço atual: ");
		 pre = sc.nextDouble();
		 System.out.println("escreva a venda media: ");
		 venda = sc.nextDouble();
		 if (venda<500 || pre<30) {
			 novo_pre= pre+ (0.10 * pre);
			 System.out.println("novo preço do produto é: "+novo_pre);
		 } else if(venda>=500 && venda<1200 || pre>=30 && pre<80){
			 novo_pre= pre+(0.15 * pre);
			 System.out.println("novo preço do produto é: "+novo_pre);
		 }else if(venda>=1200 || pre>=80) {
			 novo_pre= pre-(0.20 * pre);
			 System.out.println("novo preço do produto é: "+novo_pre);
		 }
		
		 

	}

}
