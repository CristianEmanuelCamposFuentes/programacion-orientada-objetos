package Colecciones.Ejercicios.Ejercicio2.Servicios;

import Colecciones.Ejercicios.Ejercicio1.Ejercicio.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PerroServicios2 {

		public ArrayList<String> razasPerros = new ArrayList<>();

		public void agregarRaza(){

			String razaNueva = Ejercicio1.lector.next();
			razasPerros.add(razaNueva);
			System.out.println(razasPerros);
		}

		public int preguntar(){
			System.out.println("Desea continuar agregando razas? SI (1) - NO (0) ");
			return Ejercicio1.lector.nextInt();
		}


		public void eliminarRaza(String raza){
			// Objeto Iterador para recorrer la lista, listaQUeVoyaRecorrer.iterador()
			Iterator<String> iterador = razasPerros.iterator();
			boolean razaEncontrada = false;

			// Condicion que verifica si hay un siguiente elemento
			while(iterador.hasNext()){
				// Creo un perrito que va a ser cada elemento dentro de la lista que voy iterando
				String perroActual = iterador.next();
				if(perroActual.equalsIgnoreCase(raza)){
					iterador.remove();
					razaEncontrada = true;
				}
			}
			// Si no se encuentra la raza
			if(!razaEncontrada){
				System.out.println("La raza no fue encontrada en la lista.");
			} else {
				System.out.println("La raza fue encontrada y eliminada correctamente.");
			}

			// Ordenamos la lista y la mostramos
			Collections.sort(razasPerros);
			System.out.println("La lista ordenada es: " + razasPerros);


		}


		@Override
		public String toString() {
			return "PerroServicios{" +
					"razasPerros=" + razasPerros +
					'}';
		}
}
