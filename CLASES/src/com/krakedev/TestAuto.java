package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto(),auto2=new Auto();
		//Auto 1
		auto1.marca="Chevrolet";
		auto1.anio=2004;
		auto1.precio=17.500;
		//Auto 2
		auto2.marca="Mazda";
		auto2.anio=2010;
		auto2.precio=15.300;
		
		System.out.println("AUTO 1");
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Anio: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		
		System.out.println("-------------------------------");
		
		System.out.println("AUTO 2");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Anio: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
	}

}
