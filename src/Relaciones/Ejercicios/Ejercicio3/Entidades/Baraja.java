package Relaciones.Ejercicios.Ejercicio3.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
	// Separamos la logica en las cartas totales y en el mazo que quede mientras se va jugando
	private List<Carta> cartas;
	private List<Carta> mazo;

	public Baraja(){
		// Cuando se invoca el constructor de la Baraja, se crea los palos y se le asigna los numeros
		cartas = new ArrayList<>();
		mazo = new ArrayList<>();

		String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

		for(int numero = 1; numero <= 12; numero++){
			// Validacion para que no incluya 8 y 9
			if (numero != 8 && numero != 9) {
				// Foreach para recorrer cada palo y agregamos junto al numero a cada nueva Carta
				for (String palo: palos) {
					// Al List, le agrego un nuevo objeto Carta, donde paso por dos parametros numero y palo
					cartas.add(new Carta(numero, palo));
				}
			}
		}
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public List<Carta> getMazo() {
		return mazo;
	}
}
