package Herencias.Ejercicios.Ejercicio2.Servicios;

import Herencias.Ejercicios.Ejercicio2.Entidades.Lavadora;

import static Herencias.Ejercicios.Ejercicio2.Principal.Main.scanner;

public class LavadoraServices extends ElectrodomesticoServices {
    public static Lavadora crearLavadora() {
        // Crear una instancia de Lavadora
        Lavadora lavadora = new Lavadora();

        // Llenar los atributos heredados de Electrodomestico utilizando el método de la clase padre
        llenarElectrodomestico(lavadora);

        // Llenar el atributo propio de Lavadora (carga)
        System.out.println("Ingrese la carga de la lavadora (en kg): ");
        int carga = scanner.nextInt();
        lavadora.setCarga(carga);

        return lavadora;
    }

    public double precioFinal(Lavadora lavadora) {
        // Obtener el precio base llamando al método de la clase padre
        double precioBase = super.calcularPrecioFinal(lavadora);

        // Aplicar aumento de precio si la carga es mayor a 30 kg
        if (lavadora.getCarga() > 30) {
            precioBase += 500;
        }
        return precioBase;
    }
}