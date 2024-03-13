package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora x=new Calculadora();
		int Rsa,Rrt;
		Rsa = x.sumar(5, 3);
		Rrt = x.restar(5, 8);
		
		System.out.println(Rsa);
		System.out.println(Rrt);
		
	}

}
