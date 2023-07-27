package Colecciones.Ejercicios.Ejercicio2.Ejercicio;

import Colecciones.Ejercicios.Ejercicio1.Servicios.PerroServicios;

import java.util.Scanner;

/*2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
		un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
		está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
		ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
		la lista ordenada.*/
public class Ejercicio2 {
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
