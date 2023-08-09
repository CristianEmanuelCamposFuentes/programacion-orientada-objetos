package Relaciones.Ejemplos.Ejemplo1.Entidades;

import java.util.List;

public class Curso {
	private int anio;
	private char division;
	private List<Alumno> alumnos;
	private Profesor profesor;

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}
