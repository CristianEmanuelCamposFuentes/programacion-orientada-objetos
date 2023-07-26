package Colecciones.Videos.Video1.mascotaApp;

import Colecciones.Videos.Video1.Servicios.MascotaServicios;

import java.util.ArrayList;

public class MascotaApp {
	private static final String SEPARADOR = "      =====      ";
	public static void main(String[] args) {
	// Crear la instancia del servicio
		MascotaServicios MS = new MascotaServicios();

		System.out.println("Inicio del programa.");
		System.out.println(SEPARADOR);

		// Creamos la primera mascota
		MS.crearMascota();

		// Agrego otra
		MS.crearMascota();




		MS.mostrarMascotas();
	}
}
