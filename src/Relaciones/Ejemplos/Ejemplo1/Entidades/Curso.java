package Relaciones.Ejemplos.Ejemplo1.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private int anio;
	private char division;
	private List<Alumno> alumnos;
	private Profesor profesor;

	public Curso() {
		this.anio = 1;
		this.division = 'A';
		this.alumnos = new ArrayList<>();
	}

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

	@Override
	public String toString() {
		return "Curso{" +
				"\n  anio=" + anio +
				"\n  division=" + division +
				"\n  alumnos=" + alumnos.toString() +
				"\n  profesor=" + profesor +
				"\n}";
	}
}
