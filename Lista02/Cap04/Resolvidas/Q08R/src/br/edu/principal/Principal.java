package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz, op;
		System.out.println("menu");
		System.out.println("1-somar dois numeros");
		System.out.println("2- raiz qadrada de um numero");
		System.out.println("digite sua opçao: ");
		op =sc.nextDouble();

		if (op == 1) {
		System.out.println("Digite um valor para o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite um valor para o segundo número: ");
		num2 = sc.nextDouble();
		soma= num1+num2;
		System.out.println("a soma de " +num1+ " + " +num2 +" é igual:" +soma);
		}
		if (op==2) {
		System.out.println("digite um valor: ");
		num1=  sc.nextDouble();
		raiz = Math.sqrt(num1);
		System.out.println("a raiz quadrada de " +num1+ " é igual a: " +raiz);

		}
		if(op!=1 && op !=2) {
		System.out.println("a opçao é invalida!");

		}


		}
		


	}

