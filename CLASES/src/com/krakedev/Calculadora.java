package com.krakedev;

public class Calculadora {
	public int suma(int val1,int val2) { //Clase o tambien llamado metodo
		int resul;
		resul = val1+val2;
		return resul;
	}
	public int restar(int val1,int val2) { //Clase o tambien llamado metodo
		int resul;
		resul = val1-val2;
		return resul;
	}
	
	public double multiplicar(double val1,double val2) { //Clase o tambien llamado metodo
		return val1*val2;
	}
	
	public double dividir(double val1,double val2) { //Clase o tambien llamado metodo
		return val1/val2;
	}
	
	public double promediar(double val1,double val2, double val3) { //Clase o tambien llamado metodo
		return (val1+val2+val3)/3;
	}
	
	public void mostrarResul() {
		System.out.println("Ahorita no joven, sali al Almuerzo. Regreso en 15");
	}
	
	
}
