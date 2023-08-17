package Relaciones.Ejercicios.EjercicioExtra1.Servicios;

import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Perro;
import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Persona;

import static Relaciones.Ejercicios.Ejercicio1.Ejercicio.Main.lector;

public class  PersonaPerroServices {
	public PersonaPerroServices() {
	}

	public Persona crearPersona(){
		System.out.println("Creando persona");
		System.out.println("Ingrese el nombre de la persona:");
		String nombre = lector.next();

		System.out.println("Ingrese el apellido de la persona:");
		String apellido = lector.next();

		System.out.println("Ingrese la edad de la persona:");
		int edad = lector.nextInt();

		System.out.println("Ingrese el documento de la persona:");
		double documento = lector.nextDouble();


		return new Persona(nombre, apellido, edad, documento);
	}

	public Perro crearPerro(){
		System.out.println("Ingrese el nombre del Perro:");
		String nombre = lector.next();

		System.out.println("Ingrese la raza de la persona:");
		String raza = lector.next();

		System.out.println("Ingrese la edad de la mascota:");
		int edad = lector.nextInt();

		System.out.println("Ingrese el tamanio de la persona:");
		String tamanio = lector.next();


		return new Perro(nombre, raza, edad, tamanio);
	}
}
