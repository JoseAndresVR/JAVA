package com.cmc.evaluacion.entidades;

import java.lang.Math;

import com.cmc.evaluacion.*;


public class CalculadoraAmortizacion {
	
	
	public static double calcularCuota(Prestamo presta) {
		double plazo = Math.pow((1+0.01), -12);
		double cuota = (presta.getMonto()*0.01)/(1-plazo);
		return cuota;
	}
	
	public static void generarTabla(Prestamo prestamo) {
		double cuotaP = calcularCuota(prestamo);
		Cuota cuotaObjeto = null;
		for(int i=0;i<prestamo.getPlazo();i++) {
			cuotaObjeto = new Cuota(i+1);
			cuotaObjeto.setCuota(cuotaP);
			prestamo.getCuotas().add(cuotaObjeto);
			cuotaObjeto.setInicio(prestamo.getMonto());
		}
		
		for(int i=0;i<prestamo.getPlazo();i++) {
			Cuota x=calcularValoresCuota(prestamo,cuotaObjeto,cuotaObjeto);
			cuotaObjeto.setAbonoCapital(x.getAbonoCapital());
			cuotaObjeto.setInteres(x.getInteres());
			cuotaObjeto.setSaldo(x.getSaldo());
		}
		
	}
	
	public static Cuota calcularValoresCuota(Prestamo interes,Cuota cuotaAc,Cuota cuotaSig) {
		double intereses = interes.getMonto()/0.01;
		double abonoCapital = cuotaAc.getCuota()-intereses;
		double saldo = cuotaSig.getInicio()-abonoCapital;
		Cuota cuo = new Cuota(0);
		for(int i=0;i<interes.getCuotas().size();i++) {
			cuo = new Cuota(i+1);
			cuo.setAbonoCapital(abonoCapital);
			cuo.setInteres(intereses);
			cuo.setSaldo(saldo);
		}
		return cuo;
	}
	
	
	

	
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("                         TABLA DE AMORTIZACION                                    ");
		System.out.println("|  Numero |     Cuota     |   Inicio   |   Interes   |    Abono   |   Saldo   |");
		for(int i=0;i<prestamo.getCuotas().size();i++) {
			prestamo.getCuotas().get(i).mostrarPrestamo();
		}
	}
	
}
