package Colecciones.Ejercicios.Ejercicio4.Servicios;

import Colecciones.Ejercicios.Ejercicio4.Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Comparator;
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

		// Seteo una variable con la que voy a comparar cada elemento
	double duracionDeHoras = 1;

		// Condicion que verifica si hay un siguiente elemento para iterar, si no hay nada para analizar retorna false
		// y sale del bucle
		while(iterador.hasNext()){

			// Creo un pelicula que va a ser cada elemento dentro de la lista que voy iterando, asi
			// Java sabe a que elemento tiene que ir utilizando en la iteracion que sea en ese momento
			Pelicula peliActual = iterador.next();

			if(peliActual.getDuracionEnHoras() > duracionDeHoras){
				System.out.println(iterador);

			}
		}
	}

	// En este prestar atencion a como se encadena el metodo sort (ordena) y el metodo reversed (invierte los elementos)
	public void ordenarPorDuracionMayorAMenor() {
		// Necesita saber que atributo se va a ordenar, por eso se pide a traves del get, la misma logica
		// Se aplica al resto
		listaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracionEnHoras).reversed());
	}

	public void ordenarPorDuracionMenorAMayor() {
		listaPeliculas.sort(Comparator.comparingDouble(Pelicula::getDuracionEnHoras));
	}

	public void ordenarPorTitulo() {
		listaPeliculas.sort(Comparator.comparing(Pelicula::getTitulo));
	}

	public void ordenarPorDirector() {
		listaPeliculas.sort(Comparator.comparing(Pelicula::getDirector));
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

	public void cargarPeliculasFamosas() {
		// Crear algunas películas famosas y agregarlas a la lista para que sea interactivo desde el inicio
		listaPeliculas.add(new Pelicula("The Shawshank Redemption", "Frank Darabont", 2.22));
		listaPeliculas.add(new Pelicula("The Godfather", "Francis Ford Coppola", 2.55));
		listaPeliculas.add(new Pelicula("The Dark Knight", "Christopher Nolan", 2.32));
		listaPeliculas.add(new Pelicula("Pulp Fiction", "Quentin Tarantino", 2.34));
		listaPeliculas.add(new Pelicula("Inception", "Christopher Nolan", 2.28));
		listaPeliculas.add(new Pelicula("Toy Story", "John Lasseter", 1.21));
		listaPeliculas.add(new Pelicula("Finding Nemo", "Andrew Stanton", 1.40));
		listaPeliculas.add(new Pelicula("The Lion King", "Roger Allers", 1.29));
		listaPeliculas.add(new Pelicula("Spirited Away", "Hayao Miyazaki", 2.05));
		listaPeliculas.add(new Pelicula("Frozen", "Chris Buck", 1.42));
	}
}
