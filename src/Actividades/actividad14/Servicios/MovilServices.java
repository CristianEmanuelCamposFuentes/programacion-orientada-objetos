package Actividades.actividad14.Servicios;

import Actividades.actividad14.Entidades.Movil;

import java.util.Scanner;

public class MovilServices {
	Scanner lector = new Scanner(System.in).useDelimiter("\n");
	public Movil cargarCelular(){
		// Instancia de objeto nuevo
		Movil movilNuevo = new Movil();

		System.out.println("Ingrese la marca: ");
		String marca = lector.nextLine();
		movilNuevo.setMarca(marca);

		System.out.println("Ingrese el precio:");
		int precio = lector.nextInt();
		movilNuevo.setPrecio(precio);
		// Limpiar el buffer de memoria
		lector.nextLine();

		System.out.println("Ingrese el modelo: ");
		String modelo = lector.nextLine();
		movilNuevo.setModelo(modelo);

		System.out.println("Ingrese la memoria Ram:");
		int ram = lector.nextInt();
		movilNuevo.setMemoriaRam(ram);
		// Limpiar el buffer de memoria
		lector.nextLine();

		System.out.println("Ingrese la capacidad de almacenamiento:");
		int almacenamiento = lector.nextInt();
		movilNuevo.setAlmacenamiento(almacenamiento);
		// Limpiar el buffer de memoria
		lector.nextLine();
		System.out.println("En este momento el movil es: " + movilNuevo);
		return ingresarCodigo(movilNuevo);
	}

	public Movil ingresarCodigo(Movil celular){
		System.out.println("Ingrese el codigo numerico de 7 caracteres: ");
		String codNumerico = lector.nextLine();

		for (int i = 0; i<celular.getCodigo().length; i++){

			// * Se debe pasar el valor a int porque charAt() le da el valor Unicode
			// Para pasar esto a int, se necesita primero pasarlo a String con valueOf(),
			// porque parseInt solo acepta Strings, no caracteres.
			celular.getCodigo()[i] = Integer.parseInt(String.valueOf(codNumerico.charAt(i)));
		}
		return celular;
	}
}
