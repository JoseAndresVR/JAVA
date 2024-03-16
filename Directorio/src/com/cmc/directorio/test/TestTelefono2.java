package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono2 {

	public static void main(String[] args) {
		
		Telefono telf = new Telefono("movi", "098234234", 20);
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(telf);
		
		System.out.println("Numero: "+telf.numero);
		System.out.println("Operadora: "+telf.operadora);
		System.out.println("Codigo: "+telf.codigo);
		System.out.println("Tiene Whatsapp: "+telf.tieneWhatsapp);
	}
		
	}

