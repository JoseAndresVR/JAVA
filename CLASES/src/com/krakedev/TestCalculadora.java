package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora x=new Calculadora();
		int Rs,Rr;
		Rs = x.suma(5, 3);
		Rr = x.restar(5, 8);
		System.out.println(Rs);
		System.out.println(Rr);
		
		
		System.out.println("Multiplicacion: "+x.multiplicar(5, 5));
		System.out.println("Division: "+x.dividir(10, 3));
		System.out.println("Promedio de 7.50 - 8.30 - 9.90: "+x.promediar(7.50, 8.50, 9.90));
		x.mostrarResul();
		
	}

}
