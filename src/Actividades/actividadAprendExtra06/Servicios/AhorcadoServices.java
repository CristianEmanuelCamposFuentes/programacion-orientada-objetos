package Actividades.actividadAprendExtra06.Servicios;

import Actividades.actividadAprendExtra06.Entidad.Ahorcado;

import java.util.Scanner;

public class AhorcadoServices {
	private String[] palabraEscondida;

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


	public void longitud(Ahorcado juego) {
		System.out.println("Longitud de la palabra: " + juego.getPalabraBuscada().length);
	}

	public void buscar(Ahorcado juego, String letra) {
		boolean encontrada = false;
		for (String l : juego.getPalabraBuscada()) {
			if (l.equals(letra)) {
				encontrada = true;
				break;
			}
		}
		if (encontrada) {
			System.out.println("Mensaje: La letra pertenece a la palabra");
		} else {
			System.out.println("Mensaje: La letra no pertenece a la palabra");
		}
	}

	public void encontradas(Ahorcado juego, String letra) {
		int encontradas = 0;
		int faltantes = 0;
		for (String l : juego.getPalabraBuscada()) {
			if (l.equals(letra)) {
				encontradas++;
			} else {
				faltantes++;
			}
		}
		System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
	}

	public void intentos(Ahorcado juego) {
		int oportunidadesRestantes = juego.getCantJugadasMax() - juego.getLetrasEncontradas();
		System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes);
	}

	public void juego(Ahorcado juego) {
		while (juego.getLetrasEncontradas() < juego.getCantJugadasMax()) {
			System.out.println("----------------------------------------------");
			System.out.println("Ingrese una letra:");
			String letra = lector.next();

			buscar(juego, letra);
			encontradas(juego, letra);
			intentos(juego);
			juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
		}
		System.out.println("----------------------------------------------");
		System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
	}
}

