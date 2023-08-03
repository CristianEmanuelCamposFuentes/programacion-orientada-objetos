package Colecciones.Ejercicios.EjAprendExtra3.Servicios;

import Colecciones.Ejercicios.EjAprendExtra3.Entidades.Libro;

import java.util.HashSet;

import static Colecciones.Ejercicios.EjAprendExtra3.Ejercicio.EjAprendExtra3.lector;

public class LibroServices {
	HashSet<Libro> listaLibros;

	// Este constructor vacio cuando se invoca en el main crea una nueva listaProductos
	public LibroServices() {
		listaLibros = new HashSet<>();
	}

	public void mostrarMenu() {
		System.out.println("MENU:" + "\n" +
			"1.- Mostrar lista de libros." + "\n" +
			"2.- Crear libro." + "\n" +
			"3.- Prestar libro."+ "\n" +
			"4.- Devolver libro."+ "\n" +
			"5.- Salir."
		);
	}

	public boolean procesarOpcion(int opcion) {
		switch (opcion){
			case 1: 
				mostrarLista();
				break;
			case 2: 
				crearLibro();
				break;
			case 3:
				if (prestarLibro()) {
					System.out.println("Libro prestado exitosamente.");
				} else {
					System.out.println("No se pudo prestar el libro.");
				}
				break;
			case 4:
				if (devolverLibro()) {
					System.out.println("Libro devuelto exitosamente.");
				} else {
					System.out.println("No se pudo devolver el libro.");
				}
				break;
			case 5:
				System.out.println("Saliendo del programa.");
				return false;
			default:
				System.out.println("Opcion incorrecta. Volviendo al Menu.");
		}
		return true;
	}

	private void crearLibro() {

		System.out.print("Ingrese el título del libro: ");
		String titulo = lector.next();
		System.out.print("Ingrese el autor del libro: ");
		String autor = lector.next();
		System.out.print("Ingrese el número de ejemplares: ");
		int numeroEjemplares = lector.nextInt();
		lector.nextLine();
		System.out.print("Ingrese el número de ejemplares prestados: ");
		int numeroEjemplaresPrestados = lector.nextInt();
		lector.nextLine();

		Libro nuevoLibro = new Libro(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
		// Agrego el libro creado a la lista
		listaLibros.add(nuevoLibro);

		// Consulto si quiere agregar otro libro
		consultarAgregarOtroLibro();

	}

	private void consultarAgregarOtroLibro() {
		System.out.println("Desea agregar otro libro? (Si) / (No)");
		String opcion = lector.nextLine();

		// En caso de que quiera el usuario agregar otro, vuelvo a llamar a crearLibro
		if(opcion.equalsIgnoreCase("si")){
			crearLibro();
		}
	}

	private boolean devolverLibro() {
		System.out.println("Ingrese el título del libro que quiere devolver: ");
		String titulo = lector.next();

		for (Libro libro : listaLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				// Si el número de prestados es mayor a cero, se puede devolver
				if (libro.getNumeroEjemplaresPrestados() > 0) {
					// Disminuyo en uno los libros prestados
					libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() - 1);
					// Retorna verdadero si se pudo hacer
					return true;
				} else {
					System.out.println("No hay ejemplares prestados para devolver.");
					return false;
				}
			}
		}
		System.out.println("El libro no se encuentra en la librería.");
		return false;
	}

	private boolean prestarLibro() {
		System.out.println("Ingrese el titulo del libro que quiere prestar: ");
		String titulo = lector.next();

		for (Libro libro : listaLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				// Si el numero de prestados es menor a los libros que hay, se puede prestar
				if (libro.getNumeroEjemplaresPrestados() < libro.getNumeroEjemplares()) {

					libro.setNumeroEjemplaresPrestados((libro.getNumeroEjemplaresPrestados() + 1));
					// Retorna verdadero si se pudo hacer
					return true;
				} else {
					System.out.println("No hay ejemplares disponibles para prestar.");
					return false;
				}
			}
		}
		System.out.println("El libro no se encuentra en la librería.");
		return false;
	}

	private void mostrarLista() {
		System.out.println(listaLibros);
	}

	@Override
	public String toString() {
		return "{" +
				"Lista de libros: " + listaLibros +
				'}';
	}
}
