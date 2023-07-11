package Actividades.actividad01.Servicios;

import Actividades.actividad01.Entidades.Libro;

import java.util.Scanner;
public class LibroServices {
	public Libro crearLibro(){
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese el ISBN del libro");
		int ISBN = lector.nextInt();
//		! Limpieza del buffer de entrada, para que no tome el espacio como input
		lector.nextLine();

		System.out.println("Ingrese el titulo del libro");
		String titulo = lector.nextLine();

		System.out.println("Ingrese el autor del libro");
		String autor = lector.nextLine();

		System.out.println("Ingrese la cantidad de paginas del libro");
		int cantidadPaginas = lector.nextInt();

		// Creamos el objeto Libro vacio
		Libro nuevoLibro = new Libro();

		// Libro creado con parametros
		Libro libroConParametros = new Libro(ISBN, titulo, autor, cantidadPaginas);

		// Asignamos valores a los atributos del libro
		nuevoLibro.setISBN(ISBN);
		nuevoLibro.setTitulo(titulo);
		nuevoLibro.setAutor(autor);
		nuevoLibro.setCantidadPaginas(cantidadPaginas);

		System.out.println("Libro creado.");
		return nuevoLibro;
	}

	public void devolverLibro(Libro libro){
		System.out.println("Lectura del libro:");
		System.out.println("Titulo: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("Codigo ISBN: " + libro.getISBN());
		System.out.println("Cantidad de paginas: " + libro.getCantidadPaginas());
	}
}
