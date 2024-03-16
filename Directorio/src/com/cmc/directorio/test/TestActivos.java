package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		Contacto c = new Contacto("Jose", "Valencia", telf, 13.5);
		c.imprimir();
		AdminContactos x = new AdminContactos();
		AdminTelefono xy = new AdminTelefono();
		xy.activarMensajeria(telf);
		x.activarUsuario(c);
		c.imprimir();
	
	}

}
