package Colecciones.Ejemplos.ejemplo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ejemplo2 {
	public static void main(String[] args) {
		// Listas
		ArrayList<Integer> numerosA = new ArrayList<>();
		int numeroX1 = 20;
		int numeroX2 = 30;
		int numeroX3 = 40;
		int numeroX4 = 50;
		int numeroX5 = 60;
		numerosA.add(numeroX1);
		numerosA.add(numeroX2);
		numerosA.add(numeroX3);
		numerosA.add(numeroX4);
		numerosA.add(numeroX5);
		System.out.println("ArrayList: " + numerosA);
		numerosA.remove(2); // Elimina el elemento en el índice 2
		System.out.println("ArrayList después de eliminar un elemento: " + numerosA);



		// Conjuntos : HashSet ingresa los elementos sin un orden especifico de insercion.
		HashSet<Integer> numerosB = new HashSet<>();
		Integer numeroY1 = 20;
		Integer numeroY2 = 30;
		Integer numeroY3 = 40;
		Integer numeroY4 = 50;
		Integer numeroY5 = 60;

		numerosB.add(numeroY1);
		numerosB.add(numeroY2);
		numerosB.add(numeroY3);
		numerosB.add(numeroY4);
		numerosB.add(numeroY5);

		System.out.println("HashSet: " + numerosB);
		numerosB.remove(50); // Elimina el elemento 50
		System.out.println("HashSet después de eliminar un elemento: " + numerosB);


		// LinkedHashSets mantienen el orden de insercion
		LinkedHashSet<Integer> numerosC = new LinkedHashSet<>();
		Integer numeroZ1 = 20;
		Integer numeroZ2 = 30;
		Integer numeroZ3 = 40;
		Integer numeroZ4 = 50;
		Integer numeroZ5 = 60;

		numerosC.add(numeroZ1);
		numerosC.add(numeroZ2);
		numerosC.add(numeroZ3);
		numerosC.add(numeroZ4);
		numerosC.add(numeroZ5);

		System.out.println("LinkedHashSet: " + numerosC);
		numerosC.remove(30); // Elimina el elemento 30
		System.out.println("LinkedHashSet después de eliminar un elemento: " + numerosC);


		// Mapas
		HashMap<Integer, String> alumnos = new HashMap<>();
		int dni1 = 35473891;
		String nombreAlumno1 = "Pepe";
		alumnos.put(dni1, nombreAlumno1);

		int dni2 = 28765432;
		String nombreAlumno2 = "María";
		alumnos.put(dni2, nombreAlumno2);

		int dni3 = 12345678;
		String nombreAlumno3 = "Carlos";
		alumnos.put(dni3, nombreAlumno3);
		System.out.println("HashMap: " + alumnos);
		alumnos.remove(28765432); // Elimina el alumno con DNI 28765432
		System.out.println("HashMap después de eliminar un elemento: " + alumnos);

	}
}
