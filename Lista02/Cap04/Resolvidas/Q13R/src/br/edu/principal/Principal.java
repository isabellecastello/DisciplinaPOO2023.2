package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double op, sal, imp, aum, novosal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu de op��es");
		System.out.println("1.Imposto");
		System.out.println("2.Novo sal�rio");
		System.out.println("3.Classifica��o");
		
		System.out.println("Digite a op��o desejada: ");
		op=sc.nextDouble();
		
		if(op==1) {
			System.out.println("Digite o valor do salario:");
			sal=sc.nextDouble();
			if(sal<500) {
				imp=sal*5/100;
				System.out.println("O valor do imposto � " +imp);
			}else if(sal >=500 && sal<850) {
				imp=sal*10/100;
				System.out.println("O valor do imposto � " +imp);
			}else if(sal>850) {
				imp=sal*15/100;
				System.out.println("O valor do imposto � " +imp);
			}
		}
		
		if(op==2) {
			System.out.println("Digite o valor do salario:");
			sal=sc.nextDouble();
			
			if(sal>1500) {
				aum=sal+25;
				System.out.println("O valor do sal�rio agora � de R$" +aum);
			}else if(sal>=750 && sal<=1500) {
				aum=sal+50;
				System.out.println("O valor do sal�rio agora � de R$" +aum);
			}else if(sal>=450 && sal<750) {
				aum=sal+75;
				System.out.println("O valor do sal�rio agora � de R$" +aum);
			}else if(sal<450) {
				aum=sal+100;
				System.out.println("O valor do sal�rio agora � de R$" +aum);
			}
		}
		
		
		if(op==3) {
			System.out.println("Digite o valor do salario:");
			sal=sc.nextDouble();
			
		if(sal<=700) {
			System.out.println("Mal remunerado.");
		} else if(sal>700) {
			System.out.println("Bem remunerado.");
		}
		}
		
		if(op<1 || op>3) {
			System.out.println("Op��o inv�lida.");
		}
		 
	}

}
