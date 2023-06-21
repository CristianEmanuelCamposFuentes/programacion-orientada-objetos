package Actividades.actividad03.Servicios;

import Actividades.actividad03.Entidades.Operacion;

import java.util.Scanner;

public class OperacionServicios{
	public Operacion crearOperacion(){
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int primerNumero = lector.nextInt();
		System.out.println("Ingrese el segundo numero");
		int segundoNumero = lector.nextInt();

		return new Operacion(primerNumero, segundoNumero);
	}

	public void mostrarObjeto(Operacion objetoIngresado){
		System.out.println("Numeros ingresados : [" + objetoIngresado.getNumero1() + "] , [" + objetoIngresado.getNumero2() + "] " );
	}

	public int suma(Operacion objetoIngresado){
		return objetoIngresado.getNumero1() + objetoIngresado.getNumero2();
	}

	public int resta(Operacion objetoIngresado){
        return objetoIngresado.getNumero1() - objetoIngresado.getNumero2();
    }

	public int multiplicacion(Operacion objetoIngresado){
		// Validacion para valores iguales a cero (0)
		if(objetoIngresado.getNumero1() == 0 || objetoIngresado.getNumero2() == 0){
            System.out.println("No se puede multiplicar por cero");
            return 0;
        }
        return objetoIngresado.getNumero1() * objetoIngresado.getNumero2();
    }

	public double division(Operacion objetoIngresado){
		// Validacion para valores iguales a cero (0)
        if(objetoIngresado.getNumero1() == 0 || objetoIngresado.getNumero2() == 0){
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return (double) objetoIngresado.getNumero1() / objetoIngresado.getNumero2();
    }
}
