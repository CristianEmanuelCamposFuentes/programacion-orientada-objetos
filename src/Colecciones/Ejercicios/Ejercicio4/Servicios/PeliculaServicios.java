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

			// Creo un perrito que va a ser cada elemento dentro de la lista que voy iterando
			Pelicula peliActual = iterador.next();

			if(peliActual.getDuracionEnHoras() > duracionDeHoras){
				System.out.println(iterador);

			}
		}
	}


}
