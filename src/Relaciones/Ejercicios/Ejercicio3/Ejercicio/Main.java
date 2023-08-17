package Relaciones.Ejercicios.Ejercicio3.Ejercicio;

import Relaciones.Ejercicios.Ejercicio3.Entidades.Carta;
import Relaciones.Ejercicios.Ejercicio3.Servicios.JuegoServices;

import java.util.List;
import java.util.Scanner;

/*
* 3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
* */
public class Main {
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) {
		// Primero la instancia de servicios para obtener los metodos
		JuegoServices juegoNuevo = new JuegoServices();

		int opcion;

		do {
			System.out.println("\n*** Menú ***");
			System.out.println("1. Barajar");
			System.out.println("2. Siguiente Carta");
			System.out.println("3. Dar Cartas");
			System.out.println("4. Mostrar Montón");
			System.out.println("5. Mostrar Baraja");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = lector.nextInt();

			switch (opcion) {
				case 1:
					juegoNuevo.barajar();
					System.out.println("Barajando...");
					break;
				case 2:
					Carta siguiente = juegoNuevo.siguienteCarta();
					if (siguiente != null) {
						System.out.println("Siguiente carta: " + siguiente);
					}
					break;
				case 3:
					System.out.print("Ingrese el número de cartas a dar: ");
					int cantidad = lector.nextInt();
					List<Carta> cartasDadas = juegoNuevo.darCartas(cantidad);
					if (cartasDadas != null) {
						System.out.println("Cartas dadas:");
						for (Carta carta : cartasDadas) {
							System.out.println(carta);
						}
					}
					break;
				case 4:
					juegoNuevo.cartasMonton();
					break;
				case 5:
					juegoNuevo.mostrarBaraja();
					break;
				case 6:
					System.out.println("Saliendo del juego.");
					break;
				default:
					System.out.println("Opción no válida.");
			}

		} while (opcion != 6);
	}
}
