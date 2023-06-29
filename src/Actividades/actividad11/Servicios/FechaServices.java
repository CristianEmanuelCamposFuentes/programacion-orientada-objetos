package Actividades.actividad11.Servicios;

import Actividades.actividad11.Entidades.Fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FechaServices {
	public Fecha crearFecha(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el dia: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese el mes: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese el aÑo: ");
		int anio = scanner.nextInt();
		return new Fecha(dia, mes, anio);
	}

	// Obtener la fecha actual
	public Date obtenerFecha(){
        return new Date();
    }

	public String convertirFecha(Fecha fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(fecha.getAnio() - 1900, fecha.getMes() - 1, fecha.getDia());
		return formatter.format(date);
	}

	public String convertirDate(Date fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(fecha);
	}

	public int calcularAnios(Fecha fecha1, Date fecha2) {
		int anio1 = fecha1.getAnio();
		// la advertencia es de que esta obsoleto el metodo
		int anio2 = fecha2.getYear() + 1900;
		return anio2 - anio1;
	}
}
