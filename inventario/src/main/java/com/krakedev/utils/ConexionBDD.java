package com.krakedev.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConexionBDD {
	public static Connection obtenerCone() {
		Context ctx=null;
		DataSource ds=null;
		Connection con=null;
			try {
				ctx = new InitialContext();
				ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/PgDB");
				con = ds.getConnection();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return con;	
			
	}
}
