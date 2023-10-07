package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double preco, imp, transp = 0, seguro,fim ,total_imp = 0, origem;
		char meio_t, carga;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Preço unitario do produto:");
		preco=sc.nextDouble();
		
		while(preco>0) {
			System.out.println("Insira o país de origem(1 – Estados Unidos; 2 — México; e 3 — outros):");
			origem=sc.nextDouble();
			System.out.println("Insira o meio de transporte(T — terrestre; F — fluvial; e A— aéreo),");
			meio_t=sc.next().charAt(0);
			System.out.println("Carga perigosa (S — sim; N — não),");
			carga=sc.next().charAt(0);
			
			if(preco <= 100) {
				imp =preco * 5 / 100;
			}else {
				imp = preco * 10 / 100;
			}
			
			if(carga == 'S') {
				if(origem == 1) {
					transp = 50;
				}else if(origem == 2) {
					transp = 21;
				}else if(origem==3) {
					transp = 24;
				}
			}
			
			if(carga =='N') {
				if(origem == 1) {
					transp = 12;
				}else if(origem==2) {
					transp = 21;
				}else if(origem==3) {
					transp=60;
				}
			}
			
			if(origem == 2 || meio_t == 'A') {
				seguro = preco/2;
			}else {
				seguro=0;
			}
			
			fim = preco + imp + transp + seguro;
			total_imp = total_imp + imp;
			
			System.out.println("valor do imposto:" +imp);
			System.out.println("valor do transporte:" +transp);
			System.out.println("valor do seguro:" +seguro);
			System.out.println("preço final:" +fim);
			
			System.out.println("Preço unitario do produto:");
			preco=sc.nextDouble();
		}
		
		System.out.println("O total dos impostos." +total_imp);

	}

}