package com.krakedev.Conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEstudiantes {

	public static void main(String[] args) {
		Connection conect=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			conect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","567353");
			System.out.println("Conectados");
			ps =conect.prepareStatement("insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)"
					+ "values(?,?,?,?,?,?)");
			ps.setString(1,"081767880");
			ps.setString(2,"Andy");
			ps.setString(3,"Reyes");
			ps.setString(4,"josecarlos@yahoo.com");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr="1976/10/29";
			try {
				Date fecha = sdf.parse(fechaStr);
				long fechamili=fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamili);
				Time tSQL=new Time(fechamili);
				ps.setDate(5, fechaSQL);
				ps.setInt(6, 2);
				ps.executeUpdate();
				System.out.println("Inserciones exitosas");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
