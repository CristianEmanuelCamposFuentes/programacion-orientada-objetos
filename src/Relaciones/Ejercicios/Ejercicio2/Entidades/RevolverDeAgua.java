package Relaciones.Ejercicios.Ejercicio2.Entidades;

import java.util.Random;

public class RevolverDeAgua {
	private int posicionActual;
	private int posicionAgua;

	public void llenarRevolver(){
		Random random = new Random();
		// Posiciones entre 0 y 5
		posicionActual = random.nextInt(6);
		posicionAgua = random.nextInt(6);
	}

	public RevolverDeAgua() {
	}

	public boolean mojar(){
		// Si es verdadera la condicion, devuelve true, sino devuelve false
		return posicionAgua == posicionActual;
	}

	public void siguienteChorro(){
		// Si el revolver ya esta en la posicion final del cargador, vuelve a la posicion cero, sino sigue
		// en la posicion siguiente
		if (posicionActual == 5){
			posicionActual = 0;
		} else {
			posicionActual++;
		}
	}

	@Override
	public String toString() {
		return "RevolverDeAgua{" +
				"posicionActual=" + posicionActual +
				", posicionAgua=" + posicionAgua +
				'}';
	}
}
