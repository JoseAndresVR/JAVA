package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre,apellido,cedula;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public Estudiante(String cedula,String nombre,String apellido) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public void agregarNota(Nota nuevaNota) {
		boolean codigoRepetido=false;
		for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
                codigoRepetido = true;
                break;
            }
        }
		boolean notaValida = nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10;
		if (codigoRepetido || !notaValida) {
            System.out.println("No se puede agregar la nota. Verifique que el código de materia sea único y que la nota esté en el rango válido (0-10).");
        } else {
            notas.add(nuevaNota);
            System.out.println("Nota agregada correctamente.");
        }
	}
	
	public void modificarNota(String codigo,double nuevaNota) {
		boolean encontrado = false;
		for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigo)) {
                if (nuevaNota >= 0 && nuevaNota <= 10) {
                    nota.setCalificacion(nuevaNota);
                    System.out.println("Nota modificada correctamente.");
                } else {
                    System.out.println("La nueva nota debe estar en el rango válido (0-10).");
                }
                encontrado = true;
                break;
            }
           }
		 if (!encontrado) {
	            System.out.println("No se encontró ninguna nota con el código proporcionado.");
	        }
	}
	
	public double calcularPromedioNotasEstudiante() {
		double promedio=0.0;
		for(int i=0;i<notas.size();i++) {
			promedio+=notas.get(i).getCalificacion();
		}
		
		return promedio/notas.size();
	}
	
	public void mostrar() {
		System.out.println("Estudiante[Nombre="+getNombre()+", Apellido="+getApellido()+", Cedula="+getCedula()+"]");
		for(Nota nota:notas) {
			System.out.println("Materia[Nombre de materia="+nota.getMateria().getNombre()+", Codigo="+nota.getMateria().getCodigo()+", Calificacion="+nota.getCalificacion()+"]");
		}
	}
	
	
}
