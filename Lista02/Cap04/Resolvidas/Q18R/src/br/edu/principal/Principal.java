package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		System.out.println("escreva  o valor de x: ");
		x = sc.nextDouble();
		System.out.println("escreva  o valor de y: ");
		y = sc.nextDouble();
		System.out.println("escreva  o valor de z: ");
		z = sc.nextDouble();
		 if(x < y + z && y < x + z && z < x + y) {
			 if (x == y && y == z) {
				 System.out.println("Triângulo Equilátero");
				 } else if(x == y || x == z || y == z) {
					 System.out.println("Triângulo Isósceles");
				 }  else if(x != y && x != z && y != z) {
					 System.out.println("Triângulo Escaleno");
				 }}
				 else { 
					 System.out.println("Essas medidas não formam um triângulo");
				 }

}}
