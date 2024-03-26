package com.krakedev.proyecto.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd",FORMATO_HORA="hh:mm";
	private static final Logger LOGGER=LogManager.getLogger(Convertidor.class);
	
	public static Date convertirFecha(String fechaRecibida) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate=null;
		try {
			fechaDate = sdf.parse(fechaRecibida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("LA FECHA INGRESA NO ESTA CORRECTA");
			throw new Exception("LA FECHA INGRESA NO ESTA CORRECTA");
		}
		return fechaDate;
	}
	public static Date convertirHora(String horaRecibida) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate=null;
		try {
			horaDate = sdf.parse(horaRecibida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("LA HORA INGRESA NO ESTA CORRECTA");
			throw new Exception("LA HORA INGRESA NO ESTA CORRECTA");
		}
		return horaDate;
	}
}
