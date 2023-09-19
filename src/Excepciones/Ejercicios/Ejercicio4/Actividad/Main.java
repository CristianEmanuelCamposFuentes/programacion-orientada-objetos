package Excepciones.Ejercicios.Ejercicio4.Actividad;

import Excepciones.Ejercicios.Ejercicio4.Servicios.ManejoExcepcionesService;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
* */
public class Main {
    public static final Scanner lector = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) throws InputMismatchException {
        try {
            System.out.print("Ingrese un número: ");
            int numero = lector.nextInt();

            try {
                // Intentar dividir un número por cero
                double resultado = ManejoExcepcionesService.dividir(10, numero);
                System.out.println("Resultado de la división: " + resultado);
            } catch (ArithmeticException ae) {
                throw new ArithmeticException("Error aritmético: División por cero");
            }

        } catch (NumberFormatException | InputMismatchException nfe) {
            throw new InputMismatchException("Formato de numero incorrecto. ");

        } finally{
            lector.close();
        }
    }
}
