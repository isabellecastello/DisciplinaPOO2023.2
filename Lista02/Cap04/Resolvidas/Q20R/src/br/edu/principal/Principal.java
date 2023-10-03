package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	 Scanner dc = new Scanner(System.in);
	 double  peso_quilo,  peso_gramas, pre_total, imposto=0, valor_total, pre_grama=0 ;
	 int cod_prod, cod_pais;
	  
      System.out.println(" descreva código de um produto comprado: " );
      cod_prod = dc.nextInt();
      System.out.println(" descreva  peso do produto em quilos: " );
      peso_quilo = dc.nextDouble();
      System.out.println(" descreva código do país de origem : " );
      cod_pais = dc.nextInt();
      
      peso_gramas= peso_quilo * 1000;
      System.out.println("peso convertido em gramas:" +peso_gramas);
      
      if(cod_prod >= 1 && cod_prod <= 4) {
    	  pre_grama = 10;}
      if(cod_prod >= 5 && cod_prod <=7) {
    	  pre_grama = 25;}
      
      if(cod_prod >= 8 && cod_prod <= 10) {
    	  pre_grama = 35;}
      
      pre_total = peso_gramas * pre_grama;
      System.out.println("preço total: " +pre_total);
      
      if(cod_pais == 1) {
    	  imposto = 0;}
      if(cod_pais == 2) {
    	    imposto= pre_total * 0.15;}
    
      if(cod_pais == 3) {
    	  imposto = pre_total * 0.20;}
    	  System.out.println("imposto: " +imposto);
    	  valor_total= pre_total + imposto;
    	  System.out.println("valor final: " +valor_total);
      }
      
      
      
      

	

	}
