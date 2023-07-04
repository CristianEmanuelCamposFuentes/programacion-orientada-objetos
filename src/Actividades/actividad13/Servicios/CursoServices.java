package Actividades.actividad13.Servicios;

import Actividades.actividad13.Entidades.Curso;

import java.util.Scanner;

public class CursoServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public Curso cargarAlumnos(Curso cursoParaCargar){
		System.out.println("Cargar alumnos: ");

		for (int i = 0; i < cursoParaCargar.getAlumnos().length; i++) {
			System.out.println("Ingrese el nombre del alumno: ");
			String nombreAlumno = lector.nextLine();
			// Primero accedo al lugar y le asigno el valor que quiero
			cursoParaCargar.getAlumnos()[i] = nombreAlumno;
		}
		System.out.println("Alumnos cargados ");

		return cursoParaCargar;
	}

	public Curso crearCurso(){
		System.out.println("Ingrese el nombre del curso: ");
		Curso cursoIngresado = new Curso();
		String nombreCurso = lector.nextLine();
		cursoIngresado.setNombreCurso(nombreCurso);

		System.out.println("Ingrese la cantidad de horas por dia:");
		int cantidadHoras = lector.nextInt();
		// ! Despues de cada lector de entero limpiar el buffer de memoria !!!
		lector.nextLine();
		cursoIngresado.setCantHorasPorDia(cantidadHoras);

		System.out.println("Cantidad de dias por semana: ");
		int cantidadDias = lector.nextInt();
		lector.nextLine();
		cursoIngresado.setCantDiasPorSemana(cantidadDias);

		System.out.println("Ingrese el costo de la hora en $: ");
		double costo = lector.nextDouble();
		lector.nextLine(); // * En los valores tipo double tambien se debe limpiar la memoria
		cursoIngresado.setPrecioPorHora(costo);

		String turno;
		do {
			System.out.println("Ingrese el turno (maniana / tarde): ");
			turno = lector.nextLine();
		} while (!turno.equals("maniana") && !turno.equals("tarde"));

		cursoIngresado.setTurno(turno);

		return cargarAlumnos(cursoIngresado);
	}

	public double calcularGananciaSemanal(Curso cursoCosteado){
		// este método se encarga de calcular la ganancia
		//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
		//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
		//se repite el encuentro.
		double totalSemanal = cursoCosteado.getCantDiasPorSemana() * cursoCosteado.getCantHorasPorDia() * cursoCosteado.getPrecioPorHora() * cursoCosteado.getAlumnos().length;
		return totalSemanal;
	}


}
