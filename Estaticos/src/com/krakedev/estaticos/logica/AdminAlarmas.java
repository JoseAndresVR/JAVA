package com.krakedev.estaticos.logica;

import java.util.ArrayList;
import com.krakedev.*;

import com.krakedev.estaticos.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas = new ArrayList<Alarma>();
	
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	public void agregarAlarma(Alarma alarmaRecibida) {
		alarmas.add(alarmaRecibida);
	}

	
	
	
	
}
