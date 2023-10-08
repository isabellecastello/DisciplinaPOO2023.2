package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal_min, nht, coeficiente = 0, sal_bruto = 0,imposto = 0, grat, auxilio, sal_liq;
		char turno, categoria;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do sal�rio m�nimo: ");
		sal_min=sc.nextDouble();
		
		System.out.println("Insira o turno do trabalho(M � matutino,V � vespertino ou N � noturno):");
		turno = sc.next().charAt(0);
		System.out.println("Insira a categoria (O � oper�rio; G � gerente):");
		categoria= sc.next().charAt(0);
		System.out.println("Insira o n�mero de horas trabalhadas no m�s:");
		nht=sc.nextDouble();
		
		if(turno ==  'M') {
			coeficiente = 10.0/100 * sal_min;
		} else if(turno == 'V') {
			coeficiente = 15.0/100 * sal_min;
		} else if(turno == 'N'){
			coeficiente = 12.0/100 * sal_min;
		}else {
			System.out.println("Turno Inv�lido.");
		}
		
		sal_bruto = nht * coeficiente;
		
		if(categoria == 'O') {
			if(sal_bruto >= 300) {
				imposto = 5.0/100 * sal_bruto;
			} else {
				imposto = 3.0/100 * sal_bruto;
			}
		} else if (categoria == 'G') {
			if(sal_bruto >= 400) {
				imposto = 6.0/100 * sal_bruto;
			} else {
				imposto = 4.0/100 * sal_bruto;
			}
		} else {
			System.out.println("Categoria Inv�lida.");
		}
		
	
		if(turno == 'N' && nht > 80) {
			grat = 50;
		}else {
			grat=30;
		}
		
		
		if(categoria =='O' || coeficiente <= 25) {
			auxilio = (1.0/3.0) * sal_bruto;
		}else {
			auxilio = (1.0/2.0) * sal_bruto;
		}
		
		sal_liq = sal_bruto - imposto + grat + auxilio;
		
		System.out.println("Valor do coeficiente: " + coeficiente);
        System.out.println("Valor do sal�rio bruto: " + sal_bruto + " reais");
        System.out.println("O valor do imposto � de " + imposto + " reais.");
        System.out.println("O valor da gratifica��o � de " + grat + " reais.");
		System.out.println("O valor do aux�lio � de " +auxilio+ " reais.");
		System.out.println("O valor do sal�rio liqu�do � de " +sal_liq+ " reais.");
		
		if(sal_liq < 350) {
			System.out.println("Mal remunerado.");
		} else if(sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal.");
		} else{
			System.out.println("Bem remunerado.");
		}
	



	}

}
