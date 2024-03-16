package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto pro1 = new Producto("Dorito",-1.5);
		pro1.setPrecio(pro1.getPrecio());
		System.out.println(pro1.nombre+" "+pro1.getPrecio()+" "+pro1.CalcularPrecioPromo(20));
		
	}

}
