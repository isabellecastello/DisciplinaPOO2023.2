package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
double op = 0, sal, imp = 0, aum = 0, novo_sal;
	
		
		while(op < 4) {
			System.out.println("---- Menu de opções ----");
			System.out.println("------- 1.Imposto ------");
			System.out.println("---- 2.Novo salário ----");
			System.out.println("---- 3.Classificação ---");
			System.out.println("-4.Finalizar o programa-" + "\n");
			
			System.out.println("Digite a opção desejada.");
			op = sc.nextDouble();
			
			if(op > 4 || op < 1 ) {
				System.out.println("Opção inválida!");
			}
			if (op == 1) {
				System.out.println("Digite o salário:");
				sal = sc.nextDouble();
				
				if( sal < 500) {
				imp = sal * 5/100;
				}
				if (sal >= 500 && sal <= 850) {
				imp = sal * 10/100;
				}
				
				if( sal > 850) {
				imp = sal * 15/100;
				}
				System.out.println("Imposto: " + imp);
			}
			
			if(op == 2) {
				System.out.println("Digite o salário:");
				sal = sc.nextDouble();
					if(sal > 1500) {
						aum = 25;
					}
					if( sal >= 750 && sal <= 1500) {
						aum = 50;
					}
					if( sal >= 450 && sal < 750) {
						aum = 75;
					}
					if( sal < 450) {
						aum = 100;
					}
					novo_sal = sal + aum;
					System.out.println("Novo salário: " + novo_sal);
			}
			
			if( op == 3) {
				System.out.println("Digite o salário:");
				sal = sc.nextDouble();
					if (sal <= 700) {
						System.out.println("Mal Remunerado");
					}
					else {
						 System.out.println("Bem Remunerado"); 
					}
			}
			if(op == 4) {
				break;
			}
			
		}
		
		
	}

}
		