package Actividades.actividadExtra01.Servicios;

import Actividades.actividadExtra01.Entidad.Vehiculo;

import java.util.Scanner;

public class VehiculoServicios {
	public Vehiculo crearVehiculo(){
		Scanner lector = new Scanner(System.in);
		String tipo;


		System.out.println("Ingrese marca:");
		String marca = lector.nextLine();

        System.out.println("Ingrese modelo:");
		String modelo = lector.nextLine();

        System.out.println("Ingrese año:");
		int year = lector.nextInt();
		// limpiar bufer de memoria
		lector.nextLine();

		// Validacion de tipo
		do{
			System.out.println("Ingrese tipo:");
			tipo = lector.nextLine();
		} while (!tipo.equalsIgnoreCase("automovil") && !tipo.equalsIgnoreCase("motocicleta") && !tipo.equalsIgnoreCase("bicicleta"));


        return new Vehiculo(marca, modelo, year, tipo);
	}

	public int moverVehiculo(Vehiculo vehiculo, int tiempo){
		switch(vehiculo.getTipo().toLowerCase()){
			case "automovil":
                return tiempo * 3;
            case "motocicleta":
                return tiempo * 2;
			case "bicicleta":
				return tiempo;
            default:
	            System.out.println("No es un vehiculo disponible.");
				break;
		}

        return 0;
	}

	public int frenarVehiculo(Vehiculo vehiculo, int tiempo){
		switch(vehiculo.getTipo().toLowerCase()){
            case "automovil":
                return (tiempo * 3) + 2;
            case "motocicleta":
                return (tiempo * 2) + 2;
            case "bicicleta":
                return tiempo;
            default:
                System.out.println("No es un vehiculo disponible.");
                break;
        }
        return 0;
	}
}
