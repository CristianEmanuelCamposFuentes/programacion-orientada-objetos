package Actividades.actividad10.Servicios;

import Actividades.actividad10.Entidades.Arreglo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

public class ArregloServices {
	public Arreglo crearArregloAleatorio(int dimension){
		Arreglo arreglo = new Arreglo(dimension);
		double[] numerosContador = arreglo.getNumeros();

		// Clase que le da formato a los decimales
		DecimalFormat df = new DecimalFormat("#.##",
				new DecimalFormatSymbols(Locale.US));
		// Este segundo parametro es para que utilice puntos como separacion en los numeros

		for (int i = 0; i < numerosContador.length; i++){
				double numeroAleatorio = Math.random() * 10;
				// Formatear
				String numeroFormateado = df.format(numeroAleatorio);
				// Asignar ese numero formateado convietiendolo de String a Double
				numerosContador[i] = Double.parseDouble(numeroFormateado);
			}
		return arreglo;
	}

	public Arreglo crearArregloVacio(int dimension){
		return new Arreglo(dimension);
	}

	public Arreglo ordenarArreglo(Arreglo arreglo){
        Arrays.sort(arreglo.getNumeros());
        return arreglo;
    }

	public void imprimirArreglo(Arreglo arreglo){
		System.out.println("================================================");
		System.out.println(arreglo);
		System.out.println("================================================");
	}

	public void copiarArreglo(Arreglo arregloUno, Arreglo arregloDos){
		// Recorrer 10 valores de A y los inserto en B
		for (int i = 0; i < 10; i++) {
			// Numeros que quiero agregar
			double numero = arregloUno.getNumeros()[i];

			// Tomo el valor de los elementos de B y le paso el valor de A
			arregloDos.getNumeros()[i] = numero;
		}
    }

	public void rellenarArreglo(Arreglo arreglo, double numero){
		for (int i = 10; i < arreglo.getNumeros().length; i++) {
            arreglo.getNumeros()[i] = numero;
        }
	}
}
