package Colecciones.Videos.Video1.Servicios;

import Colecciones.Videos.Video1.Entidades.Mascota;

import java.util.Scanner;

public class MascotaServicios {
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public Mascota crearMascota(){
		System.out.println("Introducir nombre: ");
		String nombre  = lector.nextLine();

		System.out.println("Introducir apodo: ");
		String apodo  = lector.nextLine();

		System.out.println("Introducir tipo: ");
		String tipo  = lector.nextLine();

		return new Mascota(nombre, apodo, tipo);
	}
}
