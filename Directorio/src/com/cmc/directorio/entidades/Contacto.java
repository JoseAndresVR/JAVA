package com.cmc.directorio.entidades;

public class Contacto {
	public String nombre,apellido;
	public boolean activo;
	public Telefono telefono;
	public double peso;
	
	public Contacto(String nombre,String apellido,Telefono telefono,double peso) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.peso = peso;
		this.telefono = telefono;
	}
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Numero: "+telefono.numero);
		System.out.println("Operadora: "+telefono.operadora);
		System.out.println("Codigo: "+telefono.codigo);
		System.out.println("Tiene Whatsapp: "+telefono.tieneWhatsapp);
		System.out.println("Activo: "+activo);
		System.out.println("Peso: "+peso);
	
	}
	
	
	
	
}
