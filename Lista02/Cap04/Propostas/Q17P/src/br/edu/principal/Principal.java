package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int senha; 
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        if (senha == 4531) {
            System.out.println("Acesso válido.");
        } else {
            System.out.println("Acesso inválido.");
        }
    }

	}


