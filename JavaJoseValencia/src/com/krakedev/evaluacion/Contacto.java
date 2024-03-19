package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula,nombre,apellido;
	private Direccion dir;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	
	
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Direccion getDir() {
		return dir;
	}


	public void setDir(Direccion dir) {
		this.dir = dir;
	}


	public Contacto(String cedula, String nombre,String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
	
	public void imprimir() {
		//Tipo 1
		System.out.println("Cedula:"+getCedula());
		System.out.println("Nombre:"+getNombre());
		System.out.println("Apellido:"+getApellido());
		System.out.println("Direcion:");
		if(getDir()!=null) {
			System.out.println("    Calle Principal:"+getDir().getCallePrincipal());
			System.out.println("    Calle Secundaria:"+getDir().getCalleSecundaria());
		}else {
			System.out.println("    No tiene una direccion asociada");
		}
		//Tipo 2
		/*System.out.println("***"+getNombre()+" "+getApellido());
		if(getDir()!=null) {
			System.out.println("Direcion: "+getDir().getCallePrincipal()+" y "+getDir().getCalleSecundaria());
		}else {
			System.out.println("No tiene direccion asociada");
		}*/
	}

	
	public void mostrarTelefonos() {
		for(int i=0;i<telefonos.size();i++) {
			if(telefonos.get(i).getEstado().equals("C")) {
				System.out.println("Telefonos con estado 'C'");
				System.out.println("Numero: "+telefonos.get(i).getNumero()+", Tipo: "+telefonos.get(i).getTipo());
			}
		}
	}

	public void agregarTelefono(Telefono telefono1) {
		telefonos.add(telefono1);
		
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> erroneos = new ArrayList<Telefono>();
		for(int i=0;i<telefonos.size();i++) {
			if(telefonos.get(i).getEstado().equals("E")) {
				erroneos.add(telefonos.get(i));
			}
		}
		return erroneos;
	}
	
	
	
	
	
	
}
