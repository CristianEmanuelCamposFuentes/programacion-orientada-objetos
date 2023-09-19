package Excepciones.Ejercicios.Ejercicio2.Servicios;

import Excepciones.Ejercicios.Ejercicio2.Entidades.DiaSemana;

public class DiaSemanaServices {
    public static void imprimirDiaSemana(int indice){
        // Crear un array de enums para los dias de la semana
        DiaSemana[] diasSemana = DiaSemana.values();

        try {
            // Intentar acceder al indice fuera de rango
            DiaSemana dia = diasSemana[indice];
            System.out.println("Dia de la semana: " + dia);
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new ArrayIndexOutOfBoundsException("Error: Índice de arreglo fuera de rango.");
        }
    }
}
