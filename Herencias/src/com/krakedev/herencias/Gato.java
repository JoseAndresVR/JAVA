package com.krakedev.herencias;

public class Gato extends Animal{

	public void dormir() {
		System.out.println("Gato maulla antes de dormir");
	}
	
	public void maullar() {
		System.out.println("MIAUUUUUUU");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("MIAUUUUUUU "+adjetivo);
	}
	
	
	
	
}
