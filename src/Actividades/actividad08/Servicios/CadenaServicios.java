package Actividades.actividad08.Servicios;

import Actividades.actividad08.Entidades.Cadena;

public class CadenaServicios {
	public Cadena crearCadena(){
		return new Cadena();
	}

	public void mostrarVocales(Cadena cadena) {
		int cantVocales = 0;
		String frase = cadena.getFrase().toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				cantVocales++;
			}
		}
		System.out.println("La frase tiene " + cantVocales + " vocales.");
	}

	public void invertirFrase(Cadena cadena) {
		String frase = cadena.getFrase();
		// Objeto para almacenar Strings
		StringBuilder reversed = new StringBuilder(frase).reverse();
		System.out.println("Frase invertida: " + reversed.toString());
	}

	public void vecesRepetido(String letra, Cadena cadena) {
		char c = letra.charAt(0);
		String frase = cadena.getFrase().toLowerCase();
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == c) {
				contador++;
			}
		}
		System.out.println("El carácter '" + c + "' se repite " + contador + " veces.");
	}

	public void compararLongitud(String frase,Cadena cadena) {
		int longitud = cadena.getLongitud();
		int nuevaLongitud = frase.length();
		if (longitud > nuevaLongitud) {
			System.out.println("La frase original es más larga.");
		} else if (longitud < nuevaLongitud) {
			System.out.println("La nueva frase es más larga.");
		} else {
			System.out.println("Ambas frases tienen la misma longitud.");
		}
	}

	public void unirFrases(String frase, Cadena cadena) {
		String fraseUnida = cadena.getFrase() + " " + frase;
		System.out.println("Frase resultante: " + fraseUnida);
	}

	public void reemplazar(String letra, String nuevoCaracter, Cadena cadena) {
		String frase = cadena.getFrase();
		String fraseReemplazada = frase.replace(letra, nuevoCaracter);
		System.out.println("Frase resultante: " + fraseReemplazada);
	}

	public boolean contiene(String letra, Cadena cadena) {
		String frase = cadena.getFrase().toLowerCase();
		return frase.contains(letra.toLowerCase());
	}
}
