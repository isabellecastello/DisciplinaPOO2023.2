package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a_degrau, a_usuario, qtd_degraus;
		System.out.println("altura do degrau: ");
		a_degrau= sc.nextDouble();
		System.out.println("altura que usuario deseja alcancar: ");
		a_usuario= sc.nextDouble();
		qtd_degraus = a_usuario / a_degrau;
		System.out.println("quantidade de degraus: " +qtd_degraus);
	}

}
