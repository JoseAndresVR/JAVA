package com.krakedev.demo;

public class Producto {
	private String Nombre,Descripcion;
	private int Codigo;
	private double Peso;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
	
	public Producto(int Codigo,String Nombre) {
		this.Codigo = Codigo;
		this.Nombre = Nombre;
	}
	
	public void imprimir() {
		System.out.println("/////PRODUCTO COMPRADO//////");
		System.out.println("CODIGO: "+Codigo);
		System.out.println("NOMBRE: "+Nombre);
		System.out.println("DESCRIPCION: "+Descripcion);
		System.out.println("PESO: "+Peso);
	}
	
}
