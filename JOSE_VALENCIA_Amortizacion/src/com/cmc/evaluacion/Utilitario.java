package com.cmc.evaluacion;

public class Utilitario {
	public static double redondear(double num) {
		double redon = Math.round(num*100.0)/100.0;
		return redon;
	}
}
