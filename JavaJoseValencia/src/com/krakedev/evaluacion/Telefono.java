package com.krakedev.evaluacion;

public class Telefono {
	private String numero,tipo,estado;

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}
	
	public Telefono(String numero,String tipo) {
		this.numero=numero;
		this.tipo=tipo;
		this.estado=validaTelefono();
	}
	
	public String validaTelefono() {
		if (numero == null || tipo == null) {
            return "E";
        }
        if (!tipo.equals("Movil") && !tipo.equals("Convencional")) {
            return "E";
        }
        if (tipo.equals("Movil") && numero.length() != 10) {
            return "E";
        }
        if (tipo.equals("Convencional") && numero.length() != 7) {
            return "E";
        }
        return "C";
	}
}
	
