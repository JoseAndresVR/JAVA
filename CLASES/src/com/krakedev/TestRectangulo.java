package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
	    Rectangulo r1 = new Rectangulo();
	    Rectangulo r2 = new Rectangulo();

	    int area1, area2;
	    double per1, per2;

	    r1.setBase(10);
	    r1.setAltura(5);
	    r2.setBase(8);
	    r2.setAltura(3);

	    area1 = r1.CArea();
	    area2 = r2.CArea();
	    per1 = r1.CPer();
	    per2 = r2.CPer();

	    System.out.println("Area 1: " + area1);
	    System.out.println("Area 2: " + area2);
	    System.out.println("Perimetro 1: " + per1);
	    System.out.println("Perimetro 2: " + per2);
	}


}
