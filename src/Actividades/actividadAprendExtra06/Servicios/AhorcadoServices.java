package Actividades.actividadAprendExtra06.Servicios;

import Actividades.actividadAprendExtra06.Entidad.Ahorcado;

import java.util.Scanner;

public class AhorcadoServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public Ahorcado crearJuego(){
		System.out.println("Elija la palabra inicial: ");
		String palabra = lector.nextLine();

		// Crear instancia de Ahorcado y establecer los valores
		String[] palabraBuscada = palabra.split(""); // Convierte la palabra en un arreglo de letras
		int letrasEncontradas = 0; // Inicialmente no se han encontrado letras
		int cantJugadasMax = 7; // Establecer el número máximo de jugadas

		return new Ahorcado(palabraBuscada, letrasEncontradas, cantJugadasMax);
	}

}
