package com.krakedev.Conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr="2020/03/22 10:05:04";
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechamili=fecha.getTime();
			System.out.println(fechamili);
			java.sql.Date fechaSQL = new java.sql.Date(fechamili);
			System.out.println(fechaSQL);
		
			Time tSQL=new Time(fechamili);
			System.out.println(tSQL);
		
		
		
		
		
		
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

}
