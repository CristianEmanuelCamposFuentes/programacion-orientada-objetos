package Colecciones.Ejercicios.Ejercicio5.Ejercicio;

/*5.
		Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
		usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
		conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
		si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
		los servicios en la clase correspondiente)
		Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
		cómo se ordena un conjunto.
		Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
		buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
		usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
		al usuario.*/


import Colecciones.Ejercicios.Ejercicio5.Servicios.PaisServices;

import java.util.Scanner;

public class Ejercicio5 {
	public static Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public static void main(String[] args) {

		PaisServices paisService = new PaisServices();

		while (true) {
			System.out.print("Ingrese un país (o 'salir' para terminar): ");
			String paisNombre = lector.nextLine();

			if (paisNombre.equalsIgnoreCase("salir")) {
				break;
			}
			paisService.agregarPais(paisNombre);
		}

		paisService.mostrarPaises();

		System.out.print("Ingrese el nombre del país que desea eliminar: ");
		String paisEliminar = lector.nextLine();
		paisService.eliminarPais(paisEliminar);

		paisService.mostrarPaises();
	}
}
