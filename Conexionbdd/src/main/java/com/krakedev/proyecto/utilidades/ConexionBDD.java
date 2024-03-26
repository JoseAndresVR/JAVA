package com.krakedev.proyecto.utilidades;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminPerson;

public class ConexionBDD {
	private final static String DRIVER="org.postgresql.Driver",URL="jdbc:postgresql://localhost:5432/postgres",USER="postgres",PASS ="567353";
	public static Connection conect=null;
	public static Connection con=null;
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception {
		try {
			Class.forName(DRIVER);
			conect=DriverManager.getConnection(URL,USER,PASS);
		} catch (ClassNotFoundException | SQLException e) {
			LOGGER.error("Error al conectarse");
			throw new Exception("Error al conectarse");
		}
		return conect;
		
	}
}
