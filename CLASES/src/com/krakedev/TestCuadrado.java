package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado c1 = new Cuadrado(5);
	    Cuadrado c2 = new Cuadrado(10);
	    Cuadrado c3 = new Cuadrado(8);

	    double area1, per1, area2, per2, area3, per3;

	   /* c1.setLado(5);
	    c2.setLado(10);
	    c3.setLado(8);*/

	    area1 = c1.CArea();
	    per1 = c1.CPer();
	    area2 = c2.CArea();
	    per2 = c2.CPer();
	    area3 = c3.CArea();
	    per3 = c3.CPer();

	    System.out.println("Area 1: " + area1);
	    System.out.println("Perimetro 1: " + per1);
	    System.out.println("Area 2: " + area2);
	    System.out.println("Perimetro 2: " + per2);
	    System.out.println("Area 3: " + area3);
	    System.out.println("Perimetro 3: " + per3);
	    System.out.println("TERMINADA LA EJECUCION");
		
		
	}

}
