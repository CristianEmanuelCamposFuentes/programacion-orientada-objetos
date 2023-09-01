package Herencias.Ejercicios.Ejercicio2.Servicios;


import Herencias.Ejercicios.Ejercicio2.Entidades.Electrodomestico;

import java.util.Scanner;

public class ElectrodomesticoServices {
    public static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private static final String[] coloresDisponibles = { "blanco", "negro", "rojo", "azul","gris"};
    public static char comprobarConsumoEnergetico(char consumo) {
        if ((consumo >= 'A') && (consumo <= 'F')) {
                return consumo;
        }
        return 'F';
    }

    public static String comprobarColor(String color){
        for (String colorActual : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorActual)){
                return colorActual;
            }
        }
        return "blanco";
    }

    public static Electrodomestico crearElectrodomestico(){
        System.out.println("Ingrese el color del electrodomestico: ");
        String color = scanner.next();

        System.out.println("Ingrese el consumo energético del electrodomestico: ");
        char consumo = scanner.next().charAt(0);

        System.out.println("Ingrese el peso del electrodomestico: ");
        double peso = scanner.nextDouble();

        return new Electrodomestico(1000, color, consumo, peso);
    }

}
