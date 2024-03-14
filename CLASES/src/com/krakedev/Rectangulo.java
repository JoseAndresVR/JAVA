package com.krakedev;

public class Rectangulo {
	private int base,altura;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int CArea() {
		int area = base*altura;
		return area;
	}
	public double CPer() {
		double perimetro = (base*2)+(altura*2);
		return perimetro;
	}
	
	public Rectangulo(int base,int altura) {
		this.base = base;
		this.altura = altura;
	}
}
