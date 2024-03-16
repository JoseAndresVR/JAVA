package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestContacto1 {

	public static void main(String[] args) {
		
		Telefono telf = new Telefono("claro", "0988783797", 23);
		Contacto c = new Contacto("Jose", "Valencia", telf, 13.5);
		c.imprimir();
		
		
	}

}
