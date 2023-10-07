package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cont, num1, num2, res;
		Scanner sc = new Scanner(System.in); 
			
		num1 = 0;
		num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(cont=3;cont<=8;cont++) {
			res = num1 + num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
		}

	}

}