package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 double cod, num_h, sal_b, sal_l=0, media_m=0, media_f=0,
	 cont_m, cont_f;
	 char sexo;
	 
	 System.out.println("Digite o código: ");
	 		cod = sc.nextDouble();
	 		
	  cont_m = 0;
	  cont_f = 0;
	  
	  while (cod != 99999){ 
	  System.out.println("Digite o Sexo: ");
	 			sexo = sc.next().charAt(0);
	 			
	 			System.out.println("Digite o numero de horas trabalhadas: ");
	 			num_h = sc.nextDouble();
	 			sal_b = num_h * 30;

	 if (sexo == 'M'){
	   
	 sal_l = sal_b - (sal_b * 10 / 100);
	 media_m = media_m + sal_l;
	 cont_m = cont_m + 1;
	 }
	 if (sexo == 'F'){

	 sal_l = sal_b - (sal_b * 5 / 100);
	 media_f = media_f + sal_l;
	 cont_f = cont_f + 1;
	 }
	  
	 System.out.println("Codigo de Professor: " + cod);
	 			System.out.println("Valor do salário bruto: " + sal_b);
	 			System.out.println("Valor do salário líquido: " + sal_l);
	 			
	 			System.out.println("Digite o código: ");
	 			cod = sc.nextDouble();
	 
	 if( cont_m == 0){

	 System.out.println( "Nenhum professor do sexo masculino");}
	 else {
	 media_m = media_m/cont_m;
	 System.out.println("media de professores masculinos é: " +media_m);
	 }
	 if( cont_f == 0)
	 System.out.println( "Nenhum professor do sexo feminino");
	 else {
	 media_f = media_f / cont_f;
	 System.out.println("media de professoras femininas é: " +media_f);
	 
	 
	 }}}}