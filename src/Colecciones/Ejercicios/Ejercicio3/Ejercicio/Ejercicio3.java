package Colecciones.Ejercicios.Ejercicio3.Ejercicio;

/*3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
		alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
		con sus 3 notas.
		En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
		toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
		pregunta al usuario si quiere crear otro Alumno o no.
		Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
		Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
		del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
		promedio final, devuelto por el método y mostrado en el main.*/

import Colecciones.Ejercicios.Ejercicio3.Servicios.AlumnoServicios;

import java.util.Scanner;

public class Ejercicio3 {
	// Scanner
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {
		AlumnoServicios AS = new AlumnoServicios();
		AS.crearAlumnos();

		System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
		String nombreAlumno = lector.nextLine();

		double notaFinal = AS.notaFinal(nombreAlumno);
		if (notaFinal >= 0) {
			System.out.println("El promedio final de " + nombreAlumno + " es: " + notaFinal);
		} else {
			System.out.println("Alumno no encontrado en la lista.");
		}
	}

}
