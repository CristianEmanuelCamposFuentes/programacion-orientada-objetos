package Actividades.actividadExtra01.ejercicio;
/* * EJERCICIO EXTRA01
		Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
	automóvil, una motocicleta, o una bicicleta).

	El vehículo debe tener los métodos de moverse y frenar:
		-Moverse: Es la cantidad de metros que avanzará por segundo.
		-Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
		más metros.

	Referencias:
		-Un automóvil avanza 3 metros por segundo.
		-Una motocicleta avanza 2 metros por segundo.
		-Una bicicleta avanza 1 metro por segundo.

		Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
	pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
	vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
	avanzó.*/


import Actividades.actividadExtra01.Entidad.Vehiculo;
import Actividades.actividadExtra01.Servicios.VehiculoServicios;

public class actividadExtra01 {
	public static void main(String[] args) {
	// Tiempos
	int tiempo_5seg = 5;
	int tiempo_10seg = 10;
	int tiempo_1min = 60;
	int tiempo_5min = 300;

	// Inicialización de servicios
		VehiculoServicios servicios = new VehiculoServicios();
		Vehiculo fitito = servicios.crearVehiculo();
		System.out.println(fitito);
		Vehiculo fz = servicios.crearVehiculo();
		System.out.println(fz);
		Vehiculo venzo = servicios.crearVehiculo();
		System.out.println(venzo);

	// Actividades
		System.out.println("PROCESOS EN 5 SEGUNDOS: ");
		System.out.println("Metros del vehiculo 1 en 5 segundos: ");
		System.out.println(servicios.moverVehiculo(fitito, tiempo_5seg));
		System.out.println("Metros del vehiculo 2 en 5 segundos: ");
		System.out.println(servicios.moverVehiculo(fz, tiempo_5seg));
		System.out.println("Metros del vehiculo 3 en 5 segundos: ");
		System.out.println(servicios.moverVehiculo(venzo, tiempo_5seg));

		System.out.println("PROCESOS EN 10 SEGUNDOS: ");
		System.out.println("Metros del vehiculo 1 en 10 segundos: ");
		System.out.println(servicios.moverVehiculo(fitito, tiempo_10seg));
		System.out.println("Metros del vehiculo 2 en 10 segundos: ");
		System.out.println(servicios.moverVehiculo(fz, tiempo_10seg));
		System.out.println("Metros del vehiculo 3 en 10 segundos: ");
		System.out.println(servicios.moverVehiculo(venzo, tiempo_10seg));

		System.out.println("PROCESOS EN 1 MINUTO: ");
		System.out.println("Metros del vehiculo 1 en 1 minuto: ");
		System.out.println(servicios.moverVehiculo(fitito, tiempo_1min));
		System.out.println("Metros del vehiculo 2 en 1 minuto: ");
		System.out.println(servicios.moverVehiculo(fz, tiempo_1min));
		System.out.println("Metros del vehiculo 3 en 1 minuto: ");
		System.out.println(servicios.moverVehiculo(venzo, tiempo_1min));

		System.out.println("DISTANCIA RECORRIDA DESPUES DE FRENAR A LOS 5 MINUTOS:");
		System.out.println("Metros del vehiculo1 en 5 minutos y frenar: ");
		System.out.println(servicios.frenarVehiculo(fitito, tiempo_5min));

		System.out.println("Metros del vehiculo2 en 5 minutos y frenar: ");
		System.out.println(servicios.frenarVehiculo(fz, tiempo_5min));

		System.out.println("Metros del vehiculo3 en 5 minutos y frenar: ");
		System.out.println(servicios.frenarVehiculo(venzo, tiempo_5min));




    }
}
