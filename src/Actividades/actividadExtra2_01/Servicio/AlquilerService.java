package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.util.ArrayList;
import java.util.Date;

public class AlquilerService {
	private Pelicula[] peliculas;
	private Alquiler[] alquileres;
	private int peliculasCount;
	private int alquileresCount;

	public AlquilerService() {
//		peliculas = new Pelicula[10];
//		alquileres = new Alquiler[10];
//		peliculasCount = 0;
//		alquileresCount = 0;
		alquileres = new ArrayList<>();
	}


	public void cargarAlquiler(int peliculaIndex, Date fechaInicio, Date fechaFin) {
		if (peliculaIndex >= 0 && peliculaIndex < peliculasCount) {
			Pelicula pelicula = peliculas[peliculaIndex];
			double precio = calcularIngresoTotal(pelicula.getDuracion(), fechaInicio, fechaFin);
			alquileres[alquileresCount] = alquileres[peliculaIndex];
			alquileresCount++;
			System.out.println("El alquiler se ha registrado exitosamente.");
		} else {
			System.out.println("Índice de película inválido.");
		}
	}


//	public void cargarAlquiler() {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Ingrese el título de la película a alquilar: ");
//		String titulo = scanner.nextLine();
//
//		Pelicula pelicula = buscarPeliculaPorTitulo(titulo);
//		if (pelicula != null) {
//			System.out.println("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
//			String fechaInicioStr = scanner.nextLine();
//
//			System.out.println("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
//			String fechaFinStr = scanner.nextLine();
//
//			// Convertir las fechas a objetos Date usando SimpleDateFormat
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//			Date fechaInicio, fechaFin;
//			try {
//				fechaInicio = dateFormat.parse(fechaInicioStr);
//				fechaFin = dateFormat.parse(fechaFinStr);
//			} catch (ParseException e) {
//				System.out.println("Formato de fecha incorrecto. El alquiler no se pudo registrar.");
//				return;
//			}
//
//			// Calcular el precio del alquiler
//			double precioAlquiler = calcularPrecioAlquiler(pelicula.getDuracion(), fechaInicio, fechaFin);
//
//			// Crear un objeto Alquiler con los datos ingresados
//			Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precioAlquiler);
//
//			// Agregar el objeto Alquiler a la lista de alquileres
//			alquileres.add(alquiler);
//
//			System.out.println("El alquiler se ha registrado exitosamente.");
//		} else {
//			System.out.println("La película no está disponible para alquilar.");
//		}
//	}

	public void listarAlquileres() {
		if (alquileresCount > 0) {
			System.out.println("Alquileres realizados:");
			for (int i = 0; i < alquileresCount; i++) {
				System.out.println(alquileres[i]);
			}
		} else {
			System.out.println("No se han realizado alquileres.");
		}
	}

//	public void listarAlquileres() {
//		System.out.println("Alquileres realizados:");
//		for (Alquiler alquiler : alquileres) {
//			System.out.println(alquiler);
//		}
//	}

	public void buscarAlquilerPorFecha(){
		System.out.println("Lista de alquileres realizados por fecha: ");
		for (alquilerFecha: alquileres) {
			System.out.println(alquilerFecha.);
			System.out.println(alquilerFecha.getFecha());
		}
	}

	public double calcularIngresoTotal(int duracion, Date fechaInicio, Date fechaFin) {
		long duracionAlquiler = (fechaFin.getTime() - fechaInicio.getTime()) / (24 * 60 * 60 * 1000);
		double precioBase = 10;
		double incrementoPorDiaExtra = 0.1 * precioBase;
		double precioTotal = precioBase + (duracionAlquiler - 3) * incrementoPorDiaExtra;
		return Math.round(precioTotal * 100) / 100.0;
	}

//	private double calcularPrecioAlquiler(int duracion, Date fechaInicio, Date fechaFin) {
//		// Calcular la duración del alquiler en días
//		long duracionAlquiler = (fechaFin.getTime() - fechaInicio.getTime()) / (24 * 60 * 60 * 1000);
//
//		// Calcular el precio base del alquiler
//		double precioBase = 10;
//
//		// Calcular el incremento por cada día extra
//		double incrementoPorDiaExtra = 0.1 * precioBase;
//
//		// Calcular el precio total del alquiler
//		double precioTotal = precioBase + (duracionAlquiler - 3) * incrementoPorDiaExtra;
//
//		return precioTotal;
//	}
}
