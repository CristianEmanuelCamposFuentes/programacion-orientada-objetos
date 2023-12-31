package Actividades.actividad01.actividad01;

import Actividades.actividad01.Entidades.Libro;
import Actividades.actividad01.Servicios.LibroServices;

/*
* 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
* Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
* constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
* luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
* numero de páginas.
*
*
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("Comienzo del programa.");

		// Instancia de servicio para poder acceder a los metodos
		LibroServices libroServicios = new LibroServices();

		// Crear un libro
		Libro libroCreado = libroServicios.crearLibro();

		libroServicios.devolverLibro(libroCreado);

	}
}