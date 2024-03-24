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

public class TestConexion {

	public static void main(String[] args) {
		Connection conect=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			conect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","567353");
			System.out.println("Conectados");
			ps =conect.prepareStatement("insert into person(cedula,nombre,apellido,estatura,cantidad_ahorrada,numero_hijos,fechan,horan)"
					+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1,"0804514875");
			ps.setString(2,"Jose");
			ps.setString(3,"Valencia");
			ps.setDouble(4,1.78);
			ps.setBigDecimal(5, new BigDecimal(1220.5));
			ps.setInt(6,3);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2006/04/23 20:00:08";
			try {
				Date fecha = sdf.parse(fechaStr);
				long fechamili=fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamili);
				Time tSQL=new Time(fechamili);
				ps.setDate(7, fechaSQL);
				ps.setTime(8, tSQL);
			
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
