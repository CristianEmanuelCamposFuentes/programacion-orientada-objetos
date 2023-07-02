package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {
	private List<Pelicula> peliculas;


	// ! Se utiliza el constructor para que cada lista este inicializada, entonces se
	// ! puedan agregar valores, sino serian null y eso en java NO ESTA PERMITIDO
	public PeliculaService() {

		// Creo nueva lista de peliculas
		peliculas = new ArrayList<>();

	}

	public void cargarPelicula() {
		System.out.println("=== CARGAR PELICULA ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el título de la película: ");
		String titulo = scanner.nextLine();
		System.out.println("Ingrese el género de la película: ");
		String genero = scanner.nextLine();
		System.out.println("Ingrese el año de la película: ");
		int anio = scanner.nextInt();
		System.out.println("Ingrese la duración de la película en minutos: ");
		int duracion = scanner.nextInt();

		// Crear un objeto Pelicula con los datos ingresados
		Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
		// Agregar esa pelicula a la lista de peliculas
		peliculas.add(pelicula);

		System.out.println("La película se ha cargado exitosamente.");
	}

	public void listarPeliculasDisponibles() {
		System.out.println("=== LISTAR PELICULAS DISPONIBLES ===");
		// Validacion si la lista de peliculas esta vacia
		if (peliculas.isEmpty()) {
			System.out.println("No hay películas disponibles.");
		} else {
			System.out.println("Películas disponibles:");
			// El foreach recorre cada objeto "pelicula" dentro del ArrayList peliculas
			for (Pelicula pelicula : peliculas) {
				System.out.println(pelicula);
			}
		}
	}

	public Pelicula buscarPeliculaPorTitulo() {
		System.out.println("=== BUSCAR PELICULA POR TITULO ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el título de la película: ");
		String tituloPelicula = scanner.nextLine();

		// Inicio un objeto Pelicula sin valores para compararlo con los objetos que
		// Pelicula que esten en la lista de peliculas, sino tira ERROR porque no sabe con que compararlo
		Pelicula peliculaEncontrada = null;
		for (Pelicula pelicula : peliculas) {
			// Compara el titulo nuestro con cada titulo de la lista, si encuentra la manda al nuevo objeto para trabajarlo
			if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula)) {
				peliculaEncontrada = pelicula;
				break;
			}
		}

		// Mostrar el resultado de la búsqueda
		if (peliculaEncontrada != null) {
			System.out.println("Pelicula: ");
			System.out.println(peliculaEncontrada);

			System.out.println("¿Desea alquilar esta película? (S/N)");
			String opcion = scanner.nextLine();

			if (opcion.equalsIgnoreCase("S")) {
				// Invocar función para alquilar la película
				return peliculaEncontrada;
			}
		} else {
			System.out.println("La película no existe.");

		}
		return null;
	}

	public void buscarPeliculaPorGenero() {
		System.out.println("=== BUSCAR PELICULA POR GENERO ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el género de la película a buscar: ");
		String genero = scanner.nextLine();

		boolean encontrada = false;
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getGenero().equalsIgnoreCase(genero)) {
				encontrada = true;
				System.out.println(pelicula);
			}
		}

		if (!encontrada) {
			System.out.println("No se encontraron películas en el género especificado.");
		}
	}

	public void devolverPelicula() {
		System.out.println("=== Devolver PELICULA ===");

	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
}