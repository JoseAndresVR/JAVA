package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre,resultado;
	public double nota;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		if(nota<8) {
			this.resultado = "F";
		}else {
			this.resultado = "A";
		}
	}
	
	
}
