package com.cmc.repaso.entidades;

public class Item {
	public String nombre;
	public int productosActuales,productosDevueltos,productosVendidos; 
	
	public Item(String nombre) {
		this.nombre=nombre;
	}
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
	}
	
	public void vender(int ventas) {
		this.productosActuales-=ventas;
		this.productosVendidos+=ventas;
	}
	
	public void devolver(int devol) {
		this.productosActuales+=devol;
		this.productosVendidos-=devol;
		this.productosDevueltos+=devol;
	}
	








}
