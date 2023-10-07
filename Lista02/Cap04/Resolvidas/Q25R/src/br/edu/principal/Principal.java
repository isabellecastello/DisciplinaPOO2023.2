package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double angulo; 
		int voltas;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do angulo em graus:");
		angulo = sc.nextInt();
		
		if(angulo > 360 || angulo < -360) {
			voltas= (int) (angulo/360);
			angulo= angulo%360;
		}else {
			voltas=0;
		}
		
		if(angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
			System.out.println("Est� em cima de algum dos eixos");
		}else if((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
			System.out.println("1o Quadrante");
		}else if((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
			System.out.println("2o Quadrante");
		}else if((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
			System.out.println("3o Quadrante");
		}else if((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
			System.out.println("4o Quadrante");
		}
		
		System.out.println(voltas+ " voltas no sentido " +(angulo < 0? "horario":"antihorario"));
	}



	}


