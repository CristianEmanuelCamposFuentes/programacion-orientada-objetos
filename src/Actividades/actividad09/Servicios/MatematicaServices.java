package Actividades.actividad09.Servicios;

import Actividades.actividad09.Entidades.Matematica;

public class MatematicaServices {
	public Matematica crearNumero() {
		System.out.println("Numero creado exitosamente.");
		return new Matematica();
	}
}
