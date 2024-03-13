package com.krakedev;

public class Rectangulo {
	public int base,altura;
	
	public int CArea() {
		int area = base*altura;
		return area;
	}
	public double CPer() {
		double perimetro = (base*2)+(altura*2);
		return perimetro;
	}
}
