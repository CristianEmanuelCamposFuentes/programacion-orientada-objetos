package Actividades.actividadAprendExtra05.Servicios;

import Actividades.actividadAprendExtra05.Entidad.MesJuego;

import java.util.Scanner;

public class MesJuegoServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");

	public void adivinarMes(){
		boolean adivinado = false;
		// Creamos el objeto para poder tener los valores de referencia
		MesJuego juego = new MesJuego();

		do{
			System.out.println("Ingrese el mes secreto: ");
			String mesSecreto = lector.nextLine();

			if(mesSecreto.equals(juego.getMesSecreto())){
				System.out.println("Ha acertado !!!");
				adivinado = true;
			} else {
				System.out.println("No ha acertado, reintente !");
			}
		} while (!adivinado);

		System.out.println("Juego finalizado. Adios !");
	}
}
