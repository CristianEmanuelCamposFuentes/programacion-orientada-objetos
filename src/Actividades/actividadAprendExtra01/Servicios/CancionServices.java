package Actividades.actividadAprendExtra01.Servicios;

import Actividades.actividadAprendExtra01.Entidades.Cancion;

import java.util.Scanner;

public class CancionServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public Cancion crearCancion() {
		System.out.println("Ingrese el titulo de la cancion: ");
		String nombreCancion = lector.nextLine();

		System.out.println("Ingrese el nombre del autor: ");
		String nombreAutor = lector.nextLine();

		System.out.println("Cancion creada correctamente...");
		return new Cancion(nombreCancion, nombreAutor);
	}
}
