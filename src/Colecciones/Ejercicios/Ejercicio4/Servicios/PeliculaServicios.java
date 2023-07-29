package Colecciones.Ejercicios.Ejercicio4.Servicios;

import Colecciones.Ejercicios.Ejercicio4.Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Colecciones.Ejercicios.Ejercicio4.Ejercicio.Ejercicio4.lector;

public class PeliculaServicios {
	public List<Pelicula> listaPeliculas = new ArrayList<>();
	public void crearPelicula(){
		boolean salir = true;

		do{
			Pelicula peliculaNueva = new Pelicula();

			System.out.println("Por favor ingrese el nombre de pelicula: ");
			peliculaNueva.setTitulo(lector.next());

			System.out.println("Por favor ingrese el director de pelicula: ");
			peliculaNueva.setDirector(lector.next());

			System.out.println("Por favor ingrese la duracion en horas de pelicula: ");
			peliculaNueva.setDuracionEnHoras(lector.nextDouble());

			System.out.println(peliculaNueva);

			listaPeliculas.add(peliculaNueva);
			System.out.println("Pelicula creada y agregada a la lista. ");
			System.out.println("Desea ingresar otra pelicula? (Si) / (No)");

			if(lector.next().equalsIgnoreCase("no")){
				salir = false;
			}

		} while( salir );

	}

	public void mostrarLista(){
		for (Pelicula peliActual: listaPeliculas) {
			System.out.println(peliActual);
		}
	}

	public void pelisMenorUnaHora(){
		Iterator<Pelicula> iterador = listaPeliculas.iterator();

	double duracionDeHoras = 1;

		// Condicion que verifica si hay un siguiente elemento
		while(iterador.hasNext()){

			// Creo un pelicula que va a ser cada elemento dentro de la lista que voy iterando, asi
			// Java sabe a que elemento tiene que ir utilizando en la iteracion que sea en ese momento
			Pelicula peliActual = iterador.next();

			if(peliActual.getDuracionEnHoras() > duracionDeHoras){
				System.out.println(iterador);

			}
		}
	}


	public void mostrarMenu() {
		// Variable de salida
		boolean salir = false;
		while (!salir) {
			System.out.println("==== Menú ====");
			System.out.println("1. Agregar película");
			System.out.println("2. Mostrar todas las películas");
			System.out.println("3. Mostrar películas con duración mayor a 1 hora");
			System.out.println("4. Ordenar películas por duración (mayor a menor)");
			System.out.println("5. Ordenar películas por duración (menor a mayor)");
			System.out.println("6. Ordenar películas por título");
			System.out.println("7. Ordenar películas por director");
			System.out.println("8. Salir");

			int opcion = lector.nextInt();

			switch (opcion) {
				case 1:
					crearPelicula();
					break;
				case 2:
					mostrarLista();
					break;
				case 3:
					pelisMenorUnaHora();
					break;
				case 4:
					ordenarPorDuracionMayorAMenor();
					System.out.println("Películas ordenadas por duración (mayor a menor):");
					mostrarLista();
					break;
				case 5:
					ordenarPorDuracionMenorAMayor();
					System.out.println("Películas ordenadas por duración (menor a mayor):");
					mostrarLista();
					break;
				case 6:
					ordenarPorTitulo();
					System.out.println("Películas ordenadas por título:");
					mostrarLista();
					break;
				case 7:
					ordenarPorDirector();
					System.out.println("Películas ordenadas por director:");
					mostrarLista();
					break;
				case 8:
					salir = true;
					break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
			}
		}
	}
}
