package Excepciones.Ejercicios.Ejercicio2.Actividad;

import Excepciones.Ejercicios.Ejercicio2.Entidades.DiaSemana;
import Excepciones.Ejercicios.Ejercicio2.Servicios.DiaSemanaServices;

/*
* Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio del programa.");

        // Dia Jueves
        DiaSemanaServices.imprimirDiaSemana(3);

        // Error fuera de rango de dias
        DiaSemanaServices.imprimirDiaSemana(7);

        System.out.println("Fin del programa.");
    }
}
