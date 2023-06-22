package Actividades.actividad05.Servicios;

import Actividades.actividad05.Entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicios {
	Scanner lector = new Scanner(System.in);
	public Cuenta crearCuenta(){

		System.out.println("Ingrese el numero de cuenta: ");
		int numeroCuenta = lector.nextInt();

		System.out.println("Ingrese el DNI: ");
		long dni = lector.nextLong();

		System.out.println("Ingrese el saldo actual: ");
		int saldoActual = lector.nextInt();


		return new Cuenta(numeroCuenta,dni,saldoActual);
	}

	public void consultarDatos(Cuenta cuenta){
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDni());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

	public void consultarSaldo(Cuenta cuenta){
		System.out.println("Saldo actual: " + cuenta.getSaldoActual());
	}

	public void ingresar(double ingreso,Cuenta cuenta){
		System.out.println("Ingreso: " + ingreso);
		cuenta.setSaldoActual((int) (cuenta.getSaldoActual() + ingreso));
		System.out.println("Saldo actual: " + cuenta.getSaldoActual());
	}

	public void retirar(double retiro,Cuenta cuenta){
        if(cuenta.getSaldoActual() > retiro){
			System.out.println("No hay saldo suficiente para retirar, se retirara lo posible.");
			cuenta.setSaldoActual(0);
			System.out.println("Saldo actual: " + cuenta.getSaldoActual());
        } else {
	        System.out.println("Retiro: " + retiro);
	        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - retiro));
	        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
        }
    }

	public void extraccionRapida(Cuenta cuenta){
		System.out.println("Ingrese la cantidad a extraer: ");
		int cantidadExtraer = lector.nextInt();
		double limiteExtraccion = cuenta.getSaldoActual()* 0.2;
		if(cantidadExtraer > limiteExtraccion){
			System.out.println("No supere el 20% de su saldo actual.");
			extraccionRapida(cuenta);
		} else {
			cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - cantidadExtraer));
            System.out.println("Extraccion realizada. \n Saldo actual: " + cuenta.getSaldoActual());
		}
	}

}


