package com.krakedev.proyecto.Test;

import java.util.ArrayList;

import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;

public class TestConsultasVarias {

	public static void main(String[] args) {
		try {
			ArrayList<Estudiantes> estudiantes = AdminEstudiantes.buscarPorEmail("@gmail.com");
			System.out.println(estudiantes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
