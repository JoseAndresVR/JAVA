package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> Estudiantes = new ArrayList<Estudiante>();

	public ArrayList<Estudiante> getEstudiantes() {
		return Estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		Estudiantes = estudiantes;
	}
	
	public String buscarEstudiantePorCedula(Estudiante estu) {
		for(Estudiante estudiante:Estudiantes) {
			if(estudiante.getCedula().equals(estu.getCedula())) {
				System.out.println("El estudiante sigue dentro del curso");
			}
		}
		return null;
	}
	
	public void matricularEstudiante(Estudiante estu) {
		String pregunta = buscarEstudiantePorCedula(estu);
		if(pregunta==null) {
			Estudiantes.add(estu);
			System.out.println("Matriculacion exitosa");
		}else {
			System.out.println("El estudiante ya está matriculado");
		}
	}
	
	public double calcularPromedioCurso() {
		double promedioC=0.0;
		for(int i =0;i<Estudiantes.size();i++) {
			promedioC+=Estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		return promedioC/Estudiantes.size();
	}
	
	public void mostrar() {
		for(Estudiante estudiante:Estudiantes) {
			System.out.println("Nombre="+estudiante.getNombre()+", Apellido="+estudiante.getApellido()+", Cedula="+estudiante.getCedula());
		}
	}
	
}
