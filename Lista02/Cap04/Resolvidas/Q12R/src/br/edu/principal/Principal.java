package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      double salario, aumento, novo_sal, cargo;
      System.out.println("Digite o cargo do funcionário (1,2,3,4 ou 5)");
      cargo = sc.nextDouble();
      System.out.println("Digite o valor do salário: ");
      salario = sc.nextDouble();
      
      if(cargo ==1) { 
    	  System.out.println("O cargo é Escriturário");
    	  aumento = salario * 50/100;
    	  System.out.println("o valor do aumento é: " +aumento);
    	  novo_sal = salario + aumento;
    	  System.out.println(" o novo salario é: " +novo_sal);
    	  
      }
      else if(cargo==2) {
    	  System.out.println("o cargo é Secretario: ");
    	  aumento = salario * 35/100;
    	  System.out.println("o valor do aumento é: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario é: " +novo_sal);
      }
      else if(cargo==3) {
    	  System.out.println("o cargo é caixa: ");
    	  aumento = salario * 20/100;
    	  System.out.println("o valor do aumento é: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario é: " +novo_sal);
      }
      else if(cargo==4) {	
    	  System.out.println("o cargo é Gerente: ");
    	  aumento = salario * 10/100;
    	  System.out.println("o valor do aumento é: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario é: " +novo_sal);
      }
      else if(cargo==5) {
    	  System.out.println("o cargo é Diretor: ");
    	  aumento = salario * 0/100;
    	  System.out.println("o valor do aumento é: " +aumento);
    	  novo_sal = salario +aumento;
    	  System.out.println("o novo salario é: " +novo_sal);
    	  
      }
      else {System.out.println("cargo inexistente! ");
      }

}   }
