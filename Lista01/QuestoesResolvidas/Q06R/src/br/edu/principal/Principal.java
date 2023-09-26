package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,grat,imp,salreceber;
		Scanner dado = new Scanner (System.in);
		
		System.out.println("Digite o salario base: ");
		sal = dado.nextDouble();
		
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		
		System.out.println("O salario a receber é R$ " +salreceber);

	}

}
