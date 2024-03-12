package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;//Cree variable persona
		p = new Persona();//Cree objeto persona 
		System.out.println("Hola mundo: "+p.nombre);//accedo a los atributos
		//relleno los atributos
		p.nombre = "Jose Andres";
		p.edad= 17;
		p.estatura=1.78;
		System.out.println(p.nombre);
		System.out.println(p.edad);
		System.out.println(p.estatura);
	}

}
