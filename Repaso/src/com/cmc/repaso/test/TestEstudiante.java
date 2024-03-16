package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante est1 = new Estudiante("Jose");
		
		est1.calificar(5.9);
		
		System.out.println(est1.nombre+" tiene un resultado de: "+est1.resultado);
		
		
	}

}
