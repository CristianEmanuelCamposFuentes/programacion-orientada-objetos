package Colecciones.Ejercicios.EjAprendExtra1.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroServices {
	private List<Integer> numeros;

	public NumeroServices() {
		numeros = new ArrayList<>();
	}

	public void leerNumeros() {
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese valores numéricos enteros (ingrese -99 para terminar):");

		int valor;
		do {
			valor = lector.nextInt();
			if (valor != -99) {
				numeros.add(valor);
			}
		} while (valor != -99);

	}

	public int getCantidadValores() {
		return numeros.size();
	}

	public int getSumaValores() {
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}
		return suma;
	}

	public double getPromedioValores() {
		int cantidadValores = getCantidadValores();
		int suma = getSumaValores();
		return (double) suma / cantidadValores;
	}
}
