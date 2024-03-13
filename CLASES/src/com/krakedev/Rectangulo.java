package com.krakedev;

public class Rectangulo {
	public int base,altura;
	
	public int CArea() {
		int area = base*altura;
		return area;
	}
	public int CPer() {
		int perimetro = (base*2)+(altura*2);
		return perimetro;
	}
}
