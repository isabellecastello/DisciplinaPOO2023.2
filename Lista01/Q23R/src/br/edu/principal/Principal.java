package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, f, a;
	    int i;
	    
		System.out.println("informe o numero real: ");
		num= sc.nextDouble();
		i = (int) num;
		f= num - i;
        a= Math.round(num);
        System.out.println("a parte inteira: " +i) ;
        System.out.println("a parte fracionária: " +f) ;
        System.out.println("o arredondamento: " +a) ;
        
	}

}
