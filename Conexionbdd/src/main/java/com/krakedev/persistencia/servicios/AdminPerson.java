package com.krakedev.persistencia.servicios;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Person;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPerson {
	private static final Logger LOGGER=LogManager.getLogger(AdminPerson.class);
	
	//METODO PARA AGREGAR
	public static void insertar(Person persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con=ConexionBDD.conectar();
			System.out.println("Conectados");
			ps =con.prepareStatement("insert into person(cedula,nombre,apellido,estado_civil,numero_hijos,estatura,cantidad_ahorrada,fechan,horan)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,persona.getCedula());
			ps.setString(2,persona.getNombre());
			ps.setString(3,persona.getApellido());
			ps.setString(4,persona.getEstadoCivil().getCodigo());
			ps.setInt(5,persona.getNumeroHijos());
			ps.setDouble(6,persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8,new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			
				ps.executeUpdate();
				System.out.println("Inserciones exitosas");

		} catch (ClassNotFoundException | SQLException e) {
				LOGGER.error("Error en insercion");
				throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	//METODO DE ACTUALIZACION
	public static void actualizar(Person persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con=ConexionBDD.conectar();
			System.out.println("Conectados");
			ps =con.prepareStatement("UPDATE person set nombre=?,apellido=?,estado_civil=?,numero_hijos=?,estatura=?,cantidad_ahorrada=?,fechan=?,horan=? WHERE cedula=?");
			ps.setString(1,persona.getNombre());
			ps.setString(2,persona.getApellido());
			ps.setString(3,persona.getEstadoCivil().getCodigo());
			ps.setInt(4,persona.getNumeroHijos());
			ps.setDouble(5,persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7,new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());
			
				ps.executeUpdate();
				System.out.println("Actualizacion exitosas");

		} catch (ClassNotFoundException | SQLException e) {
				LOGGER.error("Error de actualizacion");
				throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	//METODO PARA ELIMINAR
	public static void eliminar(String ceduEliminar) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con=ConexionBDD.conectar();
			System.out.println("Conectados");
			ps =con.prepareStatement("Delete from person WHERE cedula=?");
			ps.setString(1, ceduEliminar);
			
				ps.executeUpdate();
				System.out.println("Eliminacion exitosas");

		} catch (ClassNotFoundException | SQLException e) {
				LOGGER.error("Error de Eliminacion");
				throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	
}
