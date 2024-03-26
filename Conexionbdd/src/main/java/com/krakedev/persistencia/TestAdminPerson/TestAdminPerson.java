package com.krakedev.persistencia.TestAdminPerson;

import java.math.BigDecimal;

import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Person;
import com.krakedev.persistencia.servicios.AdminPerson;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPerson {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("C","Casada");
		Person Pruebas = new Person("0804514789", "Elsa", "Valencia", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2006/04/23");
			Date horaNac = Convertidor.convertirHora("20:08");
			Pruebas.setFechaNacimiento(fechaNac);
			Pruebas.setHoraNacimiento(horaNac);
			Pruebas.setCantidadAhorrada(new BigDecimal(1200.5));
			Pruebas.setNumeroHijos(2);
			AdminPerson.insertar(Pruebas);
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
		
		
	}

}
