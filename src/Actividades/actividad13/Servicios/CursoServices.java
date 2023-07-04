package Actividades.actividad13.Servicios;

import Actividades.actividad13.Entidades.Curso;

import java.util.Scanner;

public class CursoServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\t");
	public Curso cargarAlumnos(){
		System.out.println("Cargar alumnos: ");
		Curso curso = new Curso();
		for (int i = 0; i < curso.getAlumnos().length; i++) {
			System.out.println("Ingrese el nombre del alumno: ");
			String nombreAlumno = lector.nextLine();
			// Primero accedo al lugar y le asigno el valor que quiero
			curso.getAlumnos()[i] = nombreAlumno;
		}
		System.out.println("Alumnos cargados ");

		return curso;
	}

	public void crearCurso(Curso cursoIngresado){
		System.out.println("Ingrese el nombre del curso: ");
		String nombreCurso = lector.nextLine();
		cursoIngresado.setNombreCurso(nombreCurso);

		System.out.println("Ingrese la cantidad de horas por dia:");
		int cantidadHoras = lector.nextInt();
		cursoIngresado.setCantHorasPorDia(cantidadHoras);

	}




}
