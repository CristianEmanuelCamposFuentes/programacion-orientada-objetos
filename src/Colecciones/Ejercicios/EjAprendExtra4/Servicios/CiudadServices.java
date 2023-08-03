package Colecciones.Ejercicios.EjAprendExtra4.Servicios;

import java.util.HashMap;
import java.util.Map;

public class CiudadServices {

	public Map<Integer, String> listaCiudades;

	public CiudadServices() {
		listaCiudades = new HashMap<>();
	}


	public void mostrarMenu() {
		System.out.println("Menú de opciones:\n" +
				"1. Mostrar datos introducidos\n" +
				"2. Agregar una ciudad con su código postal\n" +
				"3. Buscar ciudad por código postal\n" +
				"4. Eliminar ciudades existentes\n" +
				"5. Salir del programa\n" +
				"Ingrese el número de opción que desee: ");

	}

	public void agregarCiudadesAleatorias() {
		listaCiudades.put(28001, "Madrid");
		listaCiudades.put(8001, "Barcelona");
		listaCiudades.put(41001, "Sevilla");
		listaCiudades.put(46001, "Valencia");
		listaCiudades.put(50001, "Zaragoza");
		listaCiudades.put(3001, "Alicante");
		listaCiudades.put(20001, "San Sebastián");
		listaCiudades.put(29001, "Málaga");
		listaCiudades.put(15001, "A Coruña");
		listaCiudades.put(35001, "Las Palmas de Gran Canaria");
	}

	public void mostrarCiudades(){
		System.out.println("Ciudades del mundo:");
		for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
			System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
		}
	}
}
