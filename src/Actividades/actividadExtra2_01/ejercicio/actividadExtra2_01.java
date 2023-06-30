package Actividades.actividadExtra2_01.ejercicio;

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
			System.out.println("9. Salir");
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
					servicioP.cargarAlquiler();
					break;
				case 4:
					servicioP.listarAlquileres();
					break;
				case 5:
					servicioP.buscarPeliculaPorTitulo();
					break;
				case 6:
					servicioP.buscarPeliculaPorGenero();
					break;
				case 7:
					servicioP.buscarAlquilerPorFecha();
					break;
				case 8:
					servicioP.calcularIngresoTotal();
					break;
				case 9:
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
