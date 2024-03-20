package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Clientes;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Clientes> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}
	
	public Clientes buscarCliente(String cedula) {
		for(Clientes cliente:clientes) {
			if(cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}
	
	public void registrarCliente(Clientes clienteNuevo) {
		Clientes clienteEncontrado = buscarCliente(clienteNuevo.getCedula());
		if(clienteEncontrado!=null) {
			clientes.add(clienteNuevo);
		}else {
			System.out.println("Cliente ya existe");
		}
	}
	
	public void asignarPrestamo(String ceduCli,Prestamo prestamo) {
		Clientes clienteEncontrado = buscarCliente(ceduCli);
		if(clienteEncontrado!=null) {
			prestamos.add(prestamo);
			CalculadoraAmortizacion.generarTabla(prestamo);
			CalculadoraAmortizacion.mostrarTabla(prestamo);
		}else {
			System.out.println("No es cliente del banco");
		}
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		for(int i=0;i<clientes.size();i++) {
			if(clientes.get(i).getCedula().equals(cedula)) {
				return prestamos;
			}
		}
		return null;
	}
}
