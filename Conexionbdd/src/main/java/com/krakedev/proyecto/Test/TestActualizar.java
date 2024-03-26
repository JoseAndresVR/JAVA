package com.krakedev.proyecto.Test;

import java.util.Date;

import com.krakedev.persistencia.utils.Convertidor;
import com.krakedev.proyecto.entidades.CodigoP;
import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;

public class TestActualizar {

	public static void main(String[] args) {
		CodigoP profesor = new CodigoP(6,"Dayanara");
		Estudiantes estudiante = new Estudiantes("0814785236","Andya","Valverde","valverde@gmail.com",profesor);
		try {
			Date fechaEstudiante = Convertidor.convertirFecha("2012/11/05");
			estudiante.setFecha_nacimiento(fechaEstudiante);
			AdminEstudiantes.actualizar(estudiante);
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}

}
