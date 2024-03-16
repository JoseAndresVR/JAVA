package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item it1 = new Item("Dorito");
		it1.productosActuales=20;
		it1.imprimir();
		
		it1.vender(5);
		it1.imprimir();
		
		it1.devolver(3);
		it1.imprimir();
		
		Item it2 = new Item("Papitas");
		it2.productosActuales=80;
		it2.imprimir();
		
		it2.vender(10);
		it2.imprimir();
		
		it2.devolver(5);
		it2.imprimir();
		
	}

}
