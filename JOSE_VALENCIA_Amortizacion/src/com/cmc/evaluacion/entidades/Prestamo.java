package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

import com.cmc.evaluacion.Utilitario;

public class Prestamo {
	private double Monto,Interes;
	private int Plazo;
	private ArrayList<Cuota> cuotas;
	
	
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}
	public double getMonto() {
		return Monto;
	}
	public void setMonto(double monto) {
		Monto = monto;
	}
	public double getInteres() {
		return Interes;
	}
	public void setInteres(double interes) {
		Interes = interes;
	}
	public int getPlazo() {
		return Plazo;
	}
	public void setPlazo(int plazo) {
		Plazo = plazo;
	}
	public Prestamo(double monto, double interes, int plazo) {
		cuotas = new ArrayList<Cuota>(plazo);
		Monto = monto;
		Interes = interes;
		Plazo = plazo;
	}
	Utilitario uti;
	
	public void mostrarPrestamo() {
			System.out.println("[Monto="+Monto+", Interes="+Interes+", Plazo="+Plazo+"]");
	}
	
	
	
	
	
	
}
