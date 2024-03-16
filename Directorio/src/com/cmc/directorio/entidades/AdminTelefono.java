package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.operadora=="movi") {
			telefono.tieneWhatsapp = true;
		}
	}
	
	public int contarMovi(Telefono telefono1,Telefono telefono2,Telefono telefono3){
		int contador=0;
		if(telefono1.operadora=="movi") {
			contador+=1;
		}
		if(telefono2.operadora=="movi") {
			contador+=1;
		}
		if(telefono3.operadora=="movi") {
			contador+=1;
		}
		return contador;
	}
	
	public int contarClaro(Telefono telefono1,Telefono telefono2,Telefono telefono3,Telefono telefono4){
		int contador=0;
		if(telefono1.operadora=="claro") {
			contador+=1;
		}
		if(telefono2.operadora=="claro") {
			contador+=1;
		}
		if(telefono3.operadora=="claro") {
			contador+=1;
		}
		if(telefono4.operadora=="claro") {
			contador+=1;
		}
		return contador;
	}

}

