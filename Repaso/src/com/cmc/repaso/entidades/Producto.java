package com.cmc.repaso.entidades;

public class Producto {
	public String nombre;
	private double precio;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio < 0) {
			precio*=-1;
			this.precio = precio;
		}else {
			this.precio = precio;
		}
	}
	
	public Producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double CalcularPrecioPromo(double promo) {
		return this.precio-((promo / 100)*this.precio);
	}

}
	

