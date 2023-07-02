package Actividades.actividadExtra2_01.Servicio;

import Actividades.actividadExtra2_01.Entidad.Alquiler;
import Actividades.actividadExtra2_01.Entidad.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AlquilerService {
	Scanner scanner = new Scanner(System.in).useDelimiter("\n");
	// Esta variable va a ser la referencia a la lista de peliculas que
	// traemos de PeliculaService
	private PeliculaService peliculaService;
	private List<Alquiler> alquileres;

	public AlquilerService(PeliculaService peliculaService) {
		this.peliculaService = peliculaService;
		alquileres = new ArrayList<>();
	}

	public void cargarAlquiler() {
		System.out.println("=== CARGAR ALQUILER ===");


		// Buscar la película por título en el servicio de películas
		Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo();

		if (pelicula != null) {
			// Si la pelicula esta alquilada no se puede alquilar
			if (pelicula.getEstaAlquilada()) {
				System.out.println("La película no está disponible para alquilar.");
			} else {

				System.out.println("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
				String fechaInicioStr = scanner.nextLine();

				// Convertir las fechas a objetos Date usando SimpleDateFormat, esto le da el formato de la fecha
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

				Date fechaInicio;
				Date fechaFin;

				// * El try funciona para manejar las excepciones (tipos de errores), aca adentro intentamos
				// * cambiar cada fecha que ingresamos de tipo String (fechaInicioStr ) a tipo
				//  * Date, si no puede y tira error entonces va y ejecuta lo que dicta el catch
				try {
					// Intenta pasar la string fechaInicioStr a una variable tipo Date llamada fechaInicio
					fechaInicio = dateFormat.parse(fechaInicioStr);

					// Calcular la fecha de fin sumando 3 días a la fecha de inicio
					// Esto crea una nueva instancia de la clase Calendario, o sea, crea un nuevo dia
					Calendar calendar = Calendar.getInstance();
					// Igualo ese dia creado al Dia de la fechaInicio
					calendar.setTime(fechaInicio);
					// Ahora le agrego 3 dias mas a ese dia
					calendar.add(Calendar.DAY_OF_MONTH, 3);
					// El valor de la fecha + 3 dias lo asigno a la variable fechaFin
					fechaFin = calendar.getTime();


					// El catch se ejecuta si lo del try no se pudo hacer, ParseException indica el tipo de error (excepcion)
					// y 'e' es el nombre por defecto, viene de 'e'xcepcion
				} catch (ParseException e) {
					// Mensaje de error y cortamos el ciclo con el return
					System.out.println("Formato de fecha incorrecto. El alquiler no se pudo registrar.");
					return;
				}

				// Calcular el precio del alquiler base por 3 dias
				double precioAlquiler = 3 * 10;

				// Crear un objeto Alquiler con los datos ingresados
				Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precioAlquiler);

				// Agregar el objeto Alquiler a la lista de alquileres
				alquileres.add(alquiler);

				// Marcar la película como alquilada
				pelicula.setEstaAlquilada(true);

				System.out.println("El alquiler por los siguientes 3 dias es de : $" + precioAlquiler + ".");
				System.out.println("Pasado ese tiempo, se cobra recarga de 10% de interes por cada dia extra.");

				System.out.println("El alquiler se ha registrado exitosamente.");
			}
		} else {
			System.out.println("El alquiler no se pudo registrar. No existe la pelicula.");
		}
	}

	public void calcularIngresoTotal() {
		System.out.println("=== CALCULAR PRECIO DE ALQUILER ===");

		// Obtener la fecha de inicio del alquiler
		System.out.println("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
		String fechaInicioStr = scanner.nextLine();

		// Obtener la fecha de fin del alquiler
		System.out.println("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
		String fechaFinStr = scanner.nextLine();
// Precio base del alquiler, que es de $10
		double precioBase = 10;

// Incremento por día extra, que es el 10% del precio base
		double incrementoPorDiaExtra = 0.1 * precioBase;

// Duración fija del alquiler, que es de 3 días
		long duracionAlquiler = 3;

// Crear instancias de Calendar y establecer las fechas de inicio y fin
		Calendar calInicio = Calendar.getInstance();
		Calendar calFin = Calendar.getInstance();

// Establecer las fechas a partir de las cadenas de texto
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
// Cada fecha la pasa a tipo Calendar
			calInicio.setTime(dateFormat.parse(fechaInicioStr));
			calFin.setTime(dateFormat.parse(fechaFinStr));
		} catch (ParseException e) {
			System.out.println("Formato de fecha incorrecto. El cálculo del precio de alquiler no se pudo realizar.");
			return;
		}

// Obtener la diferencia en días entre las fechas, 24hs x 60seg x 60min x 1000 milisegundos. Eso es lo que convierte un milisegundo a dia
		long diferenciaDias = (calFin.getTimeInMillis() - calInicio.getTimeInMillis()) / (24 * 60 * 60 * 1000);

// Calcular los días extras de alquiler teniendo en cuenta la duración fija del alquiler
// Si la resta da negativa, toma el valor 0 que esta primero( max calcula el maximo entre los dos argumentos)
		long diasExtras = Math.max(0, diferenciaDias - duracionAlquiler);

// Cálculo del precio total del alquiler sumando el precio base y multiplicando los días extras por el incremento por día extra
		double precioTotal = precioBase + diasExtras * incrementoPorDiaExtra;

		System.out.println(precioTotal);
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

	// Getters y Setters

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

