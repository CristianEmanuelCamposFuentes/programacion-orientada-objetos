package Actividades.actividadExtra2_01.ejercicio;

/* * Ejercicio 1:
		Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
		que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
		una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
		el precio.
		El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
		los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
		manipular los textos.
		El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
		realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
		disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
		alquileres por fecha.

		Metodos de ambas entidades (realizar los metodos en las clases de
		servicio):

		Crear Película
		Crear Alquiler
		Listar todas las películas disponibles
		Listar todas los alquileres
		Buscar una película por título (Decir si se existe o no)
		Buscar una película por género (Decir si se existe o no)
		Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
		Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
		interés.)
		El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
		contrario. El programa debe terminar cuando el usuario elija la opción de salir.

		Deben:
		Se deben crear al menos 5 películas, junto con todos sus datos.
		Se deben realizar 3 alquileres de películas.
		Mostrar todas las películas cargadas.
		Mostrar todos los alquileres realizados.
		Será importante que al realizar el programa, hacer sus respectivos servicios (AlquilerService y PeliculaService).
		*/


import Actividades.actividadExtra2_01.Servicio.AlquilerService;
import Actividades.actividadExtra2_01.Servicio.PeliculaService;

import java.util.Scanner;

public class actividadExtra2_01 {
	public static void main(String[] args) {
		PeliculaService servicioP = new PeliculaService();
		AlquilerService servicioA = new AlquilerService();
		Scanner scanner = new Scanner(System.in);

		boolean salir = false;
		while (!salir) {
			System.out.println("Menú Principal");
			System.out.println("1. Cargar película");
			System.out.println("2. Listar películas disponibles");
			System.out.println("3. Realizar alquiler");
			System.out.println("4. Listar alquileres");
			System.out.println("5. Buscar película por título");
			System.out.println("6. Buscar película por género");
			System.out.println("7. Buscar alquiler por fecha");
			System.out.println("8. Calcular ingreso total");
			System.out.println("9. Devolver pelicula");
			System.out.println("0. Salir");
			System.out.println("Ingrese una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					servicioP.cargarPelicula();
					break;
				case 2:
					servicioP.listarPeliculasDisponibles();
					break;
				case 3:
					servicioA.cargarAlquiler();
					break;
				case 4:
					servicioA.listarAlquileres();
					break;
				case 5:
					servicioP.buscarPeliculaPorTitulo();
					break;
				case 6:
					servicioP.buscarPeliculaPorGenero();
					break;
				case 7:
					servicioA.buscarAlquilerPorFecha();
					break;
				case 8:
					servicioA.calcularIngresoTotal();
					break;
				case 9:
					servicioA.devolverPelicula();

				case 0:
					salir = true;
					System.out.println("¡Hasta luego!");
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
					break;
			}
		}
	}
}
