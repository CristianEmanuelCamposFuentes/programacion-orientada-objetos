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
	private List<Alquiler> alquileres;

	// ! Se utiliza el constructor para que cada lista este inicializada, entonces se
	// ! puedan agregar valores, sino serian null y eso en java NO ESTA PERMITIDO
	public PeliculaService() {
		peliculas = new ArrayList<>();
		alquileres = new ArrayList<>();
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

		Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion, estaAlquilada);
		peliculas.add(pelicula);

		System.out.println("La película se ha cargado exitosamente.");
	}

	public void listarPeliculasDisponibles() {
		System.out.println("Películas disponibles:");
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula);
		}
	}

	public void cargarAlquiler() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el título de la película a alquilar: ");
		String titulo = scanner.nextLine();

		Pelicula pelicula = buscarPeliculaPorTitulo(titulo);
		if (pelicula != null) {
			System.out.println("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
			String fechaInicioStr = scanner.nextLine();

			System.out.println("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
			String fechaFinStr = scanner.nextLine();

			// Convertir las fechas a objetos Date usando SimpleDateFormat
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaInicio, fechaFin;
			try {
				fechaInicio = dateFormat.parse(fechaInicioStr);
				fechaFin = dateFormat.parse(fechaFinStr);
			} catch (ParseException e) {
				System.out.println("Formato de fecha incorrecto. El alquiler no se pudo registrar.");
				return;
			}

			// Calcular el precio del alquiler
			double precioAlquiler = calcularPrecioAlquiler(pelicula.getDuracion(), fechaInicio, fechaFin);

			// Crear un objeto Alquiler con los datos ingresados
			Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precioAlquiler);

			// Agregar el objeto Alquiler a la lista de alquileres
			alquileres.add(alquiler);

			System.out.println("El alquiler se ha registrado exitosamente.");
		} else {
			System.out.println("La película no está disponible para alquilar.");
		}
	}

	public void buscarPeliculaPorTitulo(String tituloPelicula) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el título de la película a buscar: ");
		String titulo = scanner.nextLine();

		Pelicula pelicula = buscarPeliculaPorTitulo(titulo);
		if (pelicula != null) {
			System.out.println("La película existe.");
			System.out.println(pelicula);
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

	public void listarAlquileres() {
		System.out.println("Alquileres realizados:");
		for (Alquiler alquiler : alquileres) {
			System.out.println(alquiler);
		}
	}


	private double calcularPrecioAlquiler(int duracion, Date fechaInicio, Date fechaFin) {
		// Calcular la duración del alquiler en días
		long duracionAlquiler = (fechaFin.getTime() - fechaInicio.getTime()) / (24 * 60 * 60 * 1000);

		// Calcular el precio base del alquiler
		double precioBase = 10;

		// Calcular el incremento por cada día extra
		double incrementoPorDiaExtra = 0.1 * precioBase;

		// Calcular el precio total del alquiler
		double precioTotal = precioBase + (duracionAlquiler - 3) * incrementoPorDiaExtra;

		return precioTotal;
	}




}
