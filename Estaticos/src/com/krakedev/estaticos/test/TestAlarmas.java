package com.krakedev.estaticos.test;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;
import com.krakedev.estaticos.logica.AdminAlarmas;
import com.krakedev.estaticos.utils.DiaSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiaSemana.LUNES, 3, 20);
		Alarma alarma2 = new Alarma(DiaSemana.MARTES, 4, 30);
		Alarma alarma3 = new Alarma(DiaSemana.MIERCOLES, 5, 40);
		Alarma alarma4 = new Alarma(DiaSemana.VIERNES, 6, 50);
		Alarma alarma5 = new Alarma(DiaSemana.JUEVES, 7, 60);
		AdminAlarmas AdAl = new AdminAlarmas();
		AdAl.agregarAlarma(alarma1);
		AdAl.agregarAlarma(alarma2);
		AdAl.agregarAlarma(alarma3);
		AdAl.agregarAlarma(alarma4);
		AdAl.agregarAlarma(alarma5);
		ArrayList<Alarma> alarm =AdAl.getAlarmas();
		System.out.println(alarm);
		
	
		
	}

}
