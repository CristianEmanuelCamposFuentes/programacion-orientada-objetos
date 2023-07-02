package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

	public void buscarPeliculaPorTitulo(String tituloPelicula) {
		// Buscar la película por título
		Pelicula peliculaEncontrada = null;
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula)) {
				peliculaEncontrada = pelicula;
				break;
			}
		}

		// Mostrar el resultado de la búsqueda
		if (peliculaEncontrada != null) {
			System.out.println("La película existe.");
			System.out.println(peliculaEncontrada);
		} else {
			System.out.println("La película no existe.");
		}
	}

	public void buscarPeliculaPorGenero() {
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

	public void devolverPelicula(){

	}


}
