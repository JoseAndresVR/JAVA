package com.krakedev.entidades;

public class Entidades {
	private String nombre,cedula,nuHijos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNuHijos() {
		return nuHijos;
	}

	public void setNuHijos(String nuHijos) {
		this.nuHijos = nuHijos;
	}

	@Override
	public String toString() {
		return "Entidades [nombre=" + nombre + ", cedula=" + cedula + ", nuHijos=" + nuHijos + "]";
	}

	public Entidades(String nombre, String cedula, String nuHijos) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.nuHijos = nuHijos;
	}
	
	public Entidades() {
		
	}
}
