package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int I;
		double A,B,C;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para A:");
		A=sc.nextDouble();
		System.out.println("Digite um valor para B:");
		B=sc.nextDouble();
		System.out.println("Digite um valor para C:");
		C=sc.nextDouble();
		System.out.println("Digite um valor para I (1, 2 ou 3):");
		I=sc.nextInt();
		
		if(I==1) {
			if(A<B && A<C) {
				if(B<C) {System.out.println("A ordem crescente dos numeros: " +A+ "-" +B+ "-" +C);
				} else {System.out.println("A ordem crescente dos numeros: " +A+ "-" +C+ "-" +B);}
		      
			}
			
			else if (B<A && B<C) {
				if(A<C) {System.out.println("A ordem crescente dos n�meros: " +B+ "-" +A+ "-" +C);
				}else {System.out.println("A ordem crescente dos n�meros: " +B+ "-" +C+ "-" +A);}
			
			}
			
			else if (C<A && C<B) {
				if(A<B) { System.out.println("A ordem crescente dos n�meros: " +C+ "-" +A+ "-" +B);
				}else {System.out.println("A ordem crescente dos numeros: " +C+ "-" +B+ "-" +A);}
				
			}
		}
			
		if (I==2) {
			if(A>B && A>C) {
				if(B>C) { System.out.println("A ordem decrescente dos numeros: " +A+ "-" +B+ "-" +C);
				} else {System.out.println("A ordem decrescente dos numeros: " +A+ "-" +C+ "-" +B);}
			  
			}
			
			else if (B>A && B>C) {
				 if(A>C) {System.out.println("A ordem decrescente dos numeros: " +B+ "-" +A+ "-" +C);
				 }else {System.out.println("A ordem decrescente dos numeros: " +B+ "-" +C+ "-" +A);}
			
			}
			
			else if(C>A && C>B) {
				if(A>B) {System.out.println("A ordem decrescente dos numeros: " +C+ "-" +A+ "-" +B);
				}else {System.out.println("A ordem decrescente dos numeros: " +C+ "-" +B+ "-" +A);}
			}
		}
				
		if(I==3) {
			if(A>B && A>C) {
				System.out.println("A ordem desejada �: "+B+"-"+A+"-"+C);
			}else if (B>A && B>C) {
				System.out.println("A ordem desejada �: "+A+"-"+B+"-"+C);
			}else if(C>A && C>B) {
				System.out.println("A ordem desejada �: "+A+"-"+C+"-"+B);
			}
		}


	}

}
