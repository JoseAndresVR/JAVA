package com.krakedev.estaticos.utils;

import com.krakedev.*;

public class Util {
	public static String formatearHora(int hora) {
		String horaS = ""+hora;
		if(horaS.length()==1) {
			return 0+horaS;
		}
		return horaS;	
	}
	
	
	public static String formatearDia(int dia) {
		if(dia==DiaSemana.LUNES) {
			return "Lunes";
		}else if(dia==DiaSemana.MARTES) {
			return "Martes";
		}else if(dia==DiaSemana.MIERCOLES) {
			return "Miercoles";
		}else if(dia==DiaSemana.JUEVES) {
			return "Jueves";
		}else if(dia==DiaSemana.VIERNES) {
			return "Viernes";
		}else if(dia==DiaSemana.SABADO) {
			return "Sabado";
		}else if(dia==DiaSemana.DOMINGO) {
			return "Domingo";
		}
		return null;
	}


	
	
	
	
}
