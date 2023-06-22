package Actividades.actividadExtra01.Servicios;

import Actividades.actividadExtra01.Entidad.Vehiculo;

import java.util.Scanner;

public class VehiculoServicios {
	public Vehiculo crearVehiculo(){
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese marca:");
		String marca = lector.nextLine();

        System.out.println("Ingrese modelo:");
		String modelo = lector.nextLine();

        System.out.println("Ingrese año:");
		int year = lector.nextInt();

		System.out.println("Ingrese tipo:");
		String tipo = lector.nextLine();

        return new Vehiculo(marca, modelo, year, tipo);
	}

	public int moverVehiculo(String tipoVehiculo, int tiempo){
		switch(tipoVehiculo){
			case "auto":
                return tiempo * 3;
            case "moto":
                return tiempo * 2;
			case "bici":
				return tiempo;
            default:
	            System.out.println("No es un vehiculo disponible. Ingrese nuevamente.");
				break;
		}

	}
}
