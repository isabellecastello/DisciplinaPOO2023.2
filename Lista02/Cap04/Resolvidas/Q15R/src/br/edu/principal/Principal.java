package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_min, nht, ndep, nhet,sal_receber, vh, smes, vdep, vhe, imp = 0 ,sbruto, sliq, grat = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do sal�rio m�nimo:");
		sal_min=sc.nextDouble();
		System.out.println("Insira a quantidade de horas trabalhadas:");
		nht=sc.nextDouble();
		System.out.println("Insira o n�mero de dependentes do funcion�rio:");
		ndep=sc.nextDouble();
		System.out.println("Insira a quantidade de horas extras trabalhadas:");
		nhet=sc.nextDouble();
		
		vh=1/5*sal_min;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet * (vh + (vh * 50/100));
		sbruto = smes + vdep + vhe;
		
		if(sbruto < 200) {
			imp=0;
		} 
		if(sbruto >= 200 && sbruto <= 500) {
			imp=sbruto * 10/100;
		}
	    if(sbruto > 500) {
			imp = sbruto * 20/100;
		}
	    
	    sliq = sbruto - imp;
	    
	    if(sliq <= 350) {
	    	grat =100;
	    }
	    if(sliq > 350) {
	    	grat=50;
	    }
	    sal_receber = sliq + grat;
	    System.out.println("Salario a receber: " +sal_receber+ " reais.");
		}
	
	
		
		


	

	

}
