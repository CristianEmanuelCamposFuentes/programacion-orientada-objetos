package Colecciones.Ejercicios.Ejercicio1.Ejercicio;

/*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

import Colecciones.Ejercicios.Ejercicio1.Servicios.PerroServicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) {
		PerroServicios PS = new PerroServicios();
		int opcion;

		System.out.println("Inicio de programa.");

		do {
			System.out.println("Ingrese la raza: ");
			PS.agregarRaza();

			opcion = PS.preguntar();
		} while (opcion != 0);

		System.out.println("Saliendo, tu lista final es: " + PS.razasPerros);

		System.out.println("Programa finalizado.");


	}
}
