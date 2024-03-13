package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(),r2 = new Rectangulo();
		int area1,area2;
		r1.base = 10;
		r1.altura=5;
		r2.base = 8;
		r2.altura=3;
		
		area1 = r1.CArea();		
		area2 = r2.CArea();
		
		System.out.println(area1);
		System.out.println(area2);
	}

}
