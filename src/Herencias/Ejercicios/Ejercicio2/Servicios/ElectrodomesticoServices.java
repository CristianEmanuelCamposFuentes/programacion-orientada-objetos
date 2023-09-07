package Herencias.Ejercicios.Ejercicio2.Servicios;

import Herencias.Ejercicios.Ejercicio2.Entidades.Electrodomestico;

import static Herencias.Ejercicios.Ejercicio2.Principal.Main.scanner;

public class ElectrodomesticoServices {
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

    public static void llenarElectrodomestico(Electrodomestico electrodomestico) {
        System.out.println("Ingrese el color del electrodomestico: ");
        String color = scanner.next();

        System.out.println("Ingrese el consumo energético del electrodomestico: ");
        char consumo = scanner.next().charAt(0);

        System.out.println("Ingrese el peso del electrodomestico: ");
        double peso = scanner.nextDouble();

        // Llena los atributos del electrodomestico
        electrodomestico.setColor(comprobarColor(color));
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        electrodomestico.setPeso(peso);
    }


}
