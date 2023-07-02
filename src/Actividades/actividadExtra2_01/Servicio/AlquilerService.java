package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AlquilerService {
	// Esta variable va a ser la referencia a la lista de peliculas que
	// traemos de PeliculaService
	private PeliculaService peliculaService;
	private List<Alquiler> alquileres;


	public AlquilerService(PeliculaService peliculaService) {
		this.peliculaService = peliculaService;
		alquileres = new ArrayList<>();
	}

	public void cargarAlquiler() {
		Scanner scanner = new Scanner(System.in);

		// Buscar la película por título en el servicio de películas
		Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo();

		if (pelicula != null) {
			// Si la pelicula esta alquilada no se puede alquilar
			if (pelicula.getEstaAlquilada()) {
				System.out.println("La película no está disponible para alquilar.");
			} else {

				System.out.println("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
				String fechaInicioStr = scanner.nextLine();

				System.out.println("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
				String fechaFinStr = scanner.nextLine();

				// Convertir las fechas a objetos Date usando SimpleDateFormat, esto le da el formato de la fecha
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

				Date fechaInicio;
				Date fechaFin;

				// * El try funciona para manejar las excepciones (tipos de errores), aca adentro intentamos
				// * cambiar cada fecha que ingresamos de tipo String (fechaInicioStr y fechaFinStr) a tipo
				//  * Date, si no puede y tira error entonces va y ejecuta lo que dicta el catch
				try {
					// Intenta pasar la string fechaInicioStr a una variable tipo Date llamada fechaInicio
					fechaInicio = dateFormat.parse(fechaInicioStr);
					// Intenta pasar la string fechaFinStr a una variable tipo Date llamada fechaFin
					fechaFin = dateFormat.parse(fechaFinStr);

					// El catch se ejecuta si lo del try no se pudo hacer, ParseException indica el tipo de error (excepcion)
					// y 'e' es el nombre por defecto, viene de 'e'xcepcion
				} catch (ParseException e) {
					// Mensaje de error y cortamos el ciclo con el return
					System.out.println("Formato de fecha incorrecto. El alquiler no se pudo registrar.");
					return;
				}

				// Calcular el precio del alquiler
				double precioAlquiler = calcularPrecioAlquiler(pelicula.getDuracion(), fechaInicio, fechaFin);

				// Crear un objeto Alquiler con los datos ingresados
				Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precioAlquiler);

				// Agregar el objeto Alquiler a la lista de alquileres
				alquileres.add(alquiler);

				// Marcar la película como alquilada
				pelicula.setEstaAlquilada(true);

				System.out.println("El alquiler se ha registrado exitosamente.");
			}
		} else {
			System.out.println("El alquiler no se pudo registrar. No existe la pelicula.");
		}
	}

	public void listarAlquileres() {
		// Si la lista de alquileres no esta vacio recorrer lista e imprimir cada alquiler
		if (!alquileres.isEmpty()) {
			System.out.println("Alquileres realizados:");
			for (Alquiler alquiler : alquileres) {
				System.out.println(alquiler);
			}
		} else {
			System.out.println("No se han realizado alquileres.");
		}
	}

	public void buscarAlquilerPorFecha() {
		System.out.println("Lista de alquileres realizados por fecha: ");
		for (Alquiler alquiler : alquileres) {
			System.out.println(alquiler.getFechaInicio());
			System.out.println("Pelicula: " + alquiler.getPelicula());
		}
	}

	public double calcularPrecioAlquiler(int duracion, Date fechaInicio, Date fechaFin) {
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

	public void calcularIngresoTotal() {

	}

	public PeliculaService getPeliculaService() {
		return peliculaService;
	}

	public void setPeliculaService(PeliculaService peliculaService) {
		this.peliculaService = peliculaService;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
}

