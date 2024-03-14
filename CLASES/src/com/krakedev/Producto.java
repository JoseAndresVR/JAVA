package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private int stockActual;
	private double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public Producto(String nombre,String descripcion,int stockActual,double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stockActual = stockActual;
		this.precio = precio;
		
	}
	
	
	
}
