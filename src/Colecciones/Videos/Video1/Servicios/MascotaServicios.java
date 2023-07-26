package Colecciones.Videos.Video1.Servicios;

import Colecciones.Videos.Video1.Entidades.Mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MascotaServicios {
	public Scanner lector;
	private List<Mascota> mascotas;

	public MascotaServicios() {
		this.lector = new Scanner(System.in).useDelimiter("\n");
		this.mascotas = new ArrayList<>();
	}

	public void crearMascota(){
		System.out.println("Introducir nombre: ");
		String nombre  = lector.nextLine();

		System.out.println("Introducir apodo: ");
		String apodo  = lector.nextLine();

		System.out.println("Introducir tipo: ");
		String tipo  = lector.nextLine();

		// Agrego directamente una nueva instancia de la mascota que estamos creando
		mascotas.add(new Mascota(nombre, apodo, tipo));

	}

	public void mostrarMascotas(){
		System.out.println("Las mascotas agregadas son: ");
		for (Mascota mascotita: mascotas){
			System.out.println(mascotita);
		}
	}
}
