package Actividades.actividad11.Servicios;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {
	public Date crearFecha(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la fecha: ");
		String fecha = scanner.nextLine();

		return new Date();
	}
}
