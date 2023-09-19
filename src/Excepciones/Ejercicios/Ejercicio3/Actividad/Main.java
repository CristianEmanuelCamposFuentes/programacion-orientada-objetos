package Excepciones.Ejercicios.Ejercicio3.Actividad;

import Excepciones.Ejercicios.Ejercicio3.Entidades.Division;
import Excepciones.Ejercicios.Ejercicio3.Servicios.DivisionServices;

import java.util.Scanner;

/*
* Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
* */
public class Main {
    public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        System.out.println("Inicio del programa: ");

        System.out.println("Ingrese el primer numero: ");
        String num1 = lector.nextLine();

        System.out.println("Ingrese el segundo numero:");
        String num2 = lector.nextLine();

        try {
            Division numeros = new Division(num1, num2);
            double resultado = DivisionServices.realizarDivision(numeros);
            System.out.println("El resultado de la division es: " + resultado);
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Error: Formato de numero incorrecto");
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(iae.getMessage());
        } finally {
            // Ahorrar recursos cerrando el scanner
            lector.close();
        }
        System.out.println("Fin del programa.");
    }
}
