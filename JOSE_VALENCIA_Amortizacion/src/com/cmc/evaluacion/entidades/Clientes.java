package com.cmc.evaluacion.entidades;

public class Clientes {
	private String Cedula,Nombre,Apellido;

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Clientes(String cedula, String nombre, String apellido) {
		Cedula = cedula;
		Nombre = nombre;
		Apellido = apellido;
	}
	
	public void mostrarCliente() {
		System.out.println("[Cedula="+Cedula+", Nombre="+Nombre+", Apellido="+Apellido+"]");
	}
	
}
