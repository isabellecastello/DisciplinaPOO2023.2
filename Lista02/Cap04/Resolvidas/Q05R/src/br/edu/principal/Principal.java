package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double num1, num2, num3, num4;
		
		System.out.println("Digite tres números em ordem crescente:");
		num1 = dado.nextDouble();
		num2 = dado.nextDouble();
		num3 = dado.nextDouble();
		
		System.out.println("Digite um n�mero (fora de ordem):");
		num4 = dado.nextDouble();
		
		if (num4 > num3) {
			System.out.println("A ordem decrescente : "+num4+"-"+num3+"-"+num2+"-"+num1+"");
		} else if (num4 > num2 && num4 < num3) {
			System.out.println("A ordem decrescente :" +num3+ "-" +num4+"-"+num2+"-"+num1+"");
		} else if (num4 > num1 && num4 < num2) {
			System.out.println("A ordem decrescente : "+num3+"-"+num2+"-"+num4+"-"+num1+"");
		} else if (num4 < num1) {
			System.out.println("A ordem decrescente : "+num3+"-"+num2+"-"+num1+"-"+num4+"");
		}	

	}

}
