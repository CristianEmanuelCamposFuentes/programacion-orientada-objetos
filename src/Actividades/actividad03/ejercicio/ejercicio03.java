package Actividades.actividad03.ejercicio;

// * 3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//		numero2. A continuación, se deben crear los siguientes métodos:
//		a) Método constructor con todos los atributos pasados por parámetro.
//		b) Metodo constructor sin los atributos pasados por parámetro.
//		c) Métodos get y set.
//		d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//		en los atributos del objeto.
//		e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//		f) Método restar(): calcular la resta de los números y devolver el resultado al main
//
//		g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//		fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//		Si no, se hace la multiplicación y se devuelve el resultado al main
//		h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//		una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//		informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

import Actividades.actividad03.Entidades.Operacion;
import Actividades.actividad03.Servicios.OperacionServicios;

public class ejercicio03 {
	public static void main(String[] args) {
		System.out.println("Comienzo del programa: ");

		// Instanciamos los servicios para obtener los metodos
		OperacionServicios SV = new OperacionServicios();

		// Iniciamos el primer objeto
		Operacion objeto = SV.crearOperacion();

		// Ahora tenemos el objeto creado con los valores que ingrese el usuario
		SV.mostrarObjeto(objeto);

		// Operacion de Suma
		int suma = SV.suma(objeto);
		System.out.println("Suma: " + suma);

		// Operacion de Resta
		int resta = SV.resta(objeto);
        System.out.println("Resta: " + resta);

        // Operacion de Multiplicación
        int multiplicacion = SV.multiplicacion(objeto);
        System.out.println("Multiplicación: " + multiplicacion);

        // Operacion de División
        double division = SV.division(objeto);
        System.out.println("División: " + division);
    }
}
