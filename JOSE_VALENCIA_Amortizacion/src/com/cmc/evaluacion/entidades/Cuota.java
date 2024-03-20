package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.*;

public class Cuota {
	private int Numero;
	private double cuota,capital,inicio,interes,abonoCapital,saldo;
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capita) {
		this.capital = capita;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cuota(int numero) {
		Numero = numero;
	} 
	
	Utilitario uti;
	
	public void mostrarPrestamo() {
		System.out.println("|   "+Numero+"     |    "+uti.redondear(cuota)+"     |   "+uti.redondear(inicio)+"   |     "+uti.redondear(interes)+"     |     "+uti.redondear(abonoCapital)+"    |    "+uti.redondear(saldo)+"    |   ");
	
	}
	
	


}
