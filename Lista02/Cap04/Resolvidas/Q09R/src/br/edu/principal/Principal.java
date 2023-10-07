package br.edu.principal;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int t,d,dia, mes, ano, hora, min;
		Scanner sc = new Scanner(System.in);
		Date I = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(I);
		
		
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH) + 1;
		ano = cal.get(Calendar.YEAR);
		System.out.print("Data Atual: " +dia+ "/" +mes+ "/" +ano+ "-");
		
		if(mes==1) {
		System.out.println("Janeiro");
	} else if(mes==2) {
		System.out.println("Fevereiro");
	} else if (mes==3) {
		System.out.println("Mar�o");
	} else if (mes==4) {
		System.out.println("Abril");
	} else if (mes==5) {
		System.out.println("Maio");
	} else if(mes==6) {
		System.out.println("Junho");
	} else if (mes==7) {
		System.out.println("Julho");
	} else if(mes==8) {
		System.out.println("Agosto");
	} else if (mes==9) {
		System.out.println("Setembro");
	} else if (mes==10) {
		System.out.println("Outubro");
	} else if(mes==11) {
		System.out.println("Novembro");
	} else {
		System.out.println("Dezembro");
	}
		
		hora = cal.get(Calendar.HOUR);
		min = cal.get(Calendar.MINUTE);
		
		System.out.println("Hora atual: " +hora+ ":" +min);
	}

}
