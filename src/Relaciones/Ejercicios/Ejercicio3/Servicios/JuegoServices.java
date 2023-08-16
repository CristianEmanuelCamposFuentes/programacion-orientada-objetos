package Relaciones.Ejercicios.Ejercicio3.Servicios;

import Relaciones.Ejercicios.Ejercicio3.Entidades.Baraja;

public class JuegoServices {
	private Baraja baraja;

	private JuegoServices(){
		baraja = new Baraja();
		baraja.barajar();
	}



}
