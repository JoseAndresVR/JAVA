package com.krakedev.proyecto.Test;

import java.util.Date;

import com.krakedev.proyecto.entidades.CodigoP;
import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;
import com.krakedev.proyecto.utilidades.Convertidor;

public class TestAdminEstudiantes {

	public static void main(String[] args) {
		CodigoP profesor = new CodigoP(5,"Elizabeth");
		Estudiantes estudiante = new Estudiantes("0814785236","Andya","Valverde","valverde@gmail.com",profesor);
		try {
			Date fechaEstudiante = Convertidor.convertirFecha("2006/04/23");
			estudiante.setFecha_nacimiento(fechaEstudiante);
			AdminEstudiantes.insertarEstudiante(estudiante);
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
		
		
	}

}
