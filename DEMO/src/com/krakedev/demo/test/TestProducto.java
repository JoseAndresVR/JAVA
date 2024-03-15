package com.krakedev.demo.test;

import com.krakedev.demo.*;

public class TestProducto {

	public static void main(String[] args) {

		Producto producto1 = new Producto(787,"Doritos");
		producto1.setDescripcion("Frituras en forma de triangulo");
		producto1.setPeso(5.7);
		
		producto1.imprimir();
		
	}

}
