package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
	    Producto productoA = new Producto("Paracetamol","Resuelve todo",110,1.2);
	    Producto productoB = new Producto("Clonocepan","Resuelve casi todo",100,1.0);
	    Producto productoC = new Producto("Durex","Para las bendiciones",5,4.5);

	    // Producto A
	   /* productoA.setNombre("Paracetamol");
	    productoA.setDescripcion("Resuelve todo");
	    productoA.setStockActual(110);
	    productoA.setPrecio(1.2);*/

	    System.out.println("Producto A");
	    System.out.println("Nombre: " + productoA.getNombre());
	    System.out.println("Descripción: " + productoA.getDescripcion());
	    System.out.println("Stock: " + productoA.getStockActual());
	    System.out.println("Precio: " + productoA.getPrecio());
	    System.out.println("//////////////////////////////////////////////////");

	    // Producto B
	   /* productoB.setNombre("Clonocepan");
	    productoB.setDescripcion("Resuelve casi todo");
	    productoB.setStockActual(100);
	    productoB.setPrecio(1.0);*/

	    System.out.println("Producto B");
	    System.out.println("Nombre: " + productoB.getNombre());
	    System.out.println("Descripción: " + productoB.getDescripcion());
	    System.out.println("Stock: " + productoB.getStockActual());
	    System.out.println("Precio: " + productoB.getPrecio());
	    System.out.println("//////////////////////////////////////////////////");

	    // Producto C
	   /* productoC.setNombre("Durex");
	    productoC.setDescripcion("Para las bendiciones");
	    productoC.setStockActual(5);
	    productoC.setPrecio(4.5);*/

	    System.out.println("Producto C");
	    System.out.println("Nombre: " + productoC.getNombre());
	    System.out.println("Descripción: " + productoC.getDescripcion());
	    System.out.println("Stock: " + productoC.getStockActual());
	    System.out.println("Precio: " + productoC.getPrecio());
	}

}
