package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0998757310", 3);
		Contacto c = new Contacto("Violeta", "Reyes", telf, 20.5);
		Telefono telf2 = new Telefono("claro", "0998745163", 17);
		Contacto c2 = new Contacto("Ela", "Bone", telf2, 15.5);
		AdminContactos acs = new AdminContactos();
		Contacto x = acs.buscarMasPesado(c, c2);
		System.out.println("Mas pesado:");
		x.imprimir();
		boolean xy = acs.buscarOperadoras(c, c2);
		System.out.println("El resultado de la comparacion de operadoras es: "+xy);
		
	}

}
