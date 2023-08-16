package Relaciones.Ejercicios.Ejercicio2.Entidades;

import java.util.List;

public class Juego {
	private List<Jugador> jugadoresCreados;
	private RevolverDeAgua revolver;

	public void llenarJuego(List<Jugador> jugadores, RevolverDeAgua revolver) {
		this.jugadoresCreados = jugadores;
		this.revolver = revolver;
	}

	public void ronda() {
		int jugadorActual = 0;

		while (true) {
			Jugador jugador = jugadoresCreados.get(jugadorActual);
			System.out.println("Jugador " + (jugadorActual + 1) + " apunta...");

			if (jugador.disparo(revolver)) {
				System.out.println(jugador + " ¡MOJADO!!! ");
				break;
			} else {
				System.out.println(jugador + " a salvo. Siguiente ronda.");
				// Si el jugadorActual es el último jugador de la lista, se vuelve al primer jugador.
				/*Ejemplo, si son 4 jugadores, y esta jugando el ultimo jugador (seria el indice numero 3),
				* la formula seria ( 3 INDICE + 1 ) % 4 JUGADORES
				* (3 + 1) % 4 es lo mismo que decir 4 % 4 , y el resto da como resultado cero (0)
				* con esto nos aseguramos que siempre en el ultimo paso se va a volver al final */

				jugadorActual = (jugadorActual + 1) % jugadoresCreados.size();
			}
		}
	}


}
