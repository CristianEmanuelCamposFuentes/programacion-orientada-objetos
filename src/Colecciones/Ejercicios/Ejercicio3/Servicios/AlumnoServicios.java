package Colecciones.Ejercicios.Ejercicio3.Servicios;

import Colecciones.Ejercicios.Ejercicio3.Entidades.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Colecciones.Ejercicios.Ejercicio3.Ejercicio.Ejercicio3.lector;

public class AlumnoServicios {
	// Lista de alumnos
	private List<Alumno> listaAlumnos;

	// Cada vez que se cree una instancia de servicios, se crea la Arraylist vacia
	// con el constructor vacio

	public AlumnoServicios() {
		listaAlumnos = new ArrayList<>();
	}

	public void crearAlumnos() {
		String respuesta;

		do {
			System.out.print("Ingrese el nombre del alumno: ");
			String nombre = lector.nextLine();

			List<Integer> notas = new ArrayList<>();
			for (int i = 1; i <= 3; i++) {
				System.out.print("Ingrese la nota " + i + " del alumno: ");
				int nota = lector.nextInt();
				notas.add(nota);
			}
			// Consumir el salto de línea después de leer las notas
			lector.nextLine();

			Alumno alumno = new Alumno(nombre, notas);
			listaAlumnos.add(alumno);

			System.out.print("¿Desea crear otro alumno? (s/n): ");
			respuesta = lector.nextLine();
		} while (respuesta.equalsIgnoreCase("s"));
	}

	public double notaFinal(String nombreAlumno) {
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
				// En caso de encontrar el alumno, creamos una lista para las notas y el contador para el promedio
				List<Integer> notas = alumno.getNotas();
				int totalNotas = 0;
				// Objeto Iterator para recorrer y trabajar las notas
				Iterator<Integer> iterator = notas.iterator();

				while (iterator.hasNext()) {
					totalNotas += iterator.next();
				}

				return (double) totalNotas / notas.size();
			}
		}
		// En caso de no encontrar el alumno, devuelve -1
		return -1;
	}
}