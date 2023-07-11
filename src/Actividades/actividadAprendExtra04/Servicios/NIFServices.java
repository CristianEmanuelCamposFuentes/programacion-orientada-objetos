package Actividades.actividadAprendExtra04.Servicios;

import Actividades.actividadAprendExtra04.Entidad.NIF;

import java.util.Scanner;

public class NIFServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public NIF crearNif(){
		// Instancio para que se pueda evaluar en el bucle do-while
		char letraCalculada;
		long documento;
		do{
			System.out.println("Ingrese el numero de documento: ");
			documento = lector.nextLong();

			// El resultado de la funcion calcular letra la almaceno en la variable
			letraCalculada = calcularLetra(documento);

			//  Valido que la variable tenga un valor, sino se vuelve a pedir el documento
		} while (!(letraCalculada == ' '));

		// Muestro el NIF
		mostrar(documento, letraCalculada);

		// Devuelvo el objeto con los valores
		return new NIF(documento, letraCalculada);

	}

	public char calcularLetra(long documento){
		// Creamos el array de caracteres
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		// Forzar a que el resultado de la division se redondee
		int resto = (int) (documento % 23);
		if (resto >= 0 && resto <= 22 ){
			return letras[resto];
		} else {
			System.out.println("El numero de DNI es incorrecto. Reintente por favor.");
			return ' ';
		}
	}

	public void mostrar(long documento, char letra){
		// Devuelvo el objeto con los valores ya formateados de la forma:
		// "%08d" 08 indica los lugares que busca tener como longitud, rellena con ceros a la izquiera si faltan numeros para llegar hasta 8 digitos.
		// %d significa que lo formatea como entero. El guion (-) es eso, literal un guion.
		// %c Indica que debe ser un caracter lo que sigue.
		System.out.printf("%08d-%c", documento, letra);
	}
}
