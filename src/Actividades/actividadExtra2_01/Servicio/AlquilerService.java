package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.util.Date;

public class AlquilerService {
	private Pelicula[] peliculas;
	private Alquiler[] alquileres;
	private int peliculasCount;
	private int alquileresCount;

	public AlquilerService() {
		peliculas = new Pelicula[10];
		alquileres = new Alquiler[10];
		peliculasCount = 0;
		alquileresCount = 0;
	}

	public void cargarPelicula(String titulo, String genero, int anio, int duracion) {
		if (peliculasCount < peliculas.length) {
			Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
			peliculas[peliculasCount] = pelicula;
			peliculasCount++;
			System.out.println("La película se ha cargado exitosamente.");
		} else {
			System.out.println("No se pueden cargar más películas. La lista está llena.");
		}
	}

	public void listarPeliculasDisponibles() {
		if (peliculasCount > 0) {
			System.out.println("Películas disponibles:");
			for (int i = 0; i < peliculasCount; i++) {
				System.out.println(peliculas[i]);
			}
		} else {
			System.out.println("No hay películas disponibles.");
		}
	}

	public void cargarAlquiler(int peliculaIndex, Date fechaInicio, Date fechaFin) {
		if (peliculaIndex >= 0 && peliculaIndex < peliculasCount) {
			Pelicula pelicula = peliculas[peliculaIndex];
			double precio = calcularPrecioAlquiler(pelicula.getDuracion(), fechaInicio, fechaFin, precio);
			alquileres[alquileresCount] = alquiler;
			alquileresCount++;
			System.out.println("El alquiler se ha registrado exitosamente.");
		} else {
			System.out.println("Índice de película inválido.");
		}
	}

	public void listarAlquileresRealizados() {
		if (alquileresCount > 0) {
			System.out.println("Alquileres realizados:");
			for (int i = 0; i < alquileresCount; i++) {
				System.out.println(alquileres[i]);
			}
		} else {
			System.out.println("No se han realizado alquileres.");
		}
	}

	private double calcularPrecioAlquiler(int duracion, Date fechaInicio, Date fechaFin) {
		long duracionAlquiler = (fechaFin.getTime() - fechaInicio.getTime()) / (24 * 60 * 60 * 1000);
		double precioBase = 10;
		double incrementoPorDiaExtra = 0.1 * precioBase;
		double precioTotal = precioBase + (duracionAlquiler - 3) * incrementoPorDiaExtra;
		return Math.round(precioTotal * 100) / 100.0;
	}
}
