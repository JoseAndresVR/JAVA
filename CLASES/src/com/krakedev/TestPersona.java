package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
	    Persona p; // Declara variable persona
	    p = new Persona(); // Crea objeto persona
	    System.out.println("Hola mundo: " + p.getNombre()); // Accede al atributo nombre utilizando el método getter
	    
	    // Rellena los atributos
	    p.setNombre("Jose Andres");
	    p.setEdad(17);
	    p.setEstatura(1.78);
	    
	    // Imprime los atributos utilizando los métodos getter
	    System.out.println(p.getNombre());
	    System.out.println(p.getEdad());
	    System.out.println(p.getEstatura());
	}

}
