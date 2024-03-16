package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "0988783797", 23);
		Contacto c = new Contacto("Jose", "Valencia", telf, 13.5);
		Telefono telf2 = new Telefono("movi", "0998307687", 29);
		Contacto c2 = new Contacto("Jose", "Sol", telf2, 12.5);
		AdminContactos acs = new AdminContactos();
		Contacto x = acs.buscarMasPesado(c, c2);
		System.out.println("Mas pesado:");
		x.imprimir();
		boolean xy = acs.buscarOperadoras(c, c2);
		System.out.println("El resultado de la comparacion de operadoras es: "+xy);
		
		
	}

}
