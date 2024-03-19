package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>(),correctos = new ArrayList<Contacto>(),incorrectos = new ArrayList<Contacto>();
	private Date fechaModificacion;
	
	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto cont) {
		for(Contacto conta:contactos) {
			if(conta.getCedula().equals(cont.getCedula())) {
				return false;
			}
		}
		contactos.add(cont);
		Date fecha = new Date();
		return true;
		
		
	}
	
	public Contacto buscarPorCedula(String cod) {
		for(Contacto conta:contactos) {
			if(conta.getCedula().equals(cod)) {
				return conta;
			}
		}
		return null;
	}
	
	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date fecha = new Date();
		String fechaFormateada = sdf.format(fecha);
		return fechaFormateada;
	}
	
	public int contarPerdidos() {
		int x=0;
		for(Contacto conta:contactos) {
			if(conta.getDir()==null) {
				x++;
			}
		}
		return x;
	}
	public int contarFijos() {
	int contador = 0;
    for (Contacto contacto : contactos) {
    	ArrayList<Telefono> telefonos = contacto.getTelefonos();
        for (Telefono telefono : telefonos) {
            if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
                contador++;
                break;
            }
        }
    }
    return contador;
    
	}
	
	public void depurar(){
		int x=0;
		for(Contacto conta:contactos) {
			if(conta.getDir()==null) {
				incorrectos.add(conta);
			}else {
				correctos.add(conta);
			}
		}
		contactos.clear();
		
	}
	
	
}
