package Actividades.actividad10.ejercicio;

import Actividades.actividad10.Entidades.Arreglo;
import Actividades.actividad10.Servicios.ArregloServices;

// * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//		de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//		programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//		Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//		ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//		0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//		20.
public class actividad10 {
	public static void main(String[] args) {
		ArregloServices servicios = new ArregloServices();

		System.out.println("Inicio de programa:");

		// Crear primer arreglo
		System.out.println("ARREGLO A:");
		Arreglo arreglo1 = servicios.crearArregloAleatorio(50);
		servicios.imprimirArreglo(arreglo1);

		// Crear segundo arreglo
		System.out.println("ARREGLO B:");
		Arreglo arreglo2 = servicios.crearArregloVacio(20);
		servicios.imprimirArreglo(arreglo2);

//      // Ordenar el primer arreglo
        Arreglo arregloOrdenado = servicios.ordenarArreglo(arreglo1);
		System.out.println("ORDENAR A :");
		servicios.imprimirArreglo(arregloOrdenado);

		// Copiar los primeros 10 elementos del primer arreglo al segundo arreglo
		System.out.println("COPIAR 10 PRIMEROS ELEMENTOS DE A EN B :");
		servicios.copiarArreglo(arreglo1, arreglo2);
		servicios.imprimirArreglo(arreglo2);

        // Rellenar los 10 últimos elementos del segundo arreglo con el valor 0.5
        servicios.rellenarArreglo(arreglo2, 0.5);

		System.out.println("ARREGLOS FINALES:");
		System.out.println("ARREGLO A:");
		servicios.imprimirArreglo(arreglo1);
		System.out.println("ARREGLO B:");
		servicios.imprimirArreglo(arreglo2);
		System.out.println("Fin del programa.");
	}
}
