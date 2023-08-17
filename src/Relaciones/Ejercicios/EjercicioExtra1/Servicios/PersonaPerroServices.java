package Relaciones.Ejercicios.EjercicioExtra1.Servicios;

import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Perro;
import Relaciones.Ejercicios.EjercicioExtra1.Entidades.Persona;

import java.util.ArrayList;
import java.util.List;

import static Relaciones.Ejercicios.Ejercicio1.Ejercicio.Main.lector;

public class  PersonaPerroServices {
	private List<Perro> perrosDisponibles = new ArrayList<>();
	private List<Persona> personas = new ArrayList<>();
	public PersonaPerroServices() {
		inicializarObjetosPorDefecto();
	}

	private void inicializarObjetosPorDefecto() {
		perrosDisponibles.add(new Perro("Firulais", "Raza1", 2, "Pequeño", false));
		perrosDisponibles.add(new Perro("Rex", "Raza2", 3, "Mediano", false));
		perrosDisponibles.add(new Perro("Luna", "Raza3", 1, "Grande", false));
		perrosDisponibles.add(new Perro("Max", "Raza4", 4, "Mediano", false));
		perrosDisponibles.add(new Perro("Bella", "Raza5", 2, "Pequeño", false));

		personas.add(new Persona("Juan", "Pérez", 30, 12345678));
		personas.add(new Persona("María", "González", 25, 87654321));
		personas.add(new Persona("Carlos", "López", 40, 98765432));
		personas.add(new Persona("Ana", "Martínez", 28, 45678901));
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

		System.out.println("Ingrese la raza del Perro:");
		String raza = lector.next();

		System.out.println("Ingrese la edad del Perro:");
		int edad = lector.nextInt();

		System.out.println("Ingrese el tamanio del Perro:");
		String tamanio = lector.next();


		return new Perro(nombre, raza, edad, tamanio, false);
	}

	private void mostrarPersonas() {
		System.out.println("Personas:");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

	private void mostrarPerros() {
		System.out.println("Perros disponibles:");
		for (Perro perro : perrosDisponibles) {
			System.out.println(perro);
		}
	}



	public void mostrarMenu() {
		int opcion;
		do {
			System.out.println("\n----- Menú -----");
			System.out.println("1. Crear Persona");
			System.out.println("2. Crear Perro");
			System.out.println("3. Mostrar Personas");
			System.out.println("4. Mostrar Perros Disponibles");
			System.out.println("5. Adoptar Perro");
			System.out.println("0. Salir");
			System.out.print("Ingrese su opción: ");
			opcion = lector.nextInt();

			switch (opcion) {
				case 1:
					crearNuevaPersona();
					break;
				case 2:
					crearNuevoPerro();
					break;
				case 3:
					mostrarPersonas();
					break;
				case 4:
					mostrarPerrosDisponibles();
					break;
				case 5:
					adoptarPerro();
					break;
				case 0:
					System.out.println("Saliendo del programa.");
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
			}
		} while (opcion != 0);
	}
}
