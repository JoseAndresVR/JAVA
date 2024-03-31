package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.entidades.Entidades;
import com.krakedev.excepciones.KrakedevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	
	public void insertar(Entidades entidad) throws KrakedevException{
		Connection con=null;
		try {
			con=ConexionBDD.obtenerCone();
			PreparedStatement ps = con.prepareStatement("insert into clientes(cedula,nombre,numeroHijos) values(?,?,?)");
			ps.setString(1, entidad.getCedula());
			ps.setString(2, entidad.getNombre());
			ps.setInt(3, entidad.getNuHijos());
			ps.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new KrakedevException("Error al insertar cliente");
		} catch (KrakedevException e) {
			throw e;
		}
	
	}
	public void actualizar(Entidades entidad) throws KrakedevException{
		Connection con=null;
		try {
			con=ConexionBDD.obtenerCone();
			PreparedStatement ps = con.prepareStatement("update clientes set nombre=?,numeroHijos=? where cedula=?");
			ps.setString(1, entidad.getNombre());
			ps.setInt(2, entidad.getNuHijos());
			ps.setString(3, entidad.getCedula());
			ps.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new KrakedevException("Error al actualizar cliente");
		} catch (KrakedevException e) {
			throw e;
		}
	
	}
}
