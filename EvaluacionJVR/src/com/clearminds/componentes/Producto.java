package com.clearminds.componentes;

public class Producto {
	
	private String Nombre,Codigo;
	private double Precio;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public void incrementarPrecio(double porcentaje) {
		this.Precio +=(this.Precio*(porcentaje/100));
	}
	
	public void disminuirPrecio(double descuento) {
		this.Precio -=(this.Precio*(descuento/100));
	}
	
	public Producto(String Nombre,String Codigo,double Precio) {
		this.Nombre=Nombre;
		this.Codigo=Codigo;
		this.Precio=Precio;
	}
	
	
}
