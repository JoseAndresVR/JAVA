package com.krakedev.proyecto.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.utilidades.ConexionBDD;



public class AdminEstudiantes {

		private static final Logger LOGGER=LogManager.getLogger(AdminEstudiantes.class);
		
		//METODO PARA AGREGAR
		public static void insertarEstudiante(Estudiantes estudiante) throws Exception {
			Connection con = null;
			PreparedStatement ps;
			try {
				con=ConexionBDD.conectar();
				System.out.println("Conectados");
				ps =con.prepareStatement("insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)"
						+ "values(?,?,?,?,?,?)");
					ps.setString(1, estudiante.getCedula());
					ps.setString(2, estudiante.getNombre());
					ps.setString(3, estudiante.getApellido());
					ps.setString(4, estudiante.getEmail());
					ps.setDate(5, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
					ps.setInt(6, estudiante.getCodigo_profesor().getCodigo());
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
		public static void actualizar(Estudiantes estudiante) throws Exception {
			Connection con = null;
			PreparedStatement ps;
			try {
				con=ConexionBDD.conectar();
				System.out.println("Conectados");
				ps =con.prepareStatement("UPDATE estudiantes set nombre=?,apellido=?,email=?,fecha_nacimiento=?,codigo_profesor=?  WHERE cedula=?");
				ps.setString(1, estudiante.getNombre());
				ps.setString(2, estudiante.getApellido());
				ps.setString(3, estudiante.getEmail());
				ps.setDate(4, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
				ps.setInt(5, estudiante.getCodigo_profesor().getCodigo());
				ps.setString(6, estudiante.getCedula());
				
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
				ps =con.prepareStatement("Delete from estudiantes WHERE cedula=?");
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

