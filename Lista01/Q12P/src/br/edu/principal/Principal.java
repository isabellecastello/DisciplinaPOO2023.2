package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_min, sal_funcionario, qnt_salmin;
	
		System.out.println("descreva o salario minimo: ");
		sal_min = sc.nextDouble();
		System.out.println("descreva o salario do funcionario: ");
		sal_funcionario = sc.nextDouble();
		
		qnt_salmin= sal_funcionario/sal_min;
		System.out.println("a quantidade de salario minimo que ele recebe é: " +qnt_salmin +" salarios minimos");
		
	}

}
