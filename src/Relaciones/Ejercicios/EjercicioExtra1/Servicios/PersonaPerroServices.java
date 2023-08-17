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

	private void adoptarPerro() {
		mostrarPersonas();

		System.out.print("Seleccione el número de la persona que quiere adoptar un perro: ");
		int numPersona = lector.nextInt();

		// Validar si el numero esta dentro de la lista
		if (numPersona < 1 || numPersona > personas.size()) {
			System.out.println("Número de persona inválido.");
			return;
		}

		// El numero menos uno para obtener el indice de la lista
		Persona personaSeleccionada = personas.get(numPersona - 1);

		// Si la variable perrito no es null, significa que ya adopto un perro, por lo que sale
		if (personaSeleccionada.getPerrito() != null) {
			System.out.println("Esta persona ya tiene un perro.");
			return;
		}

		System.out.println("Perros disponibles:");
		for (int i = 0; i < perrosDisponibles.size(); i++) {
			System.out.println((i + 1) + ". " + perrosDisponibles.get(i).getNombre());
		}

		System.out.print("Seleccione el número del perro que desea adoptar: ");
		int numPerro = lector.nextInt();

		// Misma validacion que este en ese rango dentro de la lista
		if (numPerro < 1 || numPerro > perrosDisponibles.size()) {
			System.out.println("Número de perro inválido.");
			return;
		}

		Perro perroSeleccionado = perrosDisponibles.get(numPerro - 1);

		// La persona elegida se le setea un Perro
		personaSeleccionada.setPerrito(perroSeleccionado);
		// Y se elimina el perro de los disponibles
		perrosDisponibles.remove(perroSeleccionado);

		System.out.println("¡Adopción exitosa!");
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
					Persona personaCreada = crearPersona();
					personas.add(personaCreada);
					break;
				case 2:
					Perro perroCreado = crearPerro();
					perrosDisponibles.add(perroCreado);
					break;
				case 3:
					mostrarPersonas();
					break;
				case 4:
					mostrarPerros();
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
