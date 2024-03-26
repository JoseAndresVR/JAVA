package com.krakedev.persistencia.TestAdminPerson;

import com.krakedev.persistencia.servicios.AdminPerson;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPerson.eliminar("0804514875");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}

}
