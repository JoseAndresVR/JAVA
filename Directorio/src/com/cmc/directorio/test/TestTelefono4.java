package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0988783797", 10),telf2 = new Telefono("claro", "098234234", 5),telf3 = new Telefono("movi", "0998757310", 15),telf4 = new Telefono("claro", "0998307687", 30);
		AdminTelefono at2 = new AdminTelefono();
		int resul =at2.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("De la operadora movi hay: "+resul+" telefonos");
	
	}

}
