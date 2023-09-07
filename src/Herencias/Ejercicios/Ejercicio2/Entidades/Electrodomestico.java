package Herencias.Ejercicios.Ejercicio2.Entidades;

import Herencias.Ejercicios.Ejercicio2.Servicios.ElectrodomesticoServices;

public class Electrodomestico {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = ElectrodomesticoServices.comprobarColor(color);
        this.consumoEnergetico = ElectrodomesticoServices.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método abstracto para calcular el precio final del electrodoméstico
    public double precioFinal(Electrodomestico electrodomestico) {
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
