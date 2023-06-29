package Actividades.actividad11.ejercicio;

import Actividades.actividad11.Entidades.Fecha;
import Actividades.actividad11.Servicios.FechaServices;

import java.util.Date;

// * 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//		clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//		Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//		usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//		deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//		se puede conseguir instanciando un objeto Date con constructor vacío.
//		Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//		Ejemplo fecha actual: Date fechaActual = new Date();
public class actividad11 {
	public static void main(String[] args) {
		FechaServices servicios = new FechaServices();

		// Instancia nueva fecha
		Fecha fechaNueva = servicios.crearFecha();


		// Pasandola a Date
		System.out.println("Fecha indicada: ");
		System.out.println(servicios.convertirFecha(fechaNueva));


		// Saco la fecha actual
		Date fechaActual = new Date();
		System.out.println("Fecha actual:");
        System.out.println(servicios.convertirDate(fechaActual));


		// Mostrar cuantos años hay entre esa fecha y la fecha actual
		System.out.println("Cuantos años hay entre esa fecha y la fecha actual");
		System.out.println(servicios.calcularAnios(fechaNueva, fechaActual));
	}
}
