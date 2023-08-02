package Colecciones.Ejercicios.EjAprendExtra1.Ejercicio;

import Colecciones.Ejercicios.EjAprendExtra1.Servicios.NumeroServices;

public class EjAprendExtra1 {
	public static void main(String[] args) {
		NumeroServices NS = new NumeroServices();
		NS.leerNumeros();

		// Mostrar resultados
		System.out.println("Cantidad de valores leídos: " + NS.CantidadValores());
		System.out.println("Suma de los valores: " + NS.SumaValores());
		System.out.println("Promedio de los valores: " + NS.PromedioValores());
	}
}
