package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0988783797", 10),telf2 = new Telefono("Claro", "098234234", 5),telf3 = new Telefono("movi", "0998757310", 15);
		AdminTelefono at1 = new AdminTelefono();
		int resul =at1.contarMovi(telf1, telf2, telf3);
		System.out.println("De la operadora movi hay: "+resul+" telefonos");
	}

}
