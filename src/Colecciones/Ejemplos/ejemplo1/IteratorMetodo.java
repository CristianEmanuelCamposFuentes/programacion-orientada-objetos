package Colecciones.Ejemplos.ejemplo1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMetodo {
	public static void main(String[] args) {
		System.out.println("Comienzo del programa");

		// Creo la lista vacia
		ArrayList<String> listaNombres = new ArrayList<>();

		System.out.println( "       ===       ");

		// Agrego cada nombre con .add("nombre")
		listaNombres.add("Nico");
		listaNombres.add("CristianI");
		listaNombres.add("Dani");
		listaNombres.add("Javier");
		listaNombres.add("Alex");
		listaNombres.add("Genny");
		listaNombres.add("Johanna");
		listaNombres.add("CristianE");
		listaNombres.add("Nico2");

		// Creo el Iterador para recorrer la lista
		Iterator<String> iterator = listaNombres.iterator();

		System.out.println(" Elementos de la lista: ");
		System.out.println( "       ===       ");

		// El bucle while va a repetirse mientras el hasNext devuelva true, es decir,
		// mientras siga existiendo un elemento mas
		while( iterator.hasNext()){
			// Imprimo el elemento siguiente
			System.out.println( iterator.next());
		}
		System.out.println( "       ===       ");

		// Ahora borramos un alumno
		System.out.println("* Se corta la loooz *");

		// Antes de recorrer toda la lista de nuevo, tengo que volver al iterador al inicio
		// Entonces, reasigno la variable donde almacene el iterador
		iterator = listaNombres.iterator();

		System.out.println( "       ===       ");

		// Ahora si puedo recorrer la lista de nuevo
		while(iterator.hasNext()){
			if (iterator.next().equals("Nico2")){
				iterator.remove();
				System.out.println("Nico 2 se fue al lobby :C");
			}
		}

		System.out.println( "       ===       ");

		System.out.println("La lista de alumnos es:");
		for (String alumnos : listaNombres) {
			System.out.println("- " + alumnos);
		}

		System.out.println( "       ===       ");
		System.out.println("Fin del programa.");
	}
}
