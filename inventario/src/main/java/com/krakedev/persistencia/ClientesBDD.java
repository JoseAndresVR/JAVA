package com.krakedev.persistencia;

import java.sql.Connection;

import com.krakedev.entidades.Entidades;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	
	public void insertar(Entidades entidad){
		Connection con=ConexionBDD.obtenerCone();
		if(con!=null) {
			System.out.println("CONECT");
		}else {
			System.out.println("ERROR");
		}
	
	}
}
