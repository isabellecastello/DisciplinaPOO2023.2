package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int vet1[]=new int[8], vet2[]=new int[8], vet3[]=new int[8], i, cont1, cont2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valores do vetor 1.");
		for (i=0;i<8;i++) {
			System.out.println("Posicao "+(i+1));
			vet1[i]=sc.nextInt();
		}
		cont1 = pares(vet1, vet2);
		if(cont1==0) {
			System.out.println("NENHUM PAR FOI DIGITADO");
		}else {
			System.out.println("Valores do vetor 2.");
			for(i=0;i<cont1;i++) {
				System.out.println(vet2[i]);
			}
		}
		
		cont2 = impares(vet1, vet3);
		if(cont2==0) {
			System.out.println("NENHUM ÍMPAR FOI DIGITADO");
		}else {
			System.out.println("Valores do vetor 3.");
			for(i=0;i<cont2;i++) {
				System.out.println(vet3[i]);
			}
		}

	}
	
	public static int pares (int v1[] ,int v2[]) {
		int i, r, cont=1;
		for (i=0;i<8;i++) {
			r=v1[i]%2;
			if(r==0) {
				v2[cont]= v1[i];
				cont = cont + 1;
			}
		}
		
		return cont;
	}
	
	public static int impares (int v1[] ,int v2[]) {
		int i, r, cont=1;
		for (i=0;i<8;i++) {
			r=v1[i]%2;
			if(r!=0) {
				v2[cont]= v1[i];
				cont = cont + 1;
			}
		}
		
		return cont;
	}
	
	


	

	}



	


