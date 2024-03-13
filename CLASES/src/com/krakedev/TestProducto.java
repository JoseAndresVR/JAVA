package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto(),productoB =new Producto(),productoC=new Producto();
		//Producto A
		productoA.nombre="Paracetamol";
		productoA.descripcion="Resuelve todo";
		productoA.stockActual=110;
		productoA.precio=1.2;
		
		System.out.println("Producto A");
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Stock: "+productoA.stockActual);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("//////////////////////////////////////////////////");
		//Producto B
		productoB.nombre="Clonocepan";
		productoB.descripcion="Resuelve casi todo";
		productoB.stockActual=100;
		productoB.precio=1.0;
		
		System.out.println("Producto B");
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Stock: "+productoB.stockActual);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("//////////////////////////////////////////////////");
		
		//Producto C
		productoC.nombre="Durex";
		productoC.descripcion="Para las bendiciones";
		productoC.stockActual=5;
		productoC.precio=4.5;

		System.out.println("Producto C");
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Stock: "+productoC.stockActual);
		System.out.println("Precio: "+productoC.precio);

		

	}

}
