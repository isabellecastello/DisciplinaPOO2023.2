package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hr,min,c_min,total_min,total_segun;
		         
		System.out.println("escreva a hora: ");
		hr= sc.nextDouble();
		System.out.println("escreva os minutos: ");
		min= sc.nextDouble();

		c_min= hr*60;
		total_min= min + c_min;
		total_segun= total_min*60;

		//letra a
		System.out.println("a hora digitada convertida em minutos: " +c_min);

		//letra b
		System.out.println("o total dos minutos é: " +total_min+ "minutos");
		//letra c
		System.out.println("o total dos minutos convertidos em segundos é: " +total_segun+ "segundos");

	}

}
