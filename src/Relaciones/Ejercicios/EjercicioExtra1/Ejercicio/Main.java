package Relaciones.Ejercicios.EjercicioExtra1.Ejercicio;

import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Perro;
import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Persona;
import Relaciones.Ejercicios.EjercicioExtra1.Servicios.PersonaPerroServices;

import java.util.Scanner;

/*
* 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
* */
public class Main {
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {

		PersonaPerroServices PPS = new PersonaPerroServices();

		// Creamos las dos personas primero
		Persona persona1 = PPS.crearPersona();
		Persona persona2 = PPS.crearPersona();

		// Los perritos
		Perro perrito1 = PPS.crearPerro();
		Perro perrito2 = PPS.crearPerro();

		System.out.println("Personas creadas: ");
		System.out.println(persona1);
		System.out.println(persona2);

		System.out.println("Asignando mascotas: ");
		persona1.setPerrito(perrito1);
		System.out.println(persona1);

		System.out.println("Asignando mascotas: ");
		persona2.setPerrito(perrito2);
		System.out.println(persona2);


		System.out.println("Finalizando programa.");

	}
}
