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


    public static double calcularPrecioFinal(Electrodomestico electrodomestico) {
        double precioConsumo = 0;
        double precioPeso = 0;

        // Obtener los valores de consumoEnergetico, peso y precio de la instancia de Electrodomestico
        char consumoEnergetico = electrodomestico.getConsumoEnergetico();
        double peso = electrodomestico.getPeso();
        double precio = electrodomestico.getPrecio();

        // Calcular precio basado en el consumo energético
        switch (consumoEnergetico) {
            case 'A':
                precioConsumo = 1000;
                break;
            case 'B':
                precioConsumo = 800;
                break;
            case 'C':
                precioConsumo = 600;
                break;
            case 'D':
                precioConsumo = 500;
                break;
            case 'E':
                precioConsumo = 300;
                break;
            case 'F':
                precioConsumo = 100;
                break;
        }

        // Calcular precio basado en el peso
        if (peso >= 1 && peso <= 19) {
            precioPeso = 100;
        } else if (peso >= 20 && peso <= 49) {
            precioPeso = 500;
        } else if (peso >= 50 && peso <= 79) {
            precioPeso = 800;
        } else if (peso >= 80) {
            precioPeso = 1000;
        }

        // Calcular precio final sumando ambos precios
        return precio + precioConsumo + precioPeso;
    }
}
