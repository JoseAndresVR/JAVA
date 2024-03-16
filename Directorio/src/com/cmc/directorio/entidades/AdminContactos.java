package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.peso>c2.peso) {
			return c1;
		}else {
			return c2;
		}
	}
	
	public boolean buscarOperadoras(Contacto co1,Contacto co2) {
		if(co1.telefono.operadora==co2.telefono.operadora) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.telefono.tieneWhatsapp==true) {
			c1.activo = true;
		}
	}
}
