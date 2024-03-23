package com.krakedev.estaticos.entidades;

import com.krakedev.estaticos.utils.Util;

public class Alarma {
	private int dia,hora,minuto;

	public Alarma(int dia, int hora, int minuto) {
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return "Alarma ["+Util.formatearDia(dia)+","+Util.formatearHora(hora)+":"+minuto+"]";
	}
	
	
	
}
