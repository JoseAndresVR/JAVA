package com.krakedev.proyecto.Test;

import java.util.ArrayList;

import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;

public class TestConsultaPK {

	public static void main(String[] args) {
		try {
			Estudiantes estudiantes = AdminEstudiantes.buscarPorCedula("1234567890");
			System.out.println(estudiantes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
