package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double cont,codigo = 0, nht = 0, valor = 0 , sal_min, sal_inicial = 0, aux = 0, sal_final = 0;
			char turno, categoria;
			
			sal_min = 450;
			
			for(cont = 1 ;cont <= 10;cont++) {
				
				System.out.println("Insira o código de funcionário: ");
				codigo = sc.nextDouble();
				
				System.out.println("Insira o numero de horas trabalhadas: ");
				nht = sc.nextDouble();
				
				System.out.println("Insira o turno de trabalho: ");
				turno = sc.next().charAt(0);
				
				System.out.println("Insira a Categoria");
				categoria = sc.next().charAt(0);
				
				while(turno != 'M' && turno != 'V' && turno != 'N') {
					turno = sc.next().charAt(0);
				}
				while(categoria != 'G' && categoria != 'O') {
					categoria = sc.next().charAt(0);			
				}
				if (categoria == 'G')
						if (turno == 'N') {
						valor = sal_min * 18/100;
						}
						else {
							valor = sal_min * 15/100;
						}
				else {
					if (turno == 'N') {
						valor = sal_min * 13/100;
					}
					else {
						valor = sal_min * 10/100;
					}
					
					}
				
				sal_inicial = nht * valor;
				
				if (sal_inicial <= 300) {
					aux = sal_inicial * 20/100;
				}
				else if(sal_inicial < 600) {
					aux = sal_inicial * 15/100;
				}
				else {
					aux = sal_inicial * 5/100;
				}
				
				sal_final = sal_inicial + aux;
				
				System.out.println("Codigo de funcionario: " + codigo);
				
				System.out.println("Numero de horas trabalhadas: " + nht);
				
				System.out.println("Valor das horas trabalhadas: " + valor);
				
				System.out.println("Valor do salario inicial: " + sal_inicial);
				
				System.out.println("Valor do auxilio: " + aux );

				System.out.println("Valor do salario inicial: " + sal_final);
			}
			
			
		}

	}