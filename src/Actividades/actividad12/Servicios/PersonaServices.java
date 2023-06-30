package Actividades.actividad12.Servicios;

import Actividades.actividad12.Entidades.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServices {


	public Persona crearPersona(){
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese el nombre de la persona: ");
		String nombre = lector.nextLine();

		System.out.println("Ingrese la fecha de nacimiento de la persona: ");
		// Primero la fecha se hace cadena
		String fechaString = lector.next();

		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

		// Se convierte en formato Date
		Date fechaNacimiento;
		try {
			fechaNacimiento = formateador.parse(fechaString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

		return new Persona(nombre, fechaNacimiento);
	}

	public void calcularEdad(Date fecha){
		// Obtener fecha actual para saber el anio
		Date anioActual = new Date();

		// Calcular la edad restando al anio actual la fecha de nacimiento
		int edad = anioActual.getYear() - fecha.getYear();

        // Calcular la edad restando al mes actual la fecha de nacimiento
        int mesActual = anioActual.getMonth() - fecha.getMonth();

        // Calcular la edad restando al dia actual la fecha de nacimiento
        int diaActual = anioActual.getDate() - fecha.getDate();

        System.out.println("La edad de la persona es: " + edad + " años, " + mesActual + " meses, y " + diaActual + " dias.");

	}
}
