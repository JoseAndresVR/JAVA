package com.cmc.directorio.entidades;

public class Telefono {
	
	public String operadora,numero;
	public int codigo;
	public boolean tieneWhatsapp=false;
	
	public Telefono(String operadora,String numero,int codigo) {
		this.numero = numero;
		this.operadora = operadora;
		this.codigo = codigo;
	}
	
	public void imprimir() {
		System.out.println("Numero: "+numero);
		System.out.println("Operadora: "+operadora);
		System.out.println("Codigo: "+codigo);
		System.out.println("Tiene Whatsapp: "+tieneWhatsapp);
	}
	
	
	
}
