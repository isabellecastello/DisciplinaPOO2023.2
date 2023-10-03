package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cont_time, cont_jog, idade, peso, alt, qtde, media_idade, media_altura=0,porc, tot80;
        qtde = 0;
        tot80 = 0;

        for (cont_time = 1; cont_time < 5; cont_time++) {
            media_idade = 0;
            
            for (cont_jog = 1; cont_jog < 11; cont_jog++) {
            	
                System.out.println("Informe a idade: ");
                idade = sc.nextDouble(); 
				
                
                System.out.println("Informe o peso: ");
                 peso = sc.nextDouble(); 
                
                System.out.println("Informe a altura: ");
                alt = sc.nextDouble(); 
                
                if (idade < 18) {
                    qtde = qtde + 1;
                media_idade = media_idade + idade;
                media_altura = media_altura + alt;
                
                }
                if (peso > 80) {
                    tot80 = tot80 + 1;
                }
            

            media_idade = media_idade/11;
            System.out.println("A média de idade é: " + media_idade);
        }

        System.out.println("A quantidade de jogadores com menos de 18 anos é: " +qtde);
        media_altura = media_altura/55;
        System.out.println("A média de altura de todos os jogadores é: " +media_altura);

        porc = tot80 * 100/55;
        System.out.println("A porcentagem de jogadores com mais de 80 kg é: " +porc+ "%");
    }
}}

		