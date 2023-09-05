package Herencias.Ejercicios.Ejercicio2.Principal;

import Herencias.Ejercicios.Ejercicio2.Servicios.ElectrodomesticoServices;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        System.out.println("Inicio del programa: ");

        ElectrodomesticoServices ES = new ElectrodomesticoServices();

        System.out.println("Fin del programa: ");
    }
}
