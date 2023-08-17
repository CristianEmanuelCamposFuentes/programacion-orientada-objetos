package Relaciones.Ejercicios.Ejercicio3.Servicios;

import Relaciones.Ejercicios.Ejercicio3.Entidades.Baraja;
import Relaciones.Ejercicios.Ejercicio3.Entidades.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JuegoServices {
	private Baraja baraja;

	public JuegoServices(){
		baraja = new Baraja();
		barajar();
	}

	public void barajar(){
		// Mezclar las cartas , primer parametro pide la List, segundo con el new Randow alterna aleatoriamente
		Collections.shuffle(baraja.getCartas(), new Random());
	}

	public Carta siguienteCarta(){
		if (baraja.getCartas().isEmpty()) {
			System.out.println("No hay más cartas en la baraja.");
			return null;
		}
		Carta carta = baraja.getCartas().remove(0);
		baraja.getMazo().add(carta);
		return carta;
	}

	public int cartasDisponibles() {
		return baraja.getCartas().size();
	}

	public List<Carta> darCartas(int cantidad) {
		if (cantidad > baraja.getCartas().size()) {
			System.out.println("No hay suficientes cartas para dar.");
			return null;
		}
		List<Carta> cartasDadas = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			cartasDadas.add(siguienteCarta());
		}
		return cartasDadas;
	}

	public void cartasMonton() {
		if (baraja.getMazo().isEmpty()) {
			System.out.println("Aún no ha salido ninguna carta.");
		} else {
			System.out.println("Cartas en el montón:");
			for (Carta carta : baraja.getMazo()) {
				System.out.println(carta);
			}
		}
	}

	public void mostrarBaraja() {
		System.out.println("Cartas en la baraja:");
		for (Carta carta : baraja.getCartas()) {
			System.out.println(carta);
		}
	}



}
