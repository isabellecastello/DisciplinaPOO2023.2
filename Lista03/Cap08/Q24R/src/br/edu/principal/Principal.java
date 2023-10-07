package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, res;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros.");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		System.out.println("Digite a operaçao desejada.");
		op=sc.next().charAt(0);
		
		if(op!='+' || op!='*') {
			System.out.println("Operacao invalida.");
		}
		
		res = calculo(num1, num2, op);
		System.out.println("Resultado=" +res);

	}
	
	public static double calculo(double n1,double n2,char simbolo) {
		double result;
		
		if(simbolo == '+') {
			result=n1+n2;
		}else{
			result=n1 * n2;
		}
		
		return result;
	}

}
	


