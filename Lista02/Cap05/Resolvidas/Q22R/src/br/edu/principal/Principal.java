package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade, tot_f, tot_m, soma1, cont_m1, cont_m2, tot,
		cont_f1, media_idade, perc=0, menor_idade=0;
		char sexo, exp;
		tot = 0;
		tot_f = 0;
		tot_m = 0 ;
		soma1 = 0 ;
		cont_m1 = 0;
		cont_m2 = 0;
		cont_f1 = 0;
		
		System.out.println("informe a idade do candidato: ");
		idade = sc.nextDouble();
			while (idade != 0){ 
		System.out.println("Digite o sexo do candidato: ");
					sexo = sc.next().charAt(0);
					
					System.out.println("Digite se o candidato possui experiencia : ");
					exp = sc.next().charAt(0);

		if(sexo == 'F' && exp == 'S'){

		  if( tot == 0){
           menor_idade =idade;
		   tot = 1;
		 }
		 else if( idade < menor_idade){
		  menor_idade = idade;
		}
		if( sexo == 'M'){
		tot_m = tot_m + 1;
		}
		if( sexo == 'F'){
		tot_f = tot_f + 1;
		}
		if( sexo == 'F' && idade < 21 && exp == 'S'){
		 cont_f1 = cont_f1 + 1;}
		if( sexo == 'M' && idade > 45){
		cont_m1 = cont_m1 + 1;}
		if(sexo == 'M' && exp == 'S'){

		soma1 = soma1 + idade;
		cont_m2 = cont_m2 + 1;
		}
		System.out.println("Digite a idade do candidato: ");
					idade = sc.nextDouble();
				}
				System.out.println("Numero total de candidatos masculinos: " + tot_m);
				System.out.println("Numero total de candidatos femininos: " + tot_f);
				

		if( cont_m2 == 0){
		System.out.println( "Nenhum homem com experiência");}
		else{
		media_idade = soma1 / cont_m2;
		 System.out.println("Media de idade" + media_idade);
				}
			

		if( tot_m == 0){
		System.out.println( "Nenhum homem");}
		 else{
		perc = cont_m1 * 100 / tot_m;
		System.out.println("O percentual de candidatos homens é de: " + perc); 
				}
						
				System.out.println("O número de mulheres com idade inferior a 21 anos e com experiência no serviço: " + cont_f1);
				System.out.println("A menor idade entre as mulheres que já têm experiência no serviço: " + menor_idade);
			}

		} }
	