package Herencias.Ejercicios.Ejercicio2.Servicios;

import Herencias.Ejercicios.Ejercicio2.Entidades.Televisor;

import static Herencias.Ejercicios.Ejercicio2.Principal.Main.scanner;

public class TelevisorServices extends ElectrodomesticoServices {
    public static Televisor crearTelevisor() {
        // Crear una instancia de Televisor
        Televisor televisor = new Televisor();

        // Llenar los atributos heredados de Electrodomestico utilizando el método de la clase padre
        llenarElectrodomestico(televisor);

        // Llenar los atributos propios de Televisor (resolución y sintonizador TDT)
        System.out.println("Ingrese la resolución del televisor (en pulgadas): ");
        int resolucion = scanner.nextInt();
        televisor.setResolucion(resolucion);

        System.out.println("¿Tiene sintonizador TDT? (true/false): ");
        boolean sintonizadorTDT = scanner.nextBoolean();
        televisor.setSintonizadorTDT(sintonizadorTDT);

        return televisor;
    }

    public static double precioFinal(Televisor televisor) {
        // Obtener el precio base llamando al método de la clase padre
        double precioBase = calcularPrecioFinal(televisor);

        // Aplicar aumento de precio según las condiciones específicas de Televisor
        if (televisor.getResolucion() > 40) {
            precioBase *= 1.3; // Aumentar el precio en un 30%
        }
        if (televisor.isSintonizadorTDT()) {
            precioBase += 500;
        }

        return precioBase;
    }
}
